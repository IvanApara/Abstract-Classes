
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Company {
    protected ArrayList<Employee> staff = new ArrayList<>();
    List<Employee> topSalary = new ArrayList<>();
    List<Employee> lowestSalary = new ArrayList<>();
    protected double incomeCompany = 11_000_000;

    public ArrayList<Employee> hire(Employee employee){
        staff.add(employee);
        return staff;
    }

    public ArrayList<Employee> hireAll(Collection<Employee> employees) {
        for (Employee employee: employees) {
            staff.add(employee);
        }
        return staff;
    }

    public ArrayList fire(Employee employee){
        staff.remove(employee);
        return staff;
    }

    public double getIncome() {
        return incomeCompany;
    }

    public List<Employee> getTopSalaryStaff(int count){
        Collections.sort(staff, Collections.reverseOrder());
        for (int i = 0; i < count; i++) {
            topSalary.add(staff.get(i));
        }
        return topSalary;
    }

    public List<Employee> getLowestSalaryStaff(int count){
        Collections.sort(staff);
        for (int i = 0; i < count; i++) {
            lowestSalary.add(staff.get(i));
        }
        return lowestSalary;
    }

}
