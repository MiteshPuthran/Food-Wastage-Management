/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

/**
 *
 * @author indap.n
 */
public class PaymentWorkRequest extends WorkRequest{
    
    private CollectionWorkRequest collectionWorkRequest;

    public CollectionWorkRequest getCollectionWorkRequest() {
        return collectionWorkRequest;
    }

    public void setCollectionWorkRequest(CollectionWorkRequest collectionWorkRequest) {
        this.collectionWorkRequest = collectionWorkRequest;
    }
    
    @Override
    public String toString(){
        return collectionWorkRequest.getDeliveredByLogistics();
    }
    
}
