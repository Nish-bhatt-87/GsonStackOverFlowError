import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainSeven {
    public static void main(String[] args) {
        Nischal nischal = new Nischal("123","234");
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        String s = gson.toJson(nischal);
        System.out.println(s);

        String json  = "{'test':'avb','anotherTest':'222'}";
        Nischal nischal1 = gson.fromJson(json, Nischal.class);

        System.out.println();
    }
}
