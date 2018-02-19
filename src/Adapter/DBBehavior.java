package Adapter;

public interface DBBehavior {
    public void addEmployee(Employee employee);
    public void deleteEmployee(long emp_num);
    public void printAllEmployee();
}
