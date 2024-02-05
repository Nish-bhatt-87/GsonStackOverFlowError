import com.google.gson.Gson;

public class MainThree {
    public static void main(String[] args) {
        String restaurantJson = "{ 'name':'Future Studio Steak House', 'owner':{ 'name':'Christian', 'address':{ 'city':'Magdeburg', 'country':'Germany', 'houseNumber':'42', 'street':'Main Street'}},'cook':{ 'age':18, 'name': 'Marcus', 'salary': 1500 }, 'waiter':{ 'age':18, 'name': 'Norman', 'salary': 1000}}";
        Gson gson = new Gson();
        Restaurant restaurant = gson.fromJson(restaurantJson, Restaurant.class);
        //debug to stop at above
        System.out.println("test");
    }
}
