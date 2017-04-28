/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class RestaurantEnterprise extends Enterprise {

    public RestaurantEnterprise(String name) {
        super(name, EnterpriseType.Restaurant);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
