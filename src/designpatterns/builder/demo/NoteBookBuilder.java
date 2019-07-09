package designpatterns.builder.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/23 9:49 PM
 */
public class NoteBookBuilder extends ComputerBuilder {
    @Override
    protected void buildCPU() {
        computer.setCPU("2.3 GHz Intel Core i5");
    }

    @Override
    protected void buildRAM() {
        computer.setRAM("8 GB 2133 MHz LPDDR3");
    }

    @Override
    protected void buildHD() {
        computer.setHD("Intel Iris Plus Graphics 655 1536 MB");
    }

    @Override
    protected void buildDisplay() {
        computer.setDisplay("");
    }

    @Override
    protected void buildGPU() {
        computer.setGPU("(1.000) Graphics Device");
    }
}
