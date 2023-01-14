package fr.ph1lou.werewolfapi.events.lovers;

import fr.ph1lou.werewolfapi.annotations.statistics.StatisticsEvent;
import fr.ph1lou.werewolfapi.annotations.statistics.StatisticsTarget;
import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

@StatisticsEvent(key = "werewolf.lover_revelation")
public class RevealNormalLoversEvent extends Event {

    private final Set<IPlayerWW> playerWWS;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public RevealNormalLoversEvent(Set<IPlayerWW> playerWWS) {
        this.playerWWS = playerWWS;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @StatisticsTarget
    public Set<IPlayerWW> getPlayerWWS() {
        return playerWWS;
    }
}

