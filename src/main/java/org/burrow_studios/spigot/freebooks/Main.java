package org.burrow_studios.spigot.freebooks;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.burrow_studios.spigot.freebooks.command.BookCommand;


public class Main extends JavaPlugin implements Listener, CommandExecutor {

    public BookCommand bookcommand;


    @Override
    public void onEnable() {

        // write a config.yml
        saveDefaultConfig();

        // implement Java Class "BookCommand" in "Main"
        bookcommand = new BookCommand(this);


        // implement Command "book"
        getCommand("book").setExecutor(bookcommand);

    }
}
