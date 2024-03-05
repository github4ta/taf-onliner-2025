package it.justjoin.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class LoginTest {
    @Test
    @DisplayName("Check 401 Unauthorized status code")
    public void testLogin1() {
        String body = "{\n" +
                " \"email\": \"test@test.com\",\n" +
                " \"password\": \"1w1ws1we1e\"\n" +
                "}";
        given().body(body).contentType("application/json").
                when().
                    post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().log().all().
                    statusCode(401);
    }
}
