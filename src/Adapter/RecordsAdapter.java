package Adapter;

public class RecordsAdapter implements DBBehavior {
    private Records records;

    public RecordsAdapter() {
        this.records = new Records();
    }

    @Override
    public void addEmployee(Employee employee) {
        this.records.insert(employee);
    }

    @Override
    public void deleteEmployee(long emp_num) {
        this.records.remove(emp_num);
    }

    @Override
    public boolean isEmployee(long emp_nump) {
        return this.records.isEmployee(emp_nump);
    }

    public void printAllEmployee(){
        this.records.printAllEmployee();
    }
}
