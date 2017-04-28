/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.employee.Employee;
import business.role.SystemAdminRole;
import business.userAccount.UserAccount;

/**
 *
 * @author indap.n
 */
public class ConfigureEcoSystem {

    public static EcoSystem configure() {
        EcoSystem ecoSystem = EcoSystem.getInstance();

        Employee employee = ecoSystem.getEmployeeDirectory().addEmployee("System Admin");
        UserAccount ua = new UserAccount();
        String password = ua.encodePassword("sysadmin");
        ua = ecoSystem.getUserAccountDirectory().addUserAccount("sysadmin", password, employee, new SystemAdminRole());

        return ecoSystem;

    }
}
