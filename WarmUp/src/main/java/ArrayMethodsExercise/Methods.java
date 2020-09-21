package ArrayMethodsExercise;

import ArrayMethodsExercise.models.JsonProperties;
import ArrayMethodsExercise.models.OutPutMethod;
import ArrayMethodsExercise.models.OutPutMethods;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;

public class Methods {
    private int[] array;
    private String[] calcMethods;
    private HashMap<String, Function<Void, Object>> methods;

    public Methods(JsonProperties jsonProperties){
        this.array = jsonProperties.getNumbers();
        this.calcMethods = jsonProperties.getCalcMethods();
        this.methods = new HashMap() {{
            put("sum", sum());
            put("avg", avg());
            put("oddCount", oddCount());
            put("evenCount", evenCount());
            put("digitCount", digitCount());
        }};
    }

    private int sum() {
        return Arrays.stream(this.array).sum();
    }

    private double avg() {
        return sum() / array.length;
    }

    private int oddCount() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    private int evenCount() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private int digitCount() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += digitsInNumber(array[i]);
        }

        return count;
    }

    private int digitsInNumber(int number) {
        if (number / 10 == 0) {
            return 1;
        }
        return digitsInNumber(number / 10) + 1;
    }

    public ArrayList<OutPutMethod> getOutPutMethodAnswers() {
        ArrayList<OutPutMethod> outPutMethods = new ArrayList<>();
        Arrays.stream(calcMethods).forEach((calcMethod) -> outPutMethods.add(new OutPutMethod(array, calcMethod, methods.get(calcMethod))));
        return outPutMethods;
    };
}

