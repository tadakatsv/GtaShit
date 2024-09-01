package chap1.Stratagy.SwimmingShit;

import chap1.entity.Player;

public class OnlySinking implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("I cant swim");
    }

    @Override
    public void modify() {
        
    }

    @Override
    public void setDriver(Player player) {

    }
}
