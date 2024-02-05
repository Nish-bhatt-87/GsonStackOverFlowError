import com.google.gson.Gson;

public class MainAgain {
    public static void main(String[] args) {

        serializeUserNested();
        deserializeUserNested();
    }

    private static void deserializeUserNested() {
        String json = "{\"name\":\"normal\",\"email\":\"2@2.com\",\"age\":23,\"isDeveloper\":true,\"userAddress\":{\"street\":\"Main Street\",\"houseNumber\":\"42A\",\"city\":\"Magdeburg\",\"country\":\"Singapira\"}}";

        Gson gson = new Gson();
        UserNested userNested = gson.fromJson(json, UserNested.class);
        System.out.println(userNested);
    }

    private static void serializeUserNested() {
        UserAddress userAddress = new UserAddress("Main Street","42A","Magdeburg","Germany");

        UserNested userNested = new UserNested("normal","2@2.com",23,true,userAddress);

        Gson gson = new Gson();
        String s = gson.toJson(userNested);
        System.out.println(s);


    }


}
