package ArrayMethodsExercise.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//TODO: change the name
public class JsonProperties {
    private int[] numbers;
    private String[] calcMethods;
}
