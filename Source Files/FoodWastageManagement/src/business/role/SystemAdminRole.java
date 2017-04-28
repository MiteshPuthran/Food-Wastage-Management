/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.systemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author indap.n
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        super(null);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
          return new SystemAdminWorkAreaJPanel(userProcessContainer, business);
    }
    
}
