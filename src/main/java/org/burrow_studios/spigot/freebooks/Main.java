package org.burrow_studios.spigot.freebooks;

import org.bukkit.plugin.java.JavaPlugin;
import org.burrow_studios.spigot.freebooks.command.BookCommand;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        // write a config.yml
        saveDefaultConfig();

        BookCommand bookcommand = new BookCommand(this);
        getCommand("book").setExecutor(bookcommand);
    }
}
