package xyz.iconc.dev.api.shared.objects;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}