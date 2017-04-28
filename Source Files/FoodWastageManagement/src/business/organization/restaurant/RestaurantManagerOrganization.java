/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.restaurant;

import business.organization.Organization;
import business.role.restaurant.RestaurantManagerRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class RestaurantManagerOrganization extends Organization {

    public RestaurantManagerOrganization() {
        super(Type.RestaurantManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestaurantManagerRole());
        return roles;
    }

}
