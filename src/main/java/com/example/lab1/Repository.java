package com.example.lab1;

import org.springframework.stereotype.Component;
import com.example.lab1.Results.Result;
import java.util.HashMap;

@Component
public class Repository {
    private final HashMap<Triangle, Result> hashMap = new HashMap<>();

    public boolean isContain(Triangle key) {
        return hashMap.containsKey(key);
    }

    public Result addToMap(Triangle key, Result result) {
        hashMap.put(key, result);
        return result;
    }

    public Result getParameters(Triangle key) {

        return hashMap.get(key);
    }
}
