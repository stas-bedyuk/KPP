package com.example.lab1;

import com.example.lab1.Logger.MyLogger;
import org.springframework.stereotype.Component;
import com.example.lab1.Results.Result;
import java.util.HashMap;
import org.apache.logging.log4j.Level;

@Component
public class Repository {
    private final HashMap<Triangle, Result> hashMap = new HashMap<>();

    public boolean isContain(Triangle key) {
        return hashMap.containsKey(key);
    }

    public Result addToMap(Triangle key, Result result) {
        hashMap.put(key, result);
        MyLogger.Log(Level.INFO, result + " is calculated");
        return result;
    }

    public Result getParameters(Triangle key) {

        return hashMap.get(key);
    }
}
