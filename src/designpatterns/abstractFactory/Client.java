package designpatterns.abstractFactory;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/11 9:17 PM
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory skinFactory;
        Button button;
        Text text;
        ComboBox comboBox;
        skinFactory = (SkinFactory) XMLUtil.getBean();
        button = skinFactory.createButton();
        text = skinFactory.createText();
        comboBox = skinFactory.createComoBox();
        button.display();
        text.display();
        comboBox.display();
    }
}
