package org.example;

import Stratagy.Driving.DrivingNormally;
import Stratagy.FlyingShit.NoFly;
import Stratagy.SwimmingShit.OnlySinking;

public class Car extends Vehicle{
    public Car() {
        flyingBehavior = new NoFly();
        swimmingBehavior= new OnlySinking();
        drivingRoadBehavior=new DrivingNormally();
    }
}
