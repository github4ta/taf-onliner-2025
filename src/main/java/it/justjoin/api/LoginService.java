package it.justjoin.api;

import java.util.HashMap;
import java.util.Map;

public class LoginService {
    public final static String URL = "https://profile.justjoin.it/api/justjoinit/authentication/login";

    public static String getBody(String email, String password) {
        return String.format("{\n" +
                "\"email\": \"%s\",\n" +
                "\"password\": \"%s\"\n" +
                "}", email, password);
    }

    public static String getBody(String email, int password) {
        return String.format("{\n" +
                "\"email\": \"%s\",\n" +
                "\"password\": %n\n" +
                "}", email, password);
    }

    public static String getBody(int email, String password) {
        return String.format("{\n" +
                "\"email\": %n,\n" +
                "\"password\": \"%s\"\n" +
                "}", email, password);
    }
    public static Map<String ,String> getHeaders(){
        Map<String,String> headers = new HashMap<>();
        headers.put("content-type", "application/json");
        return headers;
    }


}