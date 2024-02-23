package fr.naurellia.naurelliaworlds;

import fr.armotik.louise.Louise;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class NaurelliaWorlds extends JavaPlugin {

    private static NaurelliaWorlds instance;
    private static Louise louiseAPI;

    /**
     * Gets the instance.
     * Singleton pattern.
     * @return the instance
     */
    public static NaurelliaWorlds getInstance() {
        if (instance == null) {
            instance = new NaurelliaWorlds();
        }
        return instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

        getLogger().info("[NaurelliaWorlds] -> NaurelliaWorlds is loading ...");

        instance = this;

        setupLouiseAPI();

        // TODO : enrich WorldOptions
        // TODO : enrich ProtectionOptions
        // TODO : enrich ProtectedEntity

        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void setupLouiseAPI() {
        Louise plugin = Louise.getInstance();

        if (plugin == null || !plugin.isEnabled()) {
            getLogger().log(Level.SEVERE, "[NaurelliaModeration] -> Louise not found !");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        louiseAPI = plugin;
        getLogger().info("[NaurelliaWorlds] -> LouiseAPI is loaded !");
    }
}
