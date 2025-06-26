package company;

public class Main {

    public static void main(String[] args) {
        var employee1 = new Employee(50_000, 20);
        int wage1 = employee1.calculateWage(10);
        System.out.println(wage1);

        var employee2 = new Employee(18000, 100);
        int wage2 = employee2.calculateWage(30);
        System.out.println(wage2);
    }
}

