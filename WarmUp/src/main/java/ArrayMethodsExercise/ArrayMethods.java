package ArrayMethodsExercise;

import ArrayMethodsExercise.models.JsonProperties;
import ArrayMethodsExercise.models.OutPutMethod;
import ArrayMethodsExercise.serde.IInputDeserialize;
import ArrayMethodsExercise.serde.IOutPutSerialize;
import ArrayMethodsExercise.serde.JsonInputDeserialize;
import ArrayMethodsExercise.serde.JsonOutPutSerialize;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayMethods {

    public static void main(String[] args) throws IOException {
        IInputDeserialize inputDeserialize = new JsonInputDeserialize();
        IOutPutSerialize outPutSerialize = new JsonOutPutSerialize();
        JsonProperties jsonProperties = inputDeserialize.deserialize("D:\\Hafifot\\Bidud\\Example.txt");
        ArrayList<OutPutMethod> outPutMethods = new Methods(jsonProperties).getOutPutMethodAnswers();
        outPutSerialize.serialize(outPutMethods);
    }
}
