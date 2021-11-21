package com.gtrxone;

public class Main {

    public static void main(String[] args) {
	Point point = new Point(6,5);
    Point point1 = new Point(3,1);
        System.out.println("distance(0,0) ="+point.distance());
        System.out.println("distance(pint1) ="+point1.distance(point1));
    }
}
