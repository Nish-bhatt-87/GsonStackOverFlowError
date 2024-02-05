import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainFinal {

    public static void main(String[] args) {

        serializeRestaurant();
    }

    private static void serializeRestaurant() {
        List<RestaurantList.RestaurantMenuItem> menuItems= new ArrayList<>();
        menuItems.add(new RestaurantList.RestaurantMenuItem("steak",20f));
        menuItems.add(new RestaurantList.RestaurantMenuItem("steak1",21f));
        menuItems.add(new RestaurantList.RestaurantMenuItem("steak2",22f));
        menuItems.add(new RestaurantList.RestaurantMenuItem("steak3",23f));

        RestaurantList hi = new RestaurantList("hi", menuItems);

        String s = new Gson().toJson(hi);

        String s1 = new Gson().toJson(menuItems);

        System.out.println(s);
        System.out.println(s1); //array is the root object
    }



}
