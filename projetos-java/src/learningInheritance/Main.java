package learningInheritance;

import learningClasses.TextBox;
import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args){
        UIControl[] controls =  { new TextBox(), new CheckBox() };
        for (var control : controls){
            control.render();
        }
    }
}
