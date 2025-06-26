package company;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee (int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0){
            throw new IllegalArgumentException("Salary must be above 0");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0){
            throw new IllegalArgumentException("Hourly Rate must be above 0");
        }
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }

}
