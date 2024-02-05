import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to gson 01 - getting started!");


        serializeUserSimple();
        deserializeUserSimple();
    }

    private static void deserializeUserSimple() {
        String userJson = "{'age':26,'email':'nishb@nmish.com','isDeveloper':true,'name':'hi'}";
        Gson gson = new Gson();
        UserSimple userSimple = gson.fromJson(userJson, UserSimple.class);

        System.out.println(userSimple);
    }

    private static void serializeUserSimple() {
        UserSimple user = new UserSimple("Norman","nish@nish.com",38, true);
        Gson gson = new Gson();
        String s = gson.toJson(user);

    }
}
