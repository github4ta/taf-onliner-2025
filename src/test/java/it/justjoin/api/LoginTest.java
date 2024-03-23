package it.justjoin.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {
    @Test
    @DisplayName("Check 401 Unauthorized status code")
    public void testLogin1() {
        given().body(LoginService.getBody("test@test.com", "parol111")).contentType("application/json").
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().log().all().
                statusCode(401);
    }

    @Test
    @DisplayName("POST: 422 status code- Login with empty Email field")
    public void testLogin2() {
        given().
                body(LoginService.getBody("", "parol111")).
                contentType("application/json").
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().
                statusCode(422).
                body("[0].property", equalTo("Email")).
                body("[0].error", equalTo("'Email' must not be empty."));
    }

    @Test
    @DisplayName("Login with empty password field")
    public void testLogin3() {
        given().
                contentType("application/json").
                body(LoginService.getBody("test1@test.com", "")).
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().
                statusCode(422).
                body("property[0]", equalTo("Password")).
                body("error[0]", equalTo("'Password' must not be empty."));
    }

    @Test
    @DisplayName("Login with incorrect Email and password fields")
    public void testLogin5() {
        given().
                body(LoginService.getBody("test", "parol111")).
                contentType("application/json").
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().
                statusCode(401);
    }

    @Test
    @DisplayName("Login with incorrect Email and password fields")
    public void testLogin6() {
        given().
                body(LoginService.getBody("123456", "1q2w3e4r5t")).
                contentType("application/json").
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().
                statusCode(401);
    }

    @Test
    @DisplayName("Check authorisation with non-existent user")
    public void testLogin7() {
        given().
                contentType("application/json").
                body(LoginService.getBody("test4@test.com", 1653845)).
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().
                statusCode(415);
    }

    @Test
    @DisplayName("Check 415 Unsupported Media Type")
    public void testLogin8() {
        given().
                contentType("application/json").
                body(LoginService.getBody(734635,"7t235er3")).
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().
                statusCode(415);
    }

    @Test
    @DisplayName("Авторизация без логина и пароля")
    public void testLogin10() {
        String requestBody = "{}";
        String contentType = "application/json";
        String responseBody = "[{\"property\":\"Email\",\"error\":\"'Email' must not be empty.\"},{\"property\":\"Password\",\"error\":\"'Password' must not be empty.\"}]";
        given()
                .contentType(contentType)
                .body(requestBody)
                .when()
                .post("https://profile.justjoin.it/api/justjoinit/authentication/login")
                .then()
                .statusCode(422)
                .body(equalTo(responseBody));
    }

    @DisplayName("Login with empty 'email' and 'password' values.")
    @Test
    public void testLogin4() {
        String expectedError = "[{\"property\":\"Email\",\"error\":\"'Email' must not be empty.\"}," +
                "{\"property\":\"Password\",\"error\":\"'Password' must not be empty.\"}]";

        given()
                .header("content-Type", "application/json")
                .body(LoginService.getBody("",""))
                .when()
                .post("https://profile.justjoin.it/api/justjoinit/authentication/login")
                .then()
                .statusCode(422)
                .assertThat().body(equalTo(expectedError));
    }

    @Test
    @DisplayName("POST: 415 status code- Unsupported Media Type")
    public void testLogin11() {
        given().
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().
                statusCode(415);
    }
}