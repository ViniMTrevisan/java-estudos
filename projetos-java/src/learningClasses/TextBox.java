package learningClasses;

public class TextBox {
    public String text = ""; // field in Java - outside of a method

    public void setText (String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
