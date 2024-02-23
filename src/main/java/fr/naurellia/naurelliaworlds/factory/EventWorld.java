package fr.naurellia.naurelliaworlds.factory;

import fr.naurellia.naurelliaworlds.worldoptions.EventWorldOptions;

public class EventWorld extends World{
    public EventWorld(String worldName) {
        super();

        setOptions(new EventWorldOptions(worldName));
    }
}
