/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.ngo;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ngo.ngoManager.NGOManagerWorkAreaJPanel;

/**
 *
 * @author indap.n
 */
public class NGOManagerRole extends Role {

    public NGOManagerRole() {
        super(RoleType.NGOManager);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new NGOManagerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network);
    }

}
