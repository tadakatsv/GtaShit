package chap1.entity.vehicles;

import chap1.Stratagy.Driving.DrivingNotOnRoad;
import chap1.Stratagy.Driving.DrivingRoadBehavior;
import chap1.Stratagy.FlyingShit.FlyNormally;
import chap1.Stratagy.FlyingShit.FlyingBehavior;
import chap1.Stratagy.SwimmingShit.ImmediateExplosion;
import chap1.Stratagy.SwimmingShit.SwimmingBehavior;
import chap1.entity.Terrain;

public class Plane extends Vehicle {

    public Plane(FlyingBehavior flyingBehavior,
                 SwimmingBehavior swimmingBehavior,
                 DrivingRoadBehavior drivingRoadBehavior,
                 String name,
                 Terrain currentTerrain) {
        super(flyingBehavior, swimmingBehavior, drivingRoadBehavior, name, currentTerrain);
    }
}
