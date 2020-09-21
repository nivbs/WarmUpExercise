package ArrayMethodsExercise.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@AllArgsConstructor
public class OutPutMethod {
    private int[] numbers;
    private String method;
    private Object answer;
}
