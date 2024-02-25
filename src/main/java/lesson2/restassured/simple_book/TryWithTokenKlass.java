package lesson2.restassured.simple_book;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TryWithTokenKlass {

    public static final String token = "26247161a0f0ee3e50d101ce1531fe818719b2eea3100ba669556e60baea0c5c";

    public static void main(String[] args) {
        RestAssured.baseURI = "https://simple-books-api.glitch.me";
        String requestBody = "{\"bookId\": 1, \"customerName\": \"Nakan\"}";
        Response response = given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/orders/");

        System.out.println(response.getBody().asString());
    }

}
