import interfacetest.PluginInterface;

public class Plugin implements PluginInterface {
    public String name = "Plugin1";

    public Plugin() {
    }

    public void start() {
        System.out.println(this.name);
    }

    public String getName() {
        return this.name;
    }
}
