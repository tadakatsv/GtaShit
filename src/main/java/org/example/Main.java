package org.example;

public class Main {
    public static void main(String[] args) {
        Car mazzerati = new Car();
        mazzerati.performDriving();
        mazzerati.performFly();
        mazzerati.performSwim();

        Boat yachtaPatriarhaKirilla = new Boat();
        yachtaPatriarhaKirilla.performDriving();
        yachtaPatriarhaKirilla.performFly();
        yachtaPatriarhaKirilla.performSwim();

        Plane Boeing_737 = new Plane();
        Boeing_737.performDriving();
        Boeing_737.performFly();
        Boeing_737.performSwim();

        Submarine kursk = new Submarine();
        kursk.performDriving();
        kursk.performFly();
        kursk.performSwim();
    }
}