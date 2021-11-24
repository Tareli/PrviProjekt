package seven.human;

import seven.Gender;

public class Employee extends Person {
    private  double salaryAmount;

    public Employee(){
        super();
        System.out.println("employee");
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
