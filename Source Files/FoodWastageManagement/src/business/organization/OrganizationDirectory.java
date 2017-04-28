/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.restaurant.RestaurantAdminOrganization;
import business.organization.restaurant.RestaurantWorkerOrganization;
import business.organization.restaurant.RestaurantManagerOrganization;
import business.organization.ngo.NGOWorkerOrganization;
import business.organization.ngo.NGOManagerOrganization;
import business.organization.ngo.NGOAdminOrganization;
import business.organization.logistics.LogisticsManagerOrganization;
import business.organization.logistics.LogisticsWorkerOrganization;
import business.organization.logistics.LogisticsAdminOrganization;
import business.organization.Organization.Type;
import business.organization.government.GovernmentAdminOrganization;
import business.organization.government.GovernmentMayorOrganization;
import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    public Organization addOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.NGOAdmin.getValue())) {
            organization = new NGOAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.NGOManager.getValue())) {
            organization = new NGOManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.NGOWorker.getValue())) {
            organization = new NGOWorkerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.LogisticsAdmin.getValue())) {
            organization = new LogisticsAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.LogisticsManager.getValue())) {
            organization = new LogisticsManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.LogisticsWorker.getValue())) {
            organization = new LogisticsWorkerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.RestaurantAdmin.getValue())) {
            organization = new RestaurantAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.RestaurantManager.getValue())) {
            organization = new RestaurantManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.RestaurantWorker.getValue())) {
            organization = new RestaurantWorkerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.GovernmentAdmin.getValue())) {
            organization = new GovernmentAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.GovernmentMayor.getValue())) {
            organization = new GovernmentMayorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void remoeOrganization(Organization o){
        organizationList.remove(o);
    }

}
