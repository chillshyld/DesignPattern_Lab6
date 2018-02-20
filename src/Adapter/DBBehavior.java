package Adapter;

public interface DBBehavior {
    public void addEmployee(Employee employee);
    public void deleteEmployee(long emp_num);
    public boolean isEmployee(long emp_nump);
    public void printAllEmployee();
}
