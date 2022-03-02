package com.example.lab1.Controller;
import com.example.lab1.Triangle;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController

public class MainController {
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/triangle")
    public JSONController Enter(
            @RequestParam(value = "side1", required = true) int side1,
            @RequestParam(value = "side2", required = true) int side2,
            @RequestParam(value = "side3", required = true) int side3)
    {
        Triangle a = new Triangle(side1,side2,side3);
        return new JSONController(counter.incrementAndGet(),a.calculate1(),a.calculate2());
    }
}
