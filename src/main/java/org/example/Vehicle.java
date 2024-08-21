package org.example;


import Behavior.DrivingRoadBehavior;
import Behavior.FlyingBehavior;
import Behavior.SwimmingBehavior;



public abstract class Vehicle {
    DrivingRoadBehavior drivingRoadBehavior;
    FlyingBehavior flyingBehavior;
    SwimmingBehavior swimmingBehavior;
    public void performFly() {
        flyingBehavior.fly();
    }
    public void performSwim() {
        swimmingBehavior.swim();
    }
    public void performDriving() {
        drivingRoadBehavior.drive();
    }
}
