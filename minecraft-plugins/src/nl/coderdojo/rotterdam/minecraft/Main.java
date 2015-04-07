package nl.coderdojo.rotterdam.minecraft;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Daan on 7-4-2015.
 */
public class Main extends JavaPlugin {//<==== extends javaplugin is nodig dat de plugin weet dat dit voor de servers zijn

    public void onEnable() {//<=== word aangeroepen wanneer je de plugin opstart
        /**
         * Hierin worden vooral events in opgeslagen
         */
        Bukkit.getConsoleSender().sendMessage("");
    }

}
