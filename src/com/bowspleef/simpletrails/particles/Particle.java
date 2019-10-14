package com.bowspleef.simpletrails.particles;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public abstract class Particle {

    private String name;
    private String[] description;

    private boolean active;

    public abstract void effect(Location location);

    public void run(Player player) {
        new BukkitRunnable() {

            Location location = player.getLocation();

            @Override
            public void run() {
                if (!isActive())
                    cancel();

                effect(location);
            }
        };
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDescription() {
        return description;
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
