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
    }

    public void remove(long emp_num) {
        //Code to remove employee
    }

    public boolean isEmployee(long emp_num) {
        //Code to find employee
        return false;
    }


    @Override
    public ArrayList<Employee> printAllEmployee() {
        return this.employees;
    }
}
