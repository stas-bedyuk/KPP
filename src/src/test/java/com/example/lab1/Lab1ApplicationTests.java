package com.example.lab1;

import com.example.lab1.Controllers.MainController;
import com.example.lab1.Exceptions.MyException;
import com.example.lab1.Validations.Results.Result;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Lab1ApplicationTests {
    private final MainController test = new MainController();

    @Test
    void testCalculatePr() throws MyException {
        Result a = test.Enter(3, 4, 5);
        int pr = 12;
        assertEquals(pr, a.pr());
    }
    @Test
    void testCalculateSq() throws MyException {
        Result a = test.Enter(3, 4, 5);
        int sq = 6;
        assertEquals(sq, a.sq());
    }
}
