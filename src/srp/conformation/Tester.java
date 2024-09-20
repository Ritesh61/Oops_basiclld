package srp.conformation;

public class Tester {

    public static void main(String []args) {
        Employee e = new Employee(0);
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        PerformanceReportPrinter performanceReportPrinter =  new PerformanceReportPrinter();
        BioDataRetriever bioDataRetriever =  new BioDataRetriever();
        System.out.println(salaryCalculator.calculateSalary(e));
        System.out.println(performanceReportPrinter.printPerformanceReport(e));
        System.out.println(bioDataRetriever.retrieveBioData(e));
    }
}
