package chap1.Stratagy.Driving;

import chap1.Behavior.DrivingRoadBehavior;

public class DrivingNotOnRoad implements DrivingRoadBehavior {
    @Override
    public void drive() {
        System.out.println("I'm driving, but not on road");
    }
}
