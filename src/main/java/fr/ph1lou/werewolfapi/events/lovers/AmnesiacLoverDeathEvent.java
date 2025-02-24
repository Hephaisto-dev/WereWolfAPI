
package fr.ph1lou.werewolfapi.events.lovers;

import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AmnesiacLoverDeathEvent extends Event {

    private final IPlayerWW playerWW1;
    private final IPlayerWW playerWW2;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public AmnesiacLoverDeathEvent(@NotNull IPlayerWW playerWW1, @NotNull IPlayerWW playerWW2){
        this.playerWW1 = playerWW1;
        this.playerWW2 = playerWW2;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public IPlayerWW getPlayerWW1() {
        return playerWW1;
    }

    public IPlayerWW getPlayerWW2() {
        return playerWW2;
    }

}
