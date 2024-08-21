package chap1.Stratagy.Driving;

import chap1.Behavior.DrivingRoadBehavior;

public class DrivingNormally implements DrivingRoadBehavior {
    @Override
    public void drive() {
        System.out.println("I'm driving without any problems");
    }
}
