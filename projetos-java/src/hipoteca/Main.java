package hipoteca;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();

        System.out.print("Period (years): ");
        int period = scanner.nextInt();
        int periodMonths = period * 12;

        float monthlyInterest = (annualInterest / 100) / 12;

        double x = (1 + monthlyInterest);
        float power = (float)Math.pow(x, periodMonths);
        float multiplication = monthlyInterest * power;
        float mortgage = principal * (multiplication/(power - 1));
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
