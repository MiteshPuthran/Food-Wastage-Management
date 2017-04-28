/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Enterprise addEnterprise(String name, EnterpriseType type) {

        Enterprise enterprise = null;
        if (type == EnterpriseType.Restaurant) {
            enterprise = new RestaurantEnterprise(name);
        } else if (type == EnterpriseType.Logistics) {
            enterprise = new LogisticsEnterprise(name);
        } else if (type == EnterpriseType.NGO) {
            enterprise = new NGOEnterprise(name);
        } else if (type == EnterpriseType.Government) {
            enterprise = new GovernmentEnterprise(name);
        }

        enterpriseList.add(enterprise);
        return enterprise;
    }

    public void removeEnterprise(Enterprise e) {
        enterpriseList.remove(e);
    }

    public boolean checkIfEnterpriseExists(String enterpriseName, EnterpriseType type) {
        for (Enterprise e : enterpriseList) {
            if ((e.getEnterpriseType() == type) && (e.getName().equals(enterpriseName))) {
                return true;
            }
        }
        return false;
    }

}
