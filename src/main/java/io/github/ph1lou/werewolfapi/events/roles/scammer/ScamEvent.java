package io.github.ph1lou.werewolfapi.events.roles.scammer;

import io.github.ph1lou.werewolfapi.IPlayerWW;
import io.github.ph1lou.werewolfapi.events.roles.SelectionEvent;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * @author Héphaïsto
 * Event that takes place when a scammer takes the role of the first player to reach 100%.
 */
public class ScamEvent extends SelectionEvent {
    private static final HandlerList HANDLERS_LIST = new HandlerList();


    public ScamEvent(IPlayerWW playerWW, IPlayerWW targetWW) {
        super(playerWW, targetWW);
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }
}
