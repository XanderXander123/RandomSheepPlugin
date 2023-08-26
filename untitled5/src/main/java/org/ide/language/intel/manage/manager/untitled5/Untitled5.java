package org.ide.language.intel.manage.manager.untitled5;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Sheep;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Random;
public class Untitled5 extends JavaPlugin {
    @Override public void onEnable() { getLogger().info(""
    + "SHEEP has been enabled."); }
    @Override public void 
    onDisable() { getLogger().info("SHEEP "
    + "has been disabled.");
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (cmd.getName().equalsIgnoreCase("SheepHere")) {
    if (sender.hasPermission("randomcoloredsheep.spawn")) {
    spawnRandomColoredSheep(sender);
    } else {
    sender.sendMessage(ChatColor.RED + 
    "You don't have permission to use this command.");
    } return true; } return false; }
    private void spawnRandomColoredSheep(CommandSender sender) {
    Random random = new Random();
    int colorIndex = random.nextInt(DyeColor.values().length);
        DyeColor color = DyeColor.values()[colorIndex];
        /*
        Sheep sheep = sender.getWorld().spawnEntity(((Sheep) sender).getLocation(), EntityType.SHEEP);
        sheep.setColor(color);
      
        sender.sendMessage(ChatColor.GREEN + "You spawned a random-colored sheep!");
        */
    
    }
}

