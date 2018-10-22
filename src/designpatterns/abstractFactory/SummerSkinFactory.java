package designpatterns.abstractFactory;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/11 9:15 PM
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public Text createText() {
        return new SummerText();
    }

    @Override
    public ComboBox createComoBox() {
        return new SummerComboBox();
    }
}
