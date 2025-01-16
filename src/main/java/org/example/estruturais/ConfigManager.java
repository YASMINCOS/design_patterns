package org.example.estruturais;

import org.springframework.stereotype.Component;

@Component
public class ConfigManager {
    private final String connectionId;

    public ConfigManager() {
        this.connectionId = "CONN-" + System.nanoTime();
    }

    public String getConnectionId() {
        return connectionId;
    }
}
