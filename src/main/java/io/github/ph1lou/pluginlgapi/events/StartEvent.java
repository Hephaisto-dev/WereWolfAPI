package io.github.ph1lou.pluginlgapi.events;

import io.github.ph1lou.pluginlgapi.WereWolfAPI;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StartEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final WereWolfAPI wereWolfAPI;


    public StartEvent(WereWolfAPI wereWolfAPI) {
        this.wereWolfAPI=wereWolfAPI;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public WereWolfAPI getWereWolfAPI() {
        return wereWolfAPI;
    }
}
