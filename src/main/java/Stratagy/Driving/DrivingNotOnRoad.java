package Stratagy.Driving;

import Behavior.DrivingRoadBehavior;

public class DrivingNotOnRoad implements DrivingRoadBehavior {
    @Override
    public void drive() {
        System.out.println("I'm driving, but not on road");
    }
}
