package chap1.Stratagy.FlyingShit;

import chap1.entity.Player;

public class NoFly implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("i can not fly((");
    }

    @Override
    public void modify() {
        
    }

    @Override
    public void setDriver(Player player) {

    }
}
