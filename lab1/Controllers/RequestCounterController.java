package com.example.lab1.Controllers;

import com.example.lab1.Logger.MyLogger;
import org.apache.logging.log4j.Level;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestCounterController {
    static int NumberOfRequests = 0;
    synchronized public void IncremetNumber(){
        NumberOfRequests++;
        MyLogger.Log(Level.INFO,  "Counter increment");
    }

    @GetMapping(value = "/counter")
    synchronized public String getCounter() {
        MyLogger.Log(Level.INFO,  "Successfully getMapping");
        return NumberOfRequests + " requests have been completed";
    }
}