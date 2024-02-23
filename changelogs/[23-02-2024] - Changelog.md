# NaurelliaWorlds - Changelog

## World Management Plugin for NaurelliaCraft

### Author : Armotik

### API Version 1.20.4

---

```
## [1.20.4] - 2024-01-20
### Added
- First version of the plugin
- Add Facade Pattern to manage the worlds
    - WorldManagerFacade (main interface)
    - ProtectionOptions (interface for the protection options of a world)
    - WorldOptions (interface for the options of a world)
    - ProtectedEntity (Class to manage the protected entities used in the ProtectionOptions)
    - ProtectionLevel (Enum to manage the protection level of a world, used in ProtectionOptions and ProtectedEntity)
    - CustomWorldType (Enum to manage the type of a world, used in WorldOptions)
- Add Factory Pattern to create the worlds
    - WorldFactory (main class for the Factory Pattern)
    - World (abstract class for the worlds)
    - EventWorld (Event world for the event world)
    - MiningWorld (Mining world for the mining world)
    - TemporaryWorld (Temporary world for minigames)
- Add Singleton Pattern to manage the plugin (main class)
    - NaurelliaWorlds (main class for the Singleton Pattern)
- Add the 3 world options classes wich implement the WorldOptions interface
    - EventWorldOptions (options for the event world)
    - MiningWorldOptions (options for the mining world)
    - TemporaryWorldOptions (options for the temporary world)
- Add README.md
- Add Changelog folder
- Add the first changelog
- Add LICENSE

### Changed

### Removed

### How it works at the moment
For the moment, just the Factory Pattern and the Singleton Pattern are implemented.
The Facade Pattern only has the main interface.

- The Factory Pattern is used to create the worlds :
    - Event world
    - Mining world
    - Temporary world (for minigames)
    To create a world, you can modify the default options in the config file. A world need a WorldOption (name, seed, type, ect) to be created. Every CustomWorldType has its own WorldOptions.

```