/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.logistics;

import business.organization.Organization;
import business.role.Role;
import business.role.logistics.LogisticsWorkerRole;
import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class LogisticsWorkerOrganization extends Organization {

    public LogisticsWorkerOrganization() {
        super(Type.LogisticsWorker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LogisticsWorkerRole());
        return roles;
    }
    
}
