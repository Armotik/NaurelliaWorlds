package fr.naurellia.naurelliaworlds.factory;
public class WorldFactory {

    public WorldFactory() {
    }

    public World createWorld(CustomWorldType customWorldType, String worldName) {

        switch (customWorldType) {
            case EVENT:
                return new EventWorld(worldName);
            case MINING:
                return new MiningWorld(worldName);
            case TEMPORARY:
                return new TemporaryWorld(worldName);
            default:
                throw new IllegalArgumentException("Unknown world type");
        }
    }

    // Todo : Create Bukkit world from world options
}
