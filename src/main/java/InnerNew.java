import com.google.gson.annotations.Expose;

import java.beans.Transient;

public class InnerNew {

    @Expose
    private String testbro;
    @Expose
    private String anotherTestbro;

    private OuterNew OuterNew;

    public String getTestbro() {
        return testbro;
    }

    public void setTestbro(String testbro) {
        this.testbro = testbro;
    }

    public String getAnotherTestbro() {
        return anotherTestbro;
    }

    public void setAnotherTestbro(String anotherTestbro) {
        this.anotherTestbro = anotherTestbro;
    }

    public OuterNew getOuterNew() {
        return OuterNew;
    }

    public void setOuterNew(OuterNew outerNew) {
        OuterNew = outerNew;
    }
}
