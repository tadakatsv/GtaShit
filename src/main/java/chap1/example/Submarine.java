package chap1.example;

import chap1.Stratagy.Driving.NoDriving;
import chap1.Stratagy.FlyingShit.NoFly;
import chap1.Stratagy.SwimmingShit.SwimUnderWaterAndOnSurface;

public class Submarine extends Vehicle{
    public Submarine() {
        flyingBehavior = new NoFly();
        swimmingBehavior= new SwimUnderWaterAndOnSurface();
        drivingRoadBehavior = new NoDriving();
    }
}
