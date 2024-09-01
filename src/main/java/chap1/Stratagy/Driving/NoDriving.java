package chap1.Stratagy.Driving;

import chap1.entity.Player;

public class NoDriving implements DrivingRoadBehavior {
    public void drive() {
        System.out.println("I cannot drive");
    }

    @Override
    public void modify() {
        
    }

    @Override
    public void setDriver(Player player) {

    }
}
