import com.google.gson.Gson;

public class StackOverflowErrorClass {
    public static void main(String[] args) {

        Outer outer = new Outer();

        Inner inner = new Inner();
        inner.setTestSecond("secondTest!");
        inner.setOuter(outer);

        outer.setAnotherTest("anothertest");
        outer.setTest("firsttest");
        outer.setInner(inner);

        Gson gson = new Gson();
        System.out.println("still here");
        String s = gson.toJson(outer);
        System.out.println("now here!");
    }
}
