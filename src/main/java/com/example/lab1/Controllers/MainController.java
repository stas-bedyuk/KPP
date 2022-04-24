package com.example.lab1.Controllers;
import com.example.lab1.Logger.MyLogger;
import com.example.lab1.Repository;
import com.example.lab1.Validations.Results.Result;
import com.example.lab1.Triangle;
import com.example.lab1.Validations.InputValidation;
import org.apache.logging.log4j.Level;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController

public class MainController {
    private final AtomicLong counter = new AtomicLong();
    RequestCounterController NumberOfRequests = new RequestCounterController();
    Repository rep = new Repository();
        @GetMapping("/triangle")
        public Result Enter (
        @RequestParam(value = "side1", required = true, defaultValue = "3") int side1,
        @RequestParam(value = "side2", required = true, defaultValue = "4") int side2,
        @RequestParam(value = "side3", required = true, defaultValue = "5") int side3)
        {
            NumberOfRequests.IncremetNumber();
            Triangle ThisTriangle = new Triangle(side1, side2, side3);
            MyLogger.Log(Level.INFO,  "Successfully getMapping");
            if(rep.isContain(ThisTriangle)) {
                MyLogger.Log(Level.INFO,  "This Triangle is already in the chache");
                return rep.getParameters(ThisTriangle);
            }
            else {
                MyLogger.Log(Level.INFO,  "This Triangle is added in the chache");
                return  rep.addToMap(ThisTriangle,InputValidation.optionsValidation(counter.incrementAndGet(),ThisTriangle));
            }
        }

    @PostMapping("/triangleStream")
    public List<Result> EnterStream(@Valid @RequestBody List<Triangle> bodyList){

        NumberOfRequests.IncremetNumber();
        List<Result> resultList = new LinkedList<>();
        bodyList.forEach((currentElement) -> {
            try {
                resultList.add(InputValidation.optionsValidation(counter.incrementAndGet(),currentElement));
            } catch (IllegalArgumentException e) {
                MyLogger.Log(Level.INFO,  "Error getMapping");
            }
        });
        MyLogger.Log(Level.INFO,  "Successfully getMapping");
        return resultList;
    }
}
