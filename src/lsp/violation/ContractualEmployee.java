package lsp.violation;

public class ContractualEmployee extends Employee{
    protected ContractualEmployee(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("calculating contractual employee salary");
        return 0;
    }
}
