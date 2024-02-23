package fr.naurellia.naurelliaworlds.factory;

import fr.naurellia.naurelliaworlds.facade.WorldOptions;

public abstract class World {

    protected WorldOptions options;

    public World() {
    }

    /**
     * Get the world options.
     * @return the world options
     */
    public WorldOptions getOptions() {
        return options;
    }

    /**
     * Set the world options.
     * @param options the world options
     */
    public void setOptions(WorldOptions options) {
        this.options = options;
    }
}
