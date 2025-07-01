package exceptions;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        var s = new ExceptionsDemo();
        try {
            s.show();
        } catch (Throwable e) {
            System.out.println("Unexpected error ocurred. Please try again");
        }
    }
}
