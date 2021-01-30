package io.github.ph1lou.werewolfapi;


import io.github.ph1lou.werewolfapi.enums.StatePlayer;
import io.github.ph1lou.werewolfapi.rolesattributs.Roles;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

/**
 * @author Ph1Lou
 */

public interface PlayerWW {

    void addPlayerMaxHealth(int heart);

    void removePlayerMaxHealth(int heart);

    void addPlayerHealth(int heart);

    void removePlayerHealth(int heart);

    void sendMessage(String message);

    void sendMessageWithKey(String key);

    void sendMessage(TextComponent textComponent);

    void addPotionEffect(PotionEffectType potion, int duration, int amplifier);

    void addPotionEffect(PotionEffectType potion);

    void removePotionEffect(PotionEffectType potion);

    List<? extends PotionEffectType> getPotionEffects();

    void teleport(Location location);

    void setItemDeath(ItemStack[] items);

    List<? extends ItemStack> getItemDeath();

    void clearItemDeath();

    void setState(StatePlayer statePlayer) ;

    boolean isState(StatePlayer statePlayer);

    void addOneKill() ;

    int getNbKill();

    void setRole(Roles role);

    Roles getRole();

    boolean isKey(String key);

    void setSpawn(Location spawn);

    Location getSpawn();

    void addKiller(PlayerWW playerWW);

    List<? extends PlayerWW> getKillers();

    void setDeathTime(Integer deathTime);

    int getDeathTime();

    List<? extends LoverAPI> getLovers();

    void addLover(LoverAPI loverAPI);

    void removeLover(LoverAPI loverAPI);

    @Nullable
    PlayerWW getLastKiller();

    void setThief(boolean thief) ;

    boolean isThief();

    String getName() ;

    void setName(String name) ;

    @NotNull
    StatePlayer getState();

    int getDisconnectedTime();

    void setDisconnectedTime(int disconnectedTime);

    @NotNull
    UUID getUUID();

    void updateAfterReconnect(Player player);

    void setDisconnectedLocation(Location location);

    void addItem(ItemStack item);

    int getMaxHealth();

    @NotNull
    Location getLocation();
}

