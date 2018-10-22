package designpatterns.abstractFactory;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/11 9:06 PM
 */
public interface SkinFactory {
    public Button createButton();

    public Text createText();

    public ComboBox createComoBox();
}
