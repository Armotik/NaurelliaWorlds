package fr.naurellia.naurelliaworlds.facade;

public interface WorldManagerFacade {

    /**
     * Create a new world with the given name and options.
     * @param worldName the name of the world
     * @param options the options of the world
     */
    void createWorld(String worldName, WorldOptions options);

    /**
     * Delete the world with the given name.
     * @param worldName the name of the world
     */
    void deleteWorld(String worldName);

    /**
     * Edit the world with the given name and options.
     * @param worldName the name of the world
     * @param options the options of the world
     */
    void editWorld(String worldName, WorldOptions options);

    /**
     * Protect the world with the given name and options.
     * @param worldName the name of the world
     * @param options the options of the world
     */
    void protectWorld(String worldName, ProtectionOptions options);
}
