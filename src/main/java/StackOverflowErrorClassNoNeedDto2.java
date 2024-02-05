import com.google.gson.*;

public class StackOverflowErrorClassNoNeedDto2 {
    public static void main(String[] args) {

          InnerNewTwo innerNewTwo = new InnerNewTwo();
          innerNewTwo.setTest("test11111111111");

          OuterNewTwo outerNewTwo = new OuterNewTwo();
          outerNewTwo.setTest2("test2222222222");

          innerNewTwo.setOuterNewTwo(outerNewTwo);
          outerNewTwo.setInnerNewTwo(innerNewTwo);

        ExclusionStrategy exclusionStrategy = new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes f) {
                //return f.getName().equals("outerNewTwo2");
                return f.getName().equals("outerNewTwo");
            }

            @Override
            public boolean shouldSkipClass(Class<?> clazz) {
                return false;
            }
        };

        Gson gson = new GsonBuilder()
                .setExclusionStrategies(exclusionStrategy)
                .create();

        String s = gson.toJson(outerNewTwo);
        System.out.println(s);
        System.out.println(s);

    }
}

