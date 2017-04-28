/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.employee.Employee;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount addUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public void removeUserAccount(UserAccount ua) {
        userAccountList.remove(ua);
    }

    public UserAccount searchUser(String userName, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(userName)) {
                if (ua.matchPassword(password, ua.getPassword())) {
                    return ua;
                }
            }
        }
        return null;
    }

    public UserAccount searchUser(Employee employee) {
        for (UserAccount ua : userAccountList) {
            if (ua.getEmployee().equals(employee)) {
                return ua;
            }
        }
        return null;
    }

    public boolean checkIfUserNameExists(String userName) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    
}
