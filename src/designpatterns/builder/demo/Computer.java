package designpatterns.builder.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/23 9:37 PM
 */
public class Computer {
    private String CPU;
    private String RAM;
    private String HD;
    private String GPU;
    private String display;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
