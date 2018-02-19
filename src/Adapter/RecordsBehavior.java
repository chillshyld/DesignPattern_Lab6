package Adapter;

import java.util.ArrayList;

public interface RecordsBehavior {
    public void insert(Employee employee);
    public void remove(long emp_num);
    public boolean isEmployee(long emp_num);
    public ArrayList<Employee> printAllEmployee();
}
