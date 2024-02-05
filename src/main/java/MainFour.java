import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainFour {
    public static void main(String[] args) {
        String founderJson = "[{'name': 'Christian','flowerCount': 1}, {'name': 'Marcus', 'flowerCount': 3}, {'name': 'Norman', 'flowerCount': 2}]";

        Founder[] founder = new Gson().fromJson(founderJson, Founder[].class);
        System.out.println(founder);
        //use debug to see the values;

        Type founderListType = new TypeToken<List<Founder>>(){}.getType();

        List<Founder> founders = new Gson().fromJson(founderJson,founderListType);

        System.out.println("te");

        String generalInfoJson = "{'name': 'Future Studio Dev Team', 'website': 'https://futurestud.io', 'founders': [{'name': 'Christian', 'flowerCount': 1 }, {'name': 'Marcus','flowerCount': 3 }, {'name': 'Norman','flowerCount': 2 }]}";

        GeneralInfo generalInfo = new Gson().fromJson(generalInfoJson, GeneralInfo.class);


        System.out.println("test");
    }
}
