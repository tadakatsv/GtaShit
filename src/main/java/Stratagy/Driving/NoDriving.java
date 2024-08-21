package Stratagy.Driving;

import Behavior.DrivingRoadBehavior;

public class NoDriving implements DrivingRoadBehavior {
    public void drive() {
        System.out.println("I cannot drive");
    }
}
