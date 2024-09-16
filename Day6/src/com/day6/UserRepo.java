package com.day6;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {

    private static Map<String, String> users = new HashMap<>();


    static {
        users.put("bhAAi", "pushpa123");
        users.put("Allu Arjun", "pushparaj");
    }

    public static Map<String, String> getUsers() {
        return users;
    }
}
 