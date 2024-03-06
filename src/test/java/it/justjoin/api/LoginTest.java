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

    @Test
    @DisplayName("Login with empty password field")
    public void testLogin3() {
        String body = "{\n" +
                "\"email\": \"test@test.com\",\n" +
                "\"password\": \"\"\n" +
                "}";
        given().
                contentType("application/json").
                body(body).
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().
                statusCode(422).
                body("property[0]", equalTo("Password")).
                body("error[0]", equalTo("'Password' must not be empty."));
    }

    @Test
    @DisplayName("Login with incorrect Email and password fields")
    public void testLogin5(){
        String body = "{\n" +
                "\"email\": \"test\",\n" +
                "\"password\": \"1q2w3e4r5t\"\n" +
                "}";
        given().
                body(body).
                contentType("application/json").
        when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
        then().
                statusCode(401);
    }
    @Test
    @DisplayName("Login with incorrect Email and password fields")
    public void testLogin6(){
        String body = "{\n" +
                "\"email\": \"123456\",\n" +
                "\"password\": \"1q2w3e4r5t\"\n" +
                "}";
        given().
                body(body).
                contentType("application/json").
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().
                statusCode(401);
    }
    @Test
    @DisplayName("Check authorisation with non-existent user")
    public void testLogin7() {
        String body = "{\n" +
                "\"email\": \"test@test.com\",\n" +
                "\"password\": 1234567\"}";
        given().
                contentType("application/json").
                body(body).
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().
                statusCode(415);
    }

    @Test
    @DisplayName("Check 415 Unsupported Media Type")
    public void testLogin9() {
        String body = "{\n" +
                "    \"email\": \"test@test.com\",\n" +
                "    \"password\": \"1w1ws1we1e\"\n" +
                "}";
        given().
                contentType("application/json").
                body(body).
                when().
                post("https://profile.justjoin.it/api/justjoinit/authentication/login").
                then().
                statusCode(415);
    }

    @Test
    @DisplayName("Авторизация без логина и пароля")
    public void testLogin10(){
        String requestBody="{}";
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
                .body("{\n" +
                        "    \"email\": \"\",\n" +
                        "    \"password\": \"\"\n" +
                        "}")
                .when()
                .post("https://profile.justjoin.it/api/justjoinit/authentication/login")
                .then()
                .statusCode(422)
                .assertThat().body(equalTo(expectedError));
    }

    @Test
    @DisplayName("415 Unsupported Media Type (text/plain)")
    public void testLogin11(){
        String BASE_URL = "https://profile.justjoin.it";
        String email = "testtest3@test.com";
        String password = "password1";
        String body = email + "\n" + password;

        given()
                .contentType("text/plain")
                .body(body)
                .when()
                .post(BASE_URL + "/api/justjoinit/authentication/login")
                .then()
                .statusCode(415);
    }

}