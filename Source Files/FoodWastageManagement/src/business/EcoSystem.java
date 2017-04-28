/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.enterprise.Enterprise;
import business.role.Role;
import business.organization.Organization;
import business.network.Network;
import business.role.SystemAdminRole;
import business.userAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;

    private EcoSystem() {
        super(null);
        networkList = new ArrayList();
    }

    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SystemAdminRole());
        return roles;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network createAndAddNetwork() {
        Network n = new Network();
        networkList.add(n);
        return n;
    }

    public boolean checkIfNetworkExisits(String networkName) {
        for (Network n : networkList) {
            if (n.getName().equals(networkName)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfUserNameIsUnique(String userName) {
        for (Network n : networkList) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                // Check Enterprise's UAD
                UserAccountDirectory uad = e.getUserAccountDirectory();
                if (uad.checkIfUserNameExists(userName)) {
                    return true;
                }

                // Check Enterprise's organizations
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    uad = o.getUserAccountDirectory();
                    if (uad.checkIfUserNameExists(userName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
