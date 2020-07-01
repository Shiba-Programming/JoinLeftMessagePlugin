package Main;

import jdk.tools.jlink.internal.plugins.StripJavaDebugAttributesPlugin;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("プラグインを起動しました");
    }
}
