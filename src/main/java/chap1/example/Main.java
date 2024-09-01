package chap1.example;

import chap1.entity.Player;
import chap1.entity.Terrain;
import chap1.entity.vehicles.Vehicle;
import chap1.entity.vehicles.VehicleFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        List<Vehicle> playerVehicles = List.of(vehicleFactory.createKursk(), vehicleFactory.createMazerati(), vehicleFactory.createPalyanytsya(), vehicleFactory.createZalupa());


        Player player = new Player();

        for (Terrain terrain : Terrain.values()) {
            for (Vehicle playerVehicle : playerVehicles) {
                player.sitInsideVehicle(playerVehicle);
                player.drive(terrain);
                player.getOutOfVehicle();
                System.out.println("====================");
            }
        }



//        Car mazzerati = new Car();
//        mazzerati.performDriving();
//        mazzerati.performFly();
//        mazzerati.performSwim();
//
//        Boat yachtaPatriarhaKirilla = new Boat(flyingBehavior, swimmingBehavior, drivingRoadBehavior);
//        yachtaPatriarhaKirilla.performDriving();
//        yachtaPatriarhaKirilla.performFly();
//        yachtaPatriarhaKirilla.performSwim();
//
//        Plane Boeing_737 = new Plane();
//        Boeing_737.performDriving();
//        Boeing_737.performFly();
//        Boeing_737.performSwim();
//
//        Submarine kursk = new Submarine();
//        kursk.performDriving();
//        kursk.performFly();
//        kursk.performSwim();
    }
}