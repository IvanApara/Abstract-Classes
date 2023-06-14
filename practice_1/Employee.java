public interface Employee extends Comparable<Employee> {

    public int getMonthSalary();

    default int compareTo (Employee e){
        return Integer.compare(getMonthSalary(),e.getMonthSalary());
    }
}
