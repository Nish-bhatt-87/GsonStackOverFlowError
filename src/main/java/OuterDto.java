public class OuterDto {

    private String test;
    private String anotherTest;

    private InnerDto innerDto;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getAnotherTest() {
        return anotherTest;
    }

    public void setAnotherTest(String anotherTest) {
        this.anotherTest = anotherTest;
    }

    public InnerDto getInnerDto() {
        return innerDto;
    }

    public void setInnerDto(InnerDto innerDto) {
        this.innerDto = innerDto;
    }
}
