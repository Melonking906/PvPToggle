package me.nonit.pvptoggle;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PvPToggle extends JavaPlugin
{
    private static final String PREFIX = ChatColor.YELLOW + "[PvP]" + ChatColor.GREEN + " ";

    @Override
    public void onEnable()
    {
        PluginManager pm = getServer().getPluginManager();

        PvPListener pvPListener = new PvPListener();

        pm.registerEvents( pvPListener, this );
        getCommand( "pvp" ).setExecutor( new PvPCommand( pvPListener ) );
    }

    public static String getPrefix()
    {
        return PREFIX;
    }
}
