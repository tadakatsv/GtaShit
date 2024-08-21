package chap1.Stratagy.Driving;

import chap1.Behavior.DrivingRoadBehavior;

public class NoDriving implements DrivingRoadBehavior {
    public void drive() {
        System.out.println("I cannot drive");
    }
}
