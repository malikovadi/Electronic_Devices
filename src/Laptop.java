public class Laptop extends Device{
    private String name;
    private String processor;
    private int fps;

    public Laptop(String type, double price, double weight, String name, String processor, int fps) {
        super(type, price, weight);
        this.name = name;
        this.processor = processor;
        this.fps = fps;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

}
