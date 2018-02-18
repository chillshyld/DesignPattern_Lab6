package Adapter;

public interface RecordsBehavior {
    public void insert(Employee employee);
    public void remove(long emp_num);
    public boolean isEmployee(long emp_num);
}
