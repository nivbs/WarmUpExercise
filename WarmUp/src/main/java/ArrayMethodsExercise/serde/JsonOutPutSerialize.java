package ArrayMethodsExercise.serde;

import ArrayMethodsExercise.models.OutPutMethod;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.core.JsonGenerator;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class JsonOutPutSerialize implements IOutPutSerialize {
    @Override
    public void serialize(ArrayList<OutPutMethod> outPutMethods) {
        try {
            File file = new File(String.format("D:\\Hafifot\\Bidud\\OutPut%d.txt", ThreadLocalRandom.current().nextInt()));
            file.createNewFile();
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writer().writeValue(file, outPutMethods);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
