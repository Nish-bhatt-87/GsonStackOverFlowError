import com.google.gson.Gson;

public class StackOverflowErrorClassFix {
    public static void main(String[] args) {

        Outer outer = new Outer();

        Inner inner = new Inner();
        inner.setTestSecond("secondTest!");
        inner.setOuter(outer);

        outer.setAnotherTest("anothertest");
        outer.setTest("firsttest");
        outer.setInner(inner);

        //the above is a representation of the entity classes that have references to each other

        //below is a representation of a dto and how it solves the stackoverflow error
        OuterDto outerDto= new OuterDto();
        InnerDto innerDto= new InnerDto();
        innerDto.setTestSecond("secondTestBro!");

        outerDto.setAnotherTest("another test!");
        outerDto.setTest("testing!");
        outerDto.setInnerDto(innerDto);


        Gson gson = new Gson();
        System.out.println("still here");
        String s = gson.toJson(outerDto);
        System.out.println(s);
        System.out.println("now here!");
    }
}
