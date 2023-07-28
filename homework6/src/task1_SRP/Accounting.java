package task1_SRP;

import java.util.List;

public class Accounting {

    private int baseSalary;
    private List<Employee> employees;
    

    public Accounting(int baseSalary, List<Employee> employees) {
        this.baseSalary = baseSalary;
        this.employees = employees;
    }


    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
    
}
