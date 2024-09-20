package lsp.violation;

public class InternEmployee extends Employee{

    protected InternEmployee(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("calculating InternEmployee salary");
        return 0;
    }
}
