package Adapter;

import java.util.Vector;
import java.util.ArrayList;

public class DatabaseAdapter implements RecordsBehavior {
    private DBBehavior database;

    public DatabaseAdapter() {
        this.database = new Database();
    }

    @Override
    public void insert(Employee employee) {
        this.database.addEmployee(employee);
    }

    @Override
    public void remove(long emp_num) {
        this.database.deleteEmployee(emp_num);

    }

    @Override
    public boolean isEmployee(long emp_num) {
        return this.database.isEmployee(emp_num);
    }

    @Override
    public void printAllEmployee(){
        this.database.printAllEmployee();
    }



}
