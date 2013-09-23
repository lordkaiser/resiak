package io.github.lordkaiser.resiak;

import org.bukkit.plugin.java.JavaPlugin;

public class Resiak extends JavaPlugin {
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		
		Predator predator = new Predator(this); 
		getCommand("predator").setExecutor(predator);
	}

	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}	
}
