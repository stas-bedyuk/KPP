package com.example.lab1.Validations.Results;


public record Result(long id, double sq, int pr) {
    @Override
    public long id() {
        return id;
    }

    @Override
    public double sq() {
        return sq;
    }

    @Override
    public int pr() {
        return pr;
    }
}
