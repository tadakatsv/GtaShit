package chap1.Stratagy.Driving;

import chap1.entity.Player;

public class DrivingNormally implements DrivingRoadBehavior {
    
    @Override
    public void drive() {
        System.out.println("I'm driving without any problems");
    }

    @Override
    public void modify() {
    }

    @Override
    public void setDriver(Player player) {
    }
}
