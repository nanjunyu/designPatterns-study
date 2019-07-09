package designpatterns.builder.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/23 9:43 PM
 */
public abstract class ComputerBuilder {
    Computer computer = new Computer();

    protected abstract void buildCPU();

    protected abstract void buildRAM();

    protected abstract void buildHD();

    protected abstract void buildDisplay();

    protected abstract void buildGPU();

    public Computer createComputer() {
        this.buildCPU();
        this.buildDisplay();
        this.buildGPU();
        this.buildHD();
        this.buildRAM();
        return computer;
    }
}
