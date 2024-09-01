package chap1.entity.vehicles;

import chap1.Stratagy.Driving.DrivingRoadBehavior;
import chap1.Stratagy.FlyingShit.FlyingBehavior;
import chap1.Stratagy.SwimmingShit.SwimmingBehavior;
import chap1.entity.Terrain;

public class Boat extends Vehicle {

    public Boat(FlyingBehavior flyingBehavior,
                SwimmingBehavior swimmingBehavior,
                DrivingRoadBehavior drivingRoadBehavior,
                String name,
                Terrain currentTerrain) {
        super(flyingBehavior, swimmingBehavior, drivingRoadBehavior, name, currentTerrain);
    }
}
