package designpatterns.builder.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/23 10:06 PM
 */
public class BuilderClient {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new NoteBookBuilder();
        ComputerBuilder desktopComputer = new DesktopComputer();
        Computer computer = desktopComputer.createComputer();
        System.out.print("cpu型号是:" + computer.getCPU());
        System.out.print("\ngpu型号是:" + computer.getGPU());
        System.out.print("\n内存型号是:" + computer.getRAM());
        System.out.print("\n硬盘型号是:" + computer.getHD());
        System.out.print("\n显卡型号是:" + computer.getDisplay());

    }
}
