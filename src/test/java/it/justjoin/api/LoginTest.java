package it.justjoin.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

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

    @Test
    @DisplayName("Login with empty Email field")

    public void testLogin2() {

        String bodyLogin2 = "{\n" +
                "    \"email\": \"\",\n" +
                "    \"password\": \"1w1ws1we1e\"\n" +
                "}";
        given().
                body(bodyLogin2).
                contentType("application/json").
        when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
        then().
                statusCode(422).
                body("[0].property", equalTo("Email")).
                body("[0].error", equalTo("'Email' must not be empty."));
    }
}
