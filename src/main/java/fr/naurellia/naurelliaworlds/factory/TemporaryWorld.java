package fr.naurellia.naurelliaworlds.factory;

import fr.naurellia.naurelliaworlds.facade.WorldOptions;
import fr.naurellia.naurelliaworlds.worldoptions.TemporaryWorldOptions;

public class TemporaryWorld extends World {
    public TemporaryWorld(String worldName) {

        super();

        WorldOptions options = new TemporaryWorldOptions(worldName);
        setOptions(options);
    }
}
