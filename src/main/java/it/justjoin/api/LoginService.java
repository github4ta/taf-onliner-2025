package it.justjoin.api;

public class LoginService {
    public static final String BODY_1 = "{\n" +
            " \"email\": \"test@test.com\",\n" +
            " \"password\": \"1w1ws1we1e\"\n" +
            "}";

    public static final String BODY_2 = "{\n" +
            "    \"email\": \"\",\n" +
            "    \"password\": \"1w1ws1we1e\"\n" +
            "}";

    private static final String BODY_3 = "{\n" +
            "\"email\": \"test@test.com\",\n" +
            "\"password\": \"\"\n" +
            "}";

    public static String getBody3(){
        return BODY_3;
    }
}
