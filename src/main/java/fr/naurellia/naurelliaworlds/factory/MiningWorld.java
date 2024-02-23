package fr.naurellia.naurelliaworlds.factory;

import fr.naurellia.naurelliaworlds.facade.WorldOptions;
import fr.naurellia.naurelliaworlds.worldoptions.MiningWorldOptions;

public class MiningWorld extends World {
    public MiningWorld(String worldName) {

        super();

        setOptions(new MiningWorldOptions(worldName));
    }
}
