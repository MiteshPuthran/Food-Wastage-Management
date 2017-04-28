/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.government;

import business.organization.Organization;
import business.role.Role;
import business.role.government.GovernmentAdminRole;
import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class GovernmentAdminOrganization extends Organization{

    public GovernmentAdminOrganization() {
        super(Organization.Type.GovernmentAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAdminRole());
        return roles;
    }
    
    
}
