package chap1.Stratagy.FlyingShit;

import chap1.entity.Player;

public class FlyNormally implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying without any problems");
    }

    @Override
    public void modify() {
        
    }

    @Override
    public void setDriver(Player player) {

    }
}

