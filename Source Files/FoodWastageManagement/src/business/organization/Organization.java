/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.role.Role;
import business.userAccount.UserAccountDirectory;
import business.workQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public abstract class Organization {

    private static int counter = 0;
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;

    public enum Type {
        NGOAdmin("NGO Admin Organization"),
        NGOManager("NGO Manager Organization"),
        NGOWorker("NGO Worker Organization"),
        LogisticsAdmin("Logistics Admin Organization"),
        LogisticsManager("Logistics Manager Organization"),
        LogisticsWorker("Logistics Worker Organization"),
        RestaurantAdmin("Restaurant Admin Organization"),
        RestaurantManager("Restaurant Manager Organization"),
        RestaurantWorker("Restaurant Worker Organization"),
        GovernmentAdmin("Government Admin Organization"),
        GovernmentMayor("Government Mayor Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return this.value;
        }
        
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
