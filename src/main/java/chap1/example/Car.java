package chap1.example;

import chap1.Stratagy.Driving.DrivingNormally;
import chap1.Stratagy.FlyingShit.NoFly;
import chap1.Stratagy.SwimmingShit.OnlySinking;

public class Car extends Vehicle{
    public Car() {
        flyingBehavior = new NoFly();
        swimmingBehavior= new OnlySinking();
        drivingRoadBehavior=new DrivingNormally();
    }
}
