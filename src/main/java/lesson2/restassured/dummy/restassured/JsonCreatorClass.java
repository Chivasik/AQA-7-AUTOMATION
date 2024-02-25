package lesson2.restassured.dummy.restassured;

import com.google.gson.JsonObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonCreatorClass {

    public static void main(String[] args) {
        JSONObject fullBody = new JSONObject();
        fullBody.put("id", 1234);

        JSONObject categoryObject = new JSONObject();
        categoryObject.put("id", 1234);
        categoryObject.put("name", "Dog");

        fullBody.put("category", categoryObject);
        fullBody.put("name", "Rex");

        JSONArray photoUrlArray = new JSONArray();
        photoUrlArray.add("url");
        photoUrlArray.add("url2");

        fullBody.put("photoUrls", photoUrlArray);


        JSONArray arrayTags = new JSONArray();
        JSONObject tag1 = new JSONObject();
        tag1.put("id", 3);

        System.out.println(fullBody);
    }
}
