import com.google.gson.annotations.Expose;

public class OuterNew {

    @Expose
    private String testHack;

    @Expose
    private InnerNew innerNew;

    public String getTestHack() {
        return testHack;
    }

    public void setTestHack(String testHack) {
        this.testHack = testHack;
    }

    public InnerNew getInnerNew() {
        return innerNew;
    }

    public void setInnerNew(InnerNew innerNew) {
        this.innerNew = innerNew;
    }
}
