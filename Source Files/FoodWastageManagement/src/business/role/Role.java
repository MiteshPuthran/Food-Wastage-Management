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

/**
 *
 * @author indap.n
 */
public abstract class Role {

    public RoleType roleType;

    public enum RoleType {
        NGOMAdmin("NGO Admin"),
        NGOManager("NGO Manager"),
        NGOWorker("NGO Worker"),
        LogisticsAdmin("Logistics Admin"),
        LogisticsManager("Logistics Manager"),
        LogisticsWorker("Logistics Worker"),
        RestaurantAdmin("Restaurant Admin"),
        RestaurantManager("Restaurant Manager"),
        RestaurantWorker("Restaurant Worker"),
        GovernmentAdmin("Government Admin"),
        GovernmentMayor("Government Mayor");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return roleType.getValue();
    }

}
