package io.github.ph1lou.pluginlgapi.rolesattributs;

import java.util.List;
import java.util.UUID;

public interface AffectedPlayers {

    void addAffectedPlayer(UUID uuid);

    void removeAffectedPlayer(UUID uuid);

    void clearAffectedPlayer();

    List<UUID> getAffectedPlayers();

}
