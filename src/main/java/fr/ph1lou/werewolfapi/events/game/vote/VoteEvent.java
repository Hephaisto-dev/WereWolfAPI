package fr.ph1lou.werewolfapi.events.game.vote;

import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import fr.ph1lou.werewolfapi.events.roles.SelectionEvent;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class VoteEvent extends SelectionEvent {


    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public VoteEvent(IPlayerWW voterWW, IPlayerWW voteWW){
        super(voterWW,voteWW);
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

}

