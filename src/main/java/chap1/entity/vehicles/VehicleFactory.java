package chap1.entity.vehicles;

import chap1.Stratagy.Driving.DrivingNormally;
import chap1.Stratagy.Driving.DrivingNotOnRoad;
import chap1.Stratagy.FlyingShit.FlyNormally;
import chap1.Stratagy.FlyingShit.NoFly;
import chap1.Stratagy.SwimmingShit.ImmediateExplosion;
import chap1.Stratagy.SwimmingShit.OnlySinking;
import chap1.Stratagy.SwimmingShit.SwimOnSurface;
import chap1.entity.Terrain;

public class VehicleFactory {

    public Car createZalupa() {
        return new Car(new NoFly(), new OnlySinking(), new DrivingNormally(), "ZAZ Zalupa", Terrain.GROUND);
    }

    public Car createMazerati() {
        return new Car(new NoFly(), new SwimOnSurface(), new DrivingNormally(), "Mazerati", Terrain.GROUND);
    }

    public Plane createPalyanytsya() {
        return new Plane(new FlyNormally(), new ImmediateExplosion(), new DrivingNotOnRoad(), "Palyanytsya", Terrain.AIR);
    }

    public Boat createKursk() {
        return new Boat(new NoFly(), new OnlySinking(), new DrivingNotOnRoad(), "Kursk", Terrain.WATER);
    }
}
