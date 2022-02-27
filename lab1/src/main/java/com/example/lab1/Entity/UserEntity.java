package com.example.lab1.Entity;

public class UserEntity
{
    private int side1;
    private int side2;
    private int side3;
    private double sq=0;
    private int pr=0;

    public UserEntity(int side1,int side2,int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.sq=Math.sqrt(((side1+side2+side3)/2)*(((side1+side2+side3)/2)-side1)*(((side1+side2+side3)/2)-side2)*(((side1+side2+side3)/2)-side3));
        this.pr=side1 + side2 + side3;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public double getSq() {
        return sq;
    }

    public int getPr() {
        return pr;
    }
}
