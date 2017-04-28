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
public class LogisticsEnterprise extends Enterprise{

    public LogisticsEnterprise(String name) {
        super(name, EnterpriseType.Logistics);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
