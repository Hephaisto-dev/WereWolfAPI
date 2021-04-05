package io.github.ph1lou.werewolfapi.rolesattributs;

import io.github.ph1lou.werewolfapi.IPlayerWW;
import io.github.ph1lou.werewolfapi.WereWolfAPI;

public abstract class RoleNeutral extends Role {

    public RoleNeutral(WereWolfAPI game, IPlayerWW playerWW, String key){
        super(game, playerWW,key);
    }

    @Override
    public boolean isNeutral() {
        return !super.isWereWolf();
    }


}