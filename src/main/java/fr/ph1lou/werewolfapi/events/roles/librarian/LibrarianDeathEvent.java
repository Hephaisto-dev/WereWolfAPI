package fr.ph1lou.werewolfapi.events.roles.librarian;

import fr.ph1lou.werewolfapi.annotations.statistics.StatisticsEvent;
import fr.ph1lou.werewolfapi.annotations.statistics.StatisticsPlayer;
import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.librarian_death")
public class LibrarianDeathEvent extends Event {

    private final IPlayerWW playerWW;

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public LibrarianDeathEvent(IPlayerWW playerWW){
        this.playerWW = playerWW;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @StatisticsPlayer
    public IPlayerWW getPlayerWW() {
        return this.playerWW;
    }

}

