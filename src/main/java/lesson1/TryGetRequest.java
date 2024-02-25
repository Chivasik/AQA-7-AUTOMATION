package lesson1;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TryGetRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";
//        given()
//                .when()
//                .get("/api/users/2")
//                .then()
//                .statusCode(200)
//                .contentType(ContentType.JSON);
        Response response = RestAssured.get("/api/users?page=2");
        String responseString = response.getBody().asString();
        System.out.println(responseString);

        JsonObject jsonObjectResponse = JsonParser.parseString(responseString).getAsJsonObject();
        int generalCountOfUsers = jsonObjectResponse.get("total").getAsInt();
        System.out.println("Amount of users is: " + generalCountOfUsers);

        JsonArray arrayListOfUsers = jsonObjectResponse.get("data").getAsJsonArray();
        //System.out.println(arrayListOfUsers.get(1).toString());
        JsonObject user7 = arrayListOfUsers.get(0).getAsJsonObject();
        System.out.println(user7.toString());
        String firstName = user7.get("first_name").getAsString();
        String lastName = user7.get("last_name").getAsString();
        int id = user7.get("id").getAsInt();
        System.out.println("Id of user is: " + id);
        System.out.println("First name is " + firstName);
        System.out.println("Last name is " + lastName);



    }
}
