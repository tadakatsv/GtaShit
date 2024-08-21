package org.example;

import Stratagy.Driving.DrivingNotOnRoad;
import Stratagy.FlyingShit.FlyNormally;
import Stratagy.SwimmingShit.ImmediateExplosion;

public class Plane extends Vehicle{
    public Plane() {
        flyingBehavior = new FlyNormally();
        swimmingBehavior = new ImmediateExplosion();
        drivingRoadBehavior = new DrivingNotOnRoad();
    }
}
