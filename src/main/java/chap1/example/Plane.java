package chap1.example;

import chap1.Stratagy.Driving.DrivingNotOnRoad;
import chap1.Stratagy.FlyingShit.FlyNormally;
import chap1.Stratagy.SwimmingShit.ImmediateExplosion;

public class Plane extends Vehicle{
    public Plane() {
        flyingBehavior = new FlyNormally();
        swimmingBehavior = new ImmediateExplosion();
        drivingRoadBehavior = new DrivingNotOnRoad();
    }
}
