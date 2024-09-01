package chap1.entity.vehicles;


import chap1.Stratagy.Driving.DrivingRoadBehavior;
import chap1.Stratagy.FlyingShit.FlyingBehavior;
import chap1.Stratagy.SwimmingShit.SwimmingBehavior;
import chap1.Stratagy.VehicleUserStateModifier;
import chap1.entity.Player;
import chap1.entity.Terrain;

import java.util.List;

public abstract class Vehicle {

    private final FlyingBehavior flyingBehavior;
    private final SwimmingBehavior swimmingBehavior;
    private final DrivingRoadBehavior drivingRoadBehavior;
    private final String name;

    private Terrain currentTerrain;

    protected Vehicle(FlyingBehavior flyingBehavior,
                      SwimmingBehavior swimmingBehavior,
                      DrivingRoadBehavior drivingRoadBehavior,
                      String name,
                      Terrain currentTerrain) {
        this.flyingBehavior = flyingBehavior;
        this.swimmingBehavior = swimmingBehavior;
        this.drivingRoadBehavior = drivingRoadBehavior;
        this.name = name;
        this.currentTerrain = currentTerrain;
    }

    public void use(Terrain terrain, Player player) {
        List.of(flyingBehavior, swimmingBehavior, drivingRoadBehavior)
                .forEach(vehicleUserStateModifier -> vehicleUserStateModifier.setDriver(player));

        switch (terrain) {
            case GROUND -> getDrivingRoadBehavior().drive();
            case WATER -> getSwimmingBehavior().swim();
            case AIR -> getFlyingBehavior().fly();
        }
    }

    public FlyingBehavior getFlyingBehavior() {
        return flyingBehavior;
    }

    public SwimmingBehavior getSwimmingBehavior() {
        return swimmingBehavior;
    }

    public DrivingRoadBehavior getDrivingRoadBehavior() {
        return drivingRoadBehavior;
    }

    public Terrain getCurrentTerrain() {
        return currentTerrain;
    }

    public void setCurrentTerrain(Terrain currentTerrain) {
        this.currentTerrain = currentTerrain;
    }

    public String getName() {
        return name;
    }
}
