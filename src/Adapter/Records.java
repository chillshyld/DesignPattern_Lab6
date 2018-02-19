/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;
import java.util.ArrayList;


/**
 *
 * @author boonjv
 */
public class Records implements RecordsBehavior {

    private ArrayList<Employee> employees; //Stores the employees

    public Records() {
        employees = new ArrayList<Employee>();
    }

    public void insert(Employee employee) {
        //Code to insert employee
        this.employees.add(employee);
    }

    public void remove(long emp_num) {
        //Code to remove employee
        this.employees.remove((int) (emp_num - 1));
    }

    public boolean isEmployee(long emp_num) {
        //Code to find employee
        for (Employee emp: this.employees){
            if (emp.getEmpNum() == emp_num){
                return true;
            }
        }
        return false;
    }


    @Override
    public void printAllEmployee() {
        for(Employee emp:this.employees){
            System.out.println("id: " + emp.getEmpNum() + ",name: " + emp.getName() + ",surname: " + emp.getSurname() + ",salary: " + emp.getSalary());
        }
    }
}
