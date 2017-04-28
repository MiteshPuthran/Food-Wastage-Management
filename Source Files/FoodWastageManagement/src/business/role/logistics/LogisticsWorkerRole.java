/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.logistics;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.logistics.logisticsWorker.LogisticsWorkerWorkAreaJPanel;

/**
 *
 * @author indap.n
 */
public class LogisticsWorkerRole extends Role {

    public LogisticsWorkerRole() {
        super(RoleType.LogisticsWorker);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new LogisticsWorkerWorkAreaJPanel(userProcessContainer, account, enterprise, network);
    }

}
