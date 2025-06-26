package company;

public class Main {

    public static void main(String[] args) {
        var employee1 = new Employee();
        employee1.setBaseSalary(50_000);
        employee1.setHourlyRate(20);
        int wage1 = employee1.calculateWage(10);
        System.out.println(wage1);
    }
}

