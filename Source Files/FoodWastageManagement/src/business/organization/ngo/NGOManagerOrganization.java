/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.ngo;

import business.organization.Organization;
import business.role.Role;
import business.role.ngo.NGOManagerRole;
import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class NGOManagerOrganization extends Organization {

    public NGOManagerOrganization() {
        super(Type.NGOManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOManagerRole());
        return roles;
    }

}
