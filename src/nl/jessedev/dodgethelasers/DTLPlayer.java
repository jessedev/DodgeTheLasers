package nl.jessedev.dodgethelasers;

import nl.jessedev.dodgethelasers.enums.PlayerState;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * COPYRIGHT 2014 (C) JESSE DE VRIES
 * -------------------------
 * This file was created by Jesse de Vries, also known as:
 * - "FlamingxGamer"
 * - "jessedv"
 * - "jessedev"
 * -------------------------
 * All rights reserved. Unauthorized copying of this file, via any medium is strictly prohibited.
 * Confidential. Usage requests can be done by mailing to <rights@jessedev.nl>
 */

public class DTLPlayer {

    private static Map<UUID, DTLPlayer> _instances = new HashMap<UUID, DTLPlayer>();

    public UUID uuid;
    public int score;
    public PlayerState playerState;

    private DTLPlayer(UUID uuid) {
        this.uuid = uuid;
        this.score = 0;
        this.playerState = PlayerState.ALIVE;
    }

    public Player getBukkit() {
        return Bukkit.getPlayer(this.uuid);
    }

    public static DTLPlayer fromBukkit(Player p) {
        UUID uuid = p.getUniqueId();
        if(_instances.get(uuid) != null) {
            return _instances.get(uuid);
        } else {
            _instances.put(uuid, new DTLPlayer(uuid));
            return fromBukkit(p);
        }
    }

}
