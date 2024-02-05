import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainFive {
    public static void main(String[] args) {
        serializeUserSimple();
    }

    private static void serializeUserSimple() {
        UserSimple userSimple =
                new UserSimple("Norman","no@no.com",25,null);

        Gson gson = new Gson();
        String json = gson.toJson(userSimple);
        System.out.println(json); // isDeveloper is missing

        gson = new GsonBuilder().serializeNulls().create();
        String json2 = gson.toJson(userSimple);
        System.out.println(json2);
    }


}
