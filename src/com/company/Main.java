package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle( 5,  6);
	    System.out.println(rect.getArea() + " " + rect.getCircumference());
        Shape tri = new Triangle( 5,6,7);
        System.out.println(tri.getArea() + " " + tri.getCircumference());
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
