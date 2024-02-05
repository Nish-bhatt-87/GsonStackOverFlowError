import com.google.gson.*;

public class StackOverflowErrorClassNoNeedDto {
    public static void main(String[] args) {

          InnerNew innerNew = new InnerNew();
          OuterNew outerNew = new OuterNew();

          outerNew.setTestHack("testHack");

          innerNew.setAnotherTestbro("another!");
          innerNew.setTestbro("test bro!");
          innerNew.setOuterNew(outerNew);

          outerNew.setInnerNew(innerNew);

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        String s = gson.toJson(outerNew);
        System.out.println(s);

    }
}

// this bloody class below is not used, but just put here la no hard
class OuterSerializer implements JsonDeserializer<Outer> {
    @Override
    public Outer deserialize(JsonElement json, java.lang.reflect.Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return context.deserialize(json, Outer.class);
    }
}
