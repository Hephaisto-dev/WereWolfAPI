package io.github.ph1lou.pluginlgapi.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public class InvisibleEvent extends Event {

    private final UUID playerUUID;
    private final boolean invisible;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public InvisibleEvent(UUID playerUUID, boolean invisible) {
        this.playerUUID = playerUUID;
        this.invisible=invisible;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }

    public boolean isInvisible() {
        return invisible;
    }
}