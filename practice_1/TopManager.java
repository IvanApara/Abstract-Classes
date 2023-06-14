public class TopManager implements Employee {
    private static final int FIXED_SALARY = 50_000;
    private static final double PERCENT = 1.5;
    Company incomeCompany = new Company();

    @Override
    public int getMonthSalary() {
        if (incomeCompany.getIncome() > 10_000_000){
            int salaryTopManager =(int) (FIXED_SALARY + (FIXED_SALARY * PERCENT));
            return salaryTopManager;
        }
        return FIXED_SALARY;
    }

    public String toString() {
        return getMonthSalary() + " руб." ;
    }
}
