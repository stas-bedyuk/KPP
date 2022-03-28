package com.example.lab1.Controllers;
import com.example.lab1.Logger.MyLogger;
import com.example.lab1.Repository;
import com.example.lab1.Results.Result;
import com.example.lab1.Triangle;
import com.example.lab1.Validations.InputValidation;
import org.apache.logging.log4j.Level;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;



@RestController

public class MainController {
    private final AtomicLong counter = new AtomicLong();
    Repository rep = new Repository();
        @GetMapping("/triangle")
        public Result Enter (
        @RequestParam(value = "side1", required = true, defaultValue = "3") int side1,
        @RequestParam(value = "side2", required = true, defaultValue = "4") int side2,
        @RequestParam(value = "side3", required = true, defaultValue = "5") int side3)
        {
            Triangle ThisTriangle = new Triangle(side1, side2, side3);
            if(rep.isContain(ThisTriangle)) {
                MyLogger.Log(Level.INFO,  "This Triangle is already in the chache");
                return rep.getParameters(ThisTriangle);
            }
            else {
                MyLogger.Log(Level.INFO,  "This Triangle is added in the chache");
                return rep.addToMap(ThisTriangle,InputValidation.optionsValidation(counter.incrementAndGet(),ThisTriangle));
            }
        }
}
