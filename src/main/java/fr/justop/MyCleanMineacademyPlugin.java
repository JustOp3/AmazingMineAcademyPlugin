package fr.justop;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class MyCleanMineacademyPlugin extends SimplePlugin {

	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */
	@Override
	protected void onPluginStart() {

	}

	/**
	 * Automatically perform login when the plugin starts and each time it is reloaded.
	 */

	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent e) {
		if (e.getRightClicked().getType() == EntityType.CREEPER)
			e.getRightClicked().getWorld().createExplosion(e.getRightClicked().getLocation(), 5);
	}
}
