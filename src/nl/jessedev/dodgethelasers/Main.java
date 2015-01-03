package nl.jessedev.dodgethelasers;

import org.bukkit.plugin.java.JavaPlugin;

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

public class Main extends JavaPlugin {

    private static Main _instance;

    @Override
    public void onEnable() {
        getLogger().info("Now booting DodgeTheLasers...");
    }

    public void onDisable() {

    }
}
