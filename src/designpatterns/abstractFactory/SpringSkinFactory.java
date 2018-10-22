package designpatterns.abstractFactory;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/11 9:13 PM
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public Text createText() {
        return new SpringText();
    }

    @Override
    public ComboBox createComoBox() {
        return new SpringComboBox();
    }
}
