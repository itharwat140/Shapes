package com.company;

public class Main {

    public static void main(String[] args) {
        int width = Math.toIntExact(Math.round(Math.random()*9+1));
        //int height = Math.toIntExact(Math.round(Math.random()*9+1));
        double r = Math.random()*9+1;
        System.out.println(r);
        long r2 = Math.round(r);
        System.out.println(r2);
        int height = Math.toIntExact(r2);
        System.out.println(height);


        Shape rect = new Rectangle( width,  height);
	    System.out.println(rect.getArea() + " " + rect.getCircumference());
        /*Shape tri = new Triangle( 5,6,7);
        System.out.println(tri.getArea() + " " + tri.getCircumference());*/
        /*double d = 3.3 + 3.3 + 3.3;
        System.out.println(Math.floor(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.round(d));
        System.out.println(Math.PI);
        System.out.println(Math.max(5,9));*/
        /*long diceRoll = Math.round(Math.random()*5 + 1);
        System.out.println(diceRoll);*/
    }
}
