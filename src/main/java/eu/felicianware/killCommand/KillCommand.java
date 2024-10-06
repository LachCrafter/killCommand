package eu.felicianware.killCommand;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class KillCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("kill").setExecutor(new KillCommandExecutor());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static class KillCommandExecutor implements CommandExecutor {
        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (sender instanceof Player player) {
                player.setHealth(0.0);
                return true;
            }
        }
    }
}
