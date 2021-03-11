package net.testusuke.hh.item

import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {

    companion object{
        //  Plugin instance
        lateinit var plugin: Main

    }
    override fun onEnable() {
        //  instance
        plugin = this

    }

    override fun onDisable() {
        //  on disable
    }
}