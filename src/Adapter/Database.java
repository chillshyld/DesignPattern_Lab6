/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author boonjv
 */
import java.util.Vector;

/**
 *
 * @author boonjv
 */
public class Database implements DBBehavior {

    private Vector<Employee> employees; //Stores the employees

    public Database() {
        employees = new Vector<Employee>();
    }

    public void addEmployee(Employee employee) {
        //Code to add employee
        this.employees.add(employee);

    }

    public void deleteEmployee(long emp_num) {
        //Code to delete employee
        for (Employee emp :this.employees) {
            if (emp.getEmpNum() == emp_num)
                this.employees.remove(emp);
        }
    }

    public int getTotalEmployee(){
        return employees.size();
    }

    public Vector<Employee> getEmployeesDatabase(){
        return this.employees;
    }

}
