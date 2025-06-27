package learningClasses;

import learningInheritance.UIControl;

public class TextBox extends UIControl {
    private String text = ""; // field in Java - outside of a method

//    public TextBox() {
//        super(true);
//        System.out.println("Text Box");
//    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText (String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
