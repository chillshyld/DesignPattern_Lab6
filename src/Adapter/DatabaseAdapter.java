package Adapter;

import java.util.Vector;

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
        Vector<Employee> employeeVect = (new Database()).getEmployeesDatabase();

        for(int i = 0;i < employeeVect.size(); i++){
            if (employeeVect.elementAt(i).getEmpNum() == emp_num){
                return true;
            }
        }
        return false;
    }
}
