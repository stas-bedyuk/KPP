package com.example.lab1.Controllers;
import com.example.lab1.Exceptions.MyException;
import com.example.lab1.Results.Result;
import com.example.lab1.Triangle;
import com.example.lab1.Validations.InputValidation;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;



@RestController

public class MainController {
    private final AtomicLong counter = new AtomicLong();
        @GetMapping("/triangle")
        public Result Enter (
        @RequestParam(value = "side1", required = true, defaultValue = "3") int side1,
        @RequestParam(value = "side2", required = true, defaultValue = "4") int side2,
        @RequestParam(value = "side3", required = true, defaultValue = "5") int side3)
        {
            Triangle a = new Triangle(side1, side2, side3);
            return InputValidation.optionsValidation(counter.incrementAndGet(),a);
        }


}
