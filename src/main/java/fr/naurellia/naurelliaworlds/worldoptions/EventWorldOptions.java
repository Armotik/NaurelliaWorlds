package fr.naurellia.naurelliaworlds.worldoptions;

import fr.naurellia.naurelliaworlds.NaurelliaWorlds;
import fr.naurellia.naurelliaworlds.facade.WorldOptions;
import fr.naurellia.naurelliaworlds.factory.CustomWorldType;
import org.bukkit.World;
import org.bukkit.WorldType;

import java.util.HashMap;
import java.util.Map;

public class EventWorldOptions implements WorldOptions {

    private Map<String, Object> generatorSettings;
    private String worldName;
    private long seed;
    private WorldType worldType;
    private CustomWorldType customWorldType;
    private World.Environment environment;
    private int worldSize;

    public EventWorldOptions(String worldName) {
        this.worldName = worldName;
        this.seed = NaurelliaWorlds.getInstance().getConfig().getInt("worlds.world_creation.event.seed");
        this.worldType = WorldType.valueOf(NaurelliaWorlds.getInstance().getConfig().getString("worlds.world_creation.event.generator"));
        this.customWorldType = CustomWorldType.EVENT;
        this.environment = World.Environment.valueOf(NaurelliaWorlds.getInstance().getConfig().getString("worlds.world_creation.event.environment"));
        this.worldSize = NaurelliaWorlds.getInstance().getConfig().getInt("worlds.world_creation.event.size");

        generatorSettings = new HashMap<>();
        generatorSettings.put(worldName, this);
    }

    /**
     * Get the world settings.
     *
     * @return the world settings
     */
    @Override
    public Map<String, Object> getGeneratorSettings() {
        return generatorSettings;
    }

    /**
     * Set the world settings.
     *
     * @param settings the world settings
     */
    @Override
    public void setGeneratorSettings(Map<String, Object> settings) {
        this.generatorSettings = settings;
    }

    /**
     * Get the world name.
     *
     * @return the world name
     */
    @Override
    public String getWorldName() {
        return worldName;
    }

    /**
     * Set the world name.
     *
     * @param worldName the world name
     */
    @Override
    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    /**
     * Get the world seed.
     *
     * @return the world seed
     */
    @Override
    public long getSeed() {
        return seed;
    }

    /**
     * Set the world seed.
     *
     * @param seed the world seed
     */
    @Override
    public void setSeed(long seed) {
        this.seed = seed;
    }

    /**
     * Get the world type.
     *
     * @return the world type
     */
    @Override
    public WorldType getWorldType() {
        return worldType;
    }

    /**
     * Set the world type.
     *
     * @param worldType the world type
     */
    @Override
    public void setWorldType(WorldType worldType) {
        this.worldType = worldType;
    }

    /**
     * Get the custom world type.
     *
     * @return the custom world type
     */
    @Override
    public CustomWorldType getCustomWorldType() {
        return customWorldType;
    }

    /**
     * Set the custom world type.
     *
     * @param customWorldType the custom world type
     */
    @Override
    public void setCustomWorldType(CustomWorldType customWorldType) {
        this.customWorldType = customWorldType;
    }

    /**
     * Get the world environment.
     *
     * @return the world environment
     */
    @Override
    public World.Environment getEnvironment() {
        return environment;
    }

    /**
     * Set the world environment.
     *
     * @param environment the world environment
     */
    @Override
    public void setEnvironment(World.Environment environment) {
        this.environment = environment;
    }

    /**
     * Get the world size.
     *
     * @return the world size
     */
    @Override
    public int getWorldSize() {
        return worldSize;
    }

    /**
     * Set the world size.
     *
     * @param worldSize the world size
     */
    @Override
    public void setWorldSize(int worldSize) {
        this.worldSize = worldSize;
    }
}
