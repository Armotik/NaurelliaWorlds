package fr.naurellia.naurelliaworlds.facade;

import javax.xml.stream.Location;
import java.util.UUID;

public class ProtectedEntity {

    private static int id = 0;

    private final int protectedEntityId;
    private Location location;
    private ProtectionLevel protectionLevel;
    private UUID owner;

    public ProtectedEntity(Location location, ProtectionLevel protectionLevel, UUID owner) {
        this.protectedEntityId = id++;
        this.location = location;
        this.protectionLevel = protectionLevel;
        this.owner = owner;
    }

    /**
     * Get the id of the protected entity.
     * @return the id
     */
    public static int getId() {
        return id;
    }

    /**
     * Get the location of the protected entity.
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Set the location of the protected entity.
     * @param location new location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Get the protection level of the protected entity.
     * @return the protection level
     */
    public ProtectionLevel getProtectionLevel() {
        return protectionLevel;
    }

    /**
     * Set the protection level of the protected entity.
     * @param protectionLevel new protection level
     */
    public void setProtectionLevel(ProtectionLevel protectionLevel) {
        this.protectionLevel = protectionLevel;
    }

    /**
     * Get the owner of the protected entity.
     * @return the owner
     */
    public UUID getOwner() {
        return owner;
    }

    /**
     * Set the owner of the protected entity.
     * @param owner new owner
     */
    public void setOwner(UUID owner) {
        this.owner = owner;
    }

    /**
     * Check if the entity is protected.
     * @return true if the entity is protected, false otherwise
     */
    public boolean isProtected() {
        return protectionLevel != ProtectionLevel.NONE;
    }

    /**
     * Remove the protection of the entity.
     */
    public void removeProtection() {
        this.protectionLevel = ProtectionLevel.NONE;
    }

    /**
     * Get the protected entity id.
     * @return the protected entity id
     */
    public int getProtectedEntityId() {
        return protectedEntityId;
    }
}
