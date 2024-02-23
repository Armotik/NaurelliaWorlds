package fr.naurellia.naurelliaworlds.facade;

import fr.naurellia.naurelliaworlds.factory.CustomWorldType;
import org.bukkit.WorldType;
import org.bukkit.World.Environment;

import java.util.Map;

public interface WorldOptions {
    /**
     * Get the world settings.
     * @return the world settings
     */
    Map<String, Object> getGeneratorSettings();

    /**
     * Set the world settings.
     * @param settings the world settings
     */
    void setGeneratorSettings(Map<String, Object> settings);

    /**
     * Get the world name.
     * @return the world name
     */
    String getWorldName();

    /**
     * Set the world name.
     * @param worldName the world name
     */
    void setWorldName(String worldName);

    /**
     * Get the world seed.
     * @return the world seed
     */
    long getSeed();

    /**
     * Set the world seed.
     * @param seed the world seed
     */
    void setSeed(long seed);

    /**
     * Get the world type.
     * @return the world type
     */
    WorldType getWorldType();

    /**
     * Set the world type.
     * @param worldType the world type
     */
    void setWorldType(WorldType worldType);

    /**
     * Get the custom world type.
     * @return the custom world type
     */
    CustomWorldType getCustomWorldType();

    /**
     * Set the custom world type.
     * @param customWorldType the custom world type
     */
    void setCustomWorldType(CustomWorldType customWorldType);

    /**
     * Get the world environment.
     * @return the world environment
     */
    Environment getEnvironment();

    /**
     * Set the world environment.
     * @param environment the world environment
     */
    void setEnvironment(Environment environment);

    /**
     * Get the world size.
     * @return the world size
     */
    int getWorldSize();

    /**
     * Set the world size.
     * @param worldSize the world size
     */
    void setWorldSize(int worldSize);
}
