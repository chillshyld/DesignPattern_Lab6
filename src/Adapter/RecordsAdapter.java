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
}
