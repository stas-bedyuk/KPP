package com.example.lab1.Controllers;
import com.example.lab1.Repository;
import com.example.lab1.Results.Result;
import com.example.lab1.Triangle;
import com.example.lab1.Validations.InputValidation;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;



@RestController

public class MainController {
    private final AtomicLong counter = new AtomicLong();
    Repository rep = new Repository();
        @GetMapping("/triangle")
        public Result Get (
        @RequestParam(value = "side1", required = true, defaultValue = "3") int side1,
        @RequestParam(value = "side2", required = true, defaultValue = "4") int side2,
        @RequestParam(value = "side3", required = true, defaultValue = "5") int side3)
        {
            Triangle ThisTriangle = new Triangle(side1, side2, side3);
            return rep.getParameters(ThisTriangle);
        }
    @GetMapping("/chache")
    public Result Enter (
            @RequestParam(value = "side1", required = true) int side1,
            @RequestParam(value = "side2", required = true) int side2,
            @RequestParam(value = "side3", required = true) int side3)
    {
        Triangle ThisTriangle = new Triangle(side1, side2, side3);
            return rep.addToMap(ThisTriangle,InputValidation.optionsValidation(counter.incrementAndGet(),ThisTriangle));
    }

}
