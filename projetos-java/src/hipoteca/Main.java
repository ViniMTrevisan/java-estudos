package hipoteca;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal = 0;

        while (true) {
            System.out.print("Principal (1K - 1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000){
                break;
            }
            System.out.println("Insert a number between 1K and 1M");
        }

        float annualInterest = 0;
        float monthlyInterest = 0;
        while (true) {
            System.out.print("Annual Interest Rate (0 - 30): ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >= 0 && annualInterest <= 30){
                monthlyInterest = (annualInterest / 100) / 12;
                break;
            }
            System.out.println("Insert a number between 0 and 30");
        }

        int period = 0;
        int periodMonths = 0;
        while (true) {
            System.out.print("Period (years - 1 - 30): ");
            period = scanner.nextInt();
            if (period >= 1 && period <= 30){
                periodMonths = period * 12;
                break;
            }
            System.out.println("Insert a number between 1 and 30");
        }

        double x = (1 + monthlyInterest);
        float power = (float)Math.pow(x, periodMonths);
        float multiplication = monthlyInterest * power;
        float mortgage = principal * (multiplication/(power - 1));
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}