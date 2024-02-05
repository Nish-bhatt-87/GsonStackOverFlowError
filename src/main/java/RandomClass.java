import com.google.gson.annotations.SerializedName;

public class RandomClass {

    @SerializedName(value = "hiIamHere", alternate = "test")
    //alternate is for deserialization!
    private String test;

    public RandomClass(String test) {
        this.test = test;
    }
}
