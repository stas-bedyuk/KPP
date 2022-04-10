package com.example.lab1.Validations;
import com.example.lab1.Exceptions.MyException;
import com.example.lab1.Validations.Results.Result;
import com.example.lab1.Triangle;

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

        if ( (isInt(a.side1()))) {

        } else {
            throw new MyException("BAD REQUEST ERROR 400: Side1 is invalid");
        }

        if ( (isInt(a.side2()))) {

        } else {
            throw new MyException("BAD REQUEST ERROR 400: Side2 is invalid");
        }

            if ((isInt(a.side3()))) {

            } else {
                throw new MyException("BAD REQUEST ERROR 400: Side3 is invalid");
            }

            double sq = Math.sqrt( ((a.side1()+a.side2()+a.side3())/2) * (((a.side1()+a.side2()+a.side3())/2)- a.side1()) * (((a.side1()+a.side2()+a.side3())/2)- a.side2()) * (((a.side1()+a.side2()+a.side3())/2)- a.side3()) );
            int pr = (a.side1()+a.side2()+a.side3());
        return new Result(id,sq,pr);
    }


}