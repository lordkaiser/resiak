package io.github.lordkaiser.resiak;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class Predator implements CommandExecutor {
	
	private Resiak resiak;
	
	public Predator(Resiak reborn) {
		this.resiak = reborn;
		resiak.getClass();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		/*
		sender.sendMessage(args[0]);
		
		if (args.length > 4) {
           sender.sendMessage("Too many arguments!");
		   return false;
		} 
		if (args.length < 2) {
		   sender.sendMessage("Not enough arguments!");
		   return false;
		}
		*/
		/*
		Player target = (Bukkit.getServer().getPlayer(args[0]));
        if (target == null) {
           sender.sendMessage(args[0] + " is not online!");
           return false;
        }
        return false;
        */
		if( args[0].equalsIgnoreCase("itsalive") ) {
			if ( !(sender instanceof Player) ) {
				sender.sendMessage("This command can only be run by a player.");
				return false;
			} else {
				Player player = (Player) sender;
				player.getWorld().strikeLightning(player.getTargetBlock(null, 200).getLocation());
			}
			return true;
		} else if( args[0].equalsIgnoreCase("armada") ) {
			if ( !(sender instanceof Player) ) {
				sender.sendMessage("This command can only be run by a player.");
				return false;
			} else {
				Player player = (Player) sender;
				//System.out.println( player.getTargetBlock(null, 200).getMetadata("ID") );
			}
			return true;
		}
		return false;
	}
}
