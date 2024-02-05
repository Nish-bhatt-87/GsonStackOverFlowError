import com.google.gson.annotations.Expose;

public class Nischal {

    @Expose(serialize = true,deserialize = false)
    private String test;
    @Expose()
    private String anotherTest;

    public Nischal(String test, String anotherTest) {
        this.test = test;
        this.anotherTest = anotherTest;
    }
}
