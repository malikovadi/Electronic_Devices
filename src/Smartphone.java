public class Smartphone extends Device{
    private String name;
    private int memory;
    private int fps;

    public Smartphone(String type, double price, double weight, String name, int memory, int fps) {
        super(type, price, weight);
        this.name = name;
        this.memory = memory;
        this.fps = fps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }


}
