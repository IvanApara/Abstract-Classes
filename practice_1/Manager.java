public class Manager implements Employee{
    private static final int FIXED_SALARY = 60_000;
    private static final int MINIMUM_INCOME = 115_000;
    private static final int MAXIMUM_INCOME = 140_000;
    private static final double PERCENT = 0.05;

    @Override
    public int getMonthSalary() {
        int incomeCompany = (int) ((Math.random() * (MAXIMUM_INCOME - MINIMUM_INCOME)) + MINIMUM_INCOME);
        int salaryManager = (int) (FIXED_SALARY + (incomeCompany * PERCENT));
        return salaryManager;
    }

    
    public String toString() {
        return getMonthSalary() + " руб.";
    }
}
