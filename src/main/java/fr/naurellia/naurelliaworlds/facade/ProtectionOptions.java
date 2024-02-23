package fr.naurellia.naurelliaworlds.facade;

import java.util.List;
import java.util.Map;

public interface ProtectionOptions {

    ProtectionLevel getProtectionLevel();
    boolean areExplosionsEnabled();
    boolean isPvPEnabled();
    boolean isMobGriefingEnabled();
    boolean isFireSpreadEnabled();
    boolean isLeafDecayEnabled();
    boolean isInteractEnabled();

    List<ProtectedEntity> getProtectedEntities();
    void addProtectedEntity(ProtectedEntity protectedEntity);
    void removeProtectedEntity(ProtectedEntity protectedEntity);

    Map<String, Object> getProtectionOptions();
    void setProtectionOptions(Map<String, Object> protectionOptions);
}

