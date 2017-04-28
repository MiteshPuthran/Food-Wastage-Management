/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.userAccount.UserAccount;

/**
 *
 * @author indap.n
 */
public class ShortageWorkRequest extends WorkRequest {

    private CollectionWorkRequest linkedCollectionWorkRequest;
    private String ngoName;
    private UserAccount assignToEmployee;

    public CollectionWorkRequest getLinkedCollectionWorkRequest() {
        return linkedCollectionWorkRequest;
    }

    public void setLinkedCollectionWorkRequest(CollectionWorkRequest linkedCollectionWorkRequest) {
        this.linkedCollectionWorkRequest = linkedCollectionWorkRequest;
    }

    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public UserAccount getAssignToEmployee() {
        return assignToEmployee;
    }

    public void setAssignToEmployee(UserAccount assignToEmployee) {
        this.assignToEmployee = assignToEmployee;
    }

}
