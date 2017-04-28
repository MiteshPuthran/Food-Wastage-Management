/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee addEmployee(String name) {
        Employee e = new Employee();
        e.setName(name);
        employeeList.add(e);
        return e;
    }

    public void removeEmployee(Employee e) {
        employeeList.remove(e);
    }

}
