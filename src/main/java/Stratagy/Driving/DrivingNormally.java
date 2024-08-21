package Stratagy.Driving;

import Behavior.DrivingRoadBehavior;

public class DrivingNormally implements DrivingRoadBehavior {
    @Override
    public void drive() {
        System.out.println("I'm driving without any problems");
    }
}
