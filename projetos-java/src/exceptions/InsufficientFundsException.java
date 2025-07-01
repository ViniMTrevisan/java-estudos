package exceptions;

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException (){
        System.out.println("Insufficient funds in your account");
    }

    public InsufficientFundsException(String message){
        super(message);
    }
}
