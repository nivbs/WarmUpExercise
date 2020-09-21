package ArrayMethodsExercise.serde;

import ArrayMethodsExercise.models.JsonProperties;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.core.JsonParseException;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.JsonMappingException;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonInputDeserialize implements IInputDeserialize{

    @Override
    public JsonProperties deserialize(String path) {
        try {
            return new ObjectMapper().readValue(new File("D:\\Hafifot\\Bidud\\Example.txt"), JsonProperties.class);
        }
        catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
