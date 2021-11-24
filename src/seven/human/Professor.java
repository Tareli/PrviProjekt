package seven.human;

import seven.Gender;

public class Professor extends Employee{
    private  String academicTitle;

    public Professor(){
        super();
        System.out.println("profesor");
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    @Override
    public void setSalaryAmount(double salaryAmount) {
        super.setSalaryAmount(salaryAmount+500);
    }
}
