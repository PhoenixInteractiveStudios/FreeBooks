package org.burrow_studios.spigot.freebooks.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.burrow_studios.spigot.freebooks.Main;
import org.jetbrains.annotations.NotNull;

public class BookCommand implements CommandExecutor {
    private final Main main;

    public BookCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, String[] strings) {
        if (!(sender instanceof Player player)) return true;

        //implement new Item "Writable_Book"
        ItemStack book = new ItemStack(Material.WRITABLE_BOOK);

        // give "book" a new name
        ItemMeta bookname = book.getItemMeta();
        bookname.setDisplayName("Pergament");
        book.setItemMeta(bookname);

        // give player the item
        player.getInventory().addItem(book);

        player.sendMessage(main.getConfig().getString("chatPrefix") + "§7Du hast ein Pergament erhalten.");
        return true;
    }
}
