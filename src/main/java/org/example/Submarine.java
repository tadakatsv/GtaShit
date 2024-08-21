package org.example;

import Stratagy.Driving.NoDriving;
import Stratagy.FlyingShit.NoFly;
import Stratagy.SwimmingShit.SwimUnderWaterAndOnSurface;

public class Submarine extends Vehicle{
    public Submarine() {
        flyingBehavior = new NoFly();
        swimmingBehavior= new SwimUnderWaterAndOnSurface();
        drivingRoadBehavior = new NoDriving();
    }
}
