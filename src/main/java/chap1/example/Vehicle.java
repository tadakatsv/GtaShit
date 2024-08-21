package chap1.example;


import chap1.Behavior.DrivingRoadBehavior;
import chap1.Behavior.FlyingBehavior;
import chap1.Behavior.SwimmingBehavior;


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
