package chap1.example;

import chap1.Stratagy.Driving.NoDriving;
import chap1.Stratagy.FlyingShit.NoFly;
import chap1.Stratagy.SwimmingShit.SwimOnSurface;

public class Boat extends Vehicle{
    public Boat() {
        flyingBehavior = new NoFly();
        swimmingBehavior= new SwimOnSurface();
        drivingRoadBehavior = new NoDriving();
    }
}
