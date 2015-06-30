package thehunter;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class TheHunter extends JavaPlugin {
  public static Logger log = Logger.getLogger("Minecraft");
  public void onEnable() {
    log.info("[TheHunter] Start up.");
  }
  public void onReload() {
    log.info("[TheHunter] Server reloaded.");
  }
  public void onDisable() {
    log.info("[TheHunter] Server stopping.");
  }

  public boolean onCommand(CommandSender sender, Command command, 
                           String commandLabel, String[] args) {         
    if (commandLabel.equalsIgnoreCase("thehunter")) {
      if (sender instanceof Player) { 
        Player me = (Player)sender;
        // Put your code after this line:

        // ...and finish your code before this line.
        return true;
        }
    }
    return false;
  }
}
