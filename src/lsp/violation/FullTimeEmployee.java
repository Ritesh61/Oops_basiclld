package lsp.violation;

public class FullTimeEmployee extends Employee{

    protected FullTimeEmployee(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("calculating FullTime employee salary");
        return 0;
    }
}
