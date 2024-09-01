package chap1.Stratagy.Driving;

import chap1.entity.Player;

public class DrivingNotOnRoad implements DrivingRoadBehavior {
    
    @Override
    public void drive() {
        System.out.println("I'm driving, but not on road");
    }

    @Override
    public void modify() {
        
    }

    @Override
    public void setDriver(Player player) {

    }
}
