package org.example;

import Stratagy.Driving.NoDriving;
import Stratagy.FlyingShit.NoFly;
import Stratagy.SwimmingShit.SwimOnSurface;

public class Boat extends Vehicle{
    public Boat() {
        flyingBehavior = new NoFly();
        swimmingBehavior= new SwimOnSurface();
        drivingRoadBehavior = new NoDriving();
    }
}
