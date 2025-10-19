package collectionFramework.project;

import java.util.Set;

public class User {
    private String name;
    private boolean active;
    private Set<String> roles;

    public User(String name, boolean active, Set<String> roles) {
        this.name = name;
        this.active = active;
        this.roles = roles;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;
    }
}
