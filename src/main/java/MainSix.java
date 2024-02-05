import com.google.gson.Gson;

public class MainSix {
    public static void main(String[] args) {

        RandomClass randomClass = new RandomClass("test");
        Gson gson = new Gson();
        String s = gson.toJson(randomClass);
        System.out.println(s);

        String userJ = "{'test':'reer'}";

        RandomClass randomClass1 = gson.fromJson(userJ, RandomClass.class);

        System.out.println("test");
    }
}
