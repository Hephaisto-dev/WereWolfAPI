package fr.ph1lou.werewolfapi.events.random_events;

import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class RumorsWriteEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean cancel = false;
    private final IPlayerWW playerWW;
    private final String message;

    public RumorsWriteEvent(IPlayerWW playerWW, String message){
        this.playerWW = playerWW;
        this.message = message;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel=cancel;
    }

    public IPlayerWW getPlayerWW() {
        return playerWW;
    }

    public String getMessage() {
        return message;
    }
}
