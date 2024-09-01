package chap1.Stratagy.SwimmingShit;

import chap1.entity.Player;

public class ImmediateExplosion implements SwimmingBehavior {

    private Player player;

    @Override
    public void swim() {
        System.out.println("Immediate explosion as soon as touch water");
        modify();
    }

    @Override
    public void modify() {
        player.setUserState(Player.UserState.DEAD);
    }

    @Override
    public void setDriver(Player player) {
        this.player = player;
    }
}
