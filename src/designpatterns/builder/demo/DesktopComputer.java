package designpatterns.builder.demo;

/**
 * @Author: Frank
 * @Description: 台式电脑
 * @Date: Create in  2018/10/23 9:55 PM
 */
public class DesktopComputer extends ComputerBuilder {
    @Override
    protected void buildCPU() {
        computer.setCPU("十八核 2.3GHz Intel Xeon W Turbo Boost 最高可达 4.3GHz 42.75MB 缓存");
    }

    @Override
    protected void buildRAM() {
        computer.setRAM("128GB 2666MHz DDR4 ECC 内存");
    }

    @Override
    protected void buildHD() {
        computer.setHD("4TB 固态硬盘");
    }

    @Override
    protected void buildDisplay() {
        computer.setDisplay("5K 视网膜显示屏 分辨率为 5120 x 2880 像素，支持十亿色彩 500 尼特亮度 广色域 (P3)");
    }


    @Override
    protected void buildGPU() {
        computer.setGPU("(1.000) Graphics Device");
    }
}
