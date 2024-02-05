import java.util.List;

public class RestaurantList {
    String name;

    List<RestaurantMenuItem> items;

    public RestaurantList(String name, List<RestaurantMenuItem> items) {
        this.name = name;
        this.items = items;
    }

    public static class RestaurantMenuItem {
        String name;
        float price;



        public RestaurantMenuItem(String name, float price) {
            this.name = name;
            this.price = price;
        }
    }
}
