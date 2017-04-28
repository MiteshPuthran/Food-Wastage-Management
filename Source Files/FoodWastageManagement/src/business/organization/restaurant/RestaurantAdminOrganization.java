/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.restaurant;

import business.organization.Organization;
import business.role.restaurant.RestaurantAdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class RestaurantAdminOrganization extends Organization{

    public RestaurantAdminOrganization() {
        super(Type.RestaurantAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestaurantAdminRole());
        return roles;
    }
    
}
