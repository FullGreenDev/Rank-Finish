package fr.fullgreendev.rank.bukkit.plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import fr.fullgreendev.rank.Rank;
import fr.fullgreendev.rank.bukkit.command.RankCommand;
import fr.fullgreendev.rank.bukkit.listener.PlayerListener;


public final class RankJavaPlugin extends JavaPlugin{

	/**
	 * Class principal {@link Rank}
	 */
	private Rank rank;
	
	/**
	 * Methode utilis� lors du chargement du plugin.
	 */
	public final void onLoad() {
		rank = new Rank(this);
	}
	
	/**
	 * Methode utilis� une fois le plugin activ�.
	 */
	public final void onEnable() {
		rank.initScoreboard();
		
		Bukkit.getPluginManager().registerEvents(new PlayerListener(rank), this);
		getCommand("rank").setExecutor(new RankCommand(rank));
	}
	
	/**
	 * Methode utilis� lors que le plugin s'arr�te.
	 */
	public final void onDisable() {
		
	}
}