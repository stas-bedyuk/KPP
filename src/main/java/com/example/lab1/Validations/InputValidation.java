package com.example.lab1.Validations;
import com.example.lab1.Exceptions.MyException;
import com.example.lab1.Results.Result;
import com.example.lab1.Triangle;

import java.util.concurrent.atomic.AtomicLong;

public class InputValidation {

    public static boolean isInt(int s) {
        try {
            if (s > 0) return true;
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }

    public static Result optionsValidation(long id, Triangle a) {

        if ( (isInt(a.getSide1()))) {

        } else {
            throw new MyException("BAD REQUEST ERROR 400: Side1 is invalid");
        }

        if ( (isInt(a.getSide2()))) {

        } else {
            throw new MyException("BAD REQUEST ERROR 400: Side2 is invalid");
        }

            if ((isInt(a.getSide3()))) {

            } else {
                throw new MyException("BAD REQUEST ERROR 400: Side3 is invalid");
            }

            double sq = Math.sqrt(((a.getSide1()+a.getSide2()+a.getSide3())/2)*(((a.getSide1()+a.getSide2()+a.getSide3())/2)- a.getSide1())*(((a.getSide1()+a.getSide2()+a.getSide3())/2)- a.getSide2())*(((a.getSide1()+a.getSide2()+a.getSide3())/2)- a.getSide3()));
            int pr = a.getSide1()+a.getSide2()+a.getSide3();
        return new Result(id,sq,pr);
    }


}