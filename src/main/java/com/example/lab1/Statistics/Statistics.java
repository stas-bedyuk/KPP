package com.example.lab1.Statistics;

import com.example.lab1.Validations.Results.Result;

import java.util.List;

public class Statistics {
    static public double calculateMediumOfResult(List<Result> resultList)
    {
        double medium = 0;
        int i=0;
        for (Result a : resultList) {
                medium +=resultList.get(i).sq();
            i++;
        }
        return (medium/i);
    }
    static public double findMinOfResult(List<Result> resultList) {
        double min = 0;
        int i=0;
        for (Result a : resultList) {
            if(min>resultList.get(i).sq())
            {
                min =resultList.get(i).sq();
            }
            i++;
        }
        return min;
    }

     static public double findMaxOfResult(List<Result> resultList) {
        double max = 0;
        int i=0;
        for (Result a : resultList) {
           if(max<resultList.get(i).sq())
           {
               max =resultList.get(i).sq();
           }
           i++;
        }
        return max;
    }
}
