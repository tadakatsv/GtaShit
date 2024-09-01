package chap1.Stratagy;

import chap1.entity.Player;

public interface VehicleUserStateModifier {

    void modify();

    void setDriver(Player player);
}
