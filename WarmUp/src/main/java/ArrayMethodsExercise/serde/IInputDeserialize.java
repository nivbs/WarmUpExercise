package ArrayMethodsExercise.serde;

import ArrayMethodsExercise.models.JsonProperties;

public interface IInputDeserialize {
    JsonProperties deserialize(String path);
}
