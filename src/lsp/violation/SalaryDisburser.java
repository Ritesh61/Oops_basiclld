package lsp.violation;

import java.util.List;

public class SalaryDisburser {

    public void disburseSalaries(List<Employee> employees) {
        for(int i=0; i< employees.size(); i++) {
            Employee employee = employees.get(i);
            if(employee instanceof Volunteer)
                continue;
            employee.calculateSalary();
        }
    }
}
