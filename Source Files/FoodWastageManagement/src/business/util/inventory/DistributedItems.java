/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.util.inventory;

import business.util.request.RequestItem;

/**
 *
 * @author indap.n
 */
public class DistributedItems {

    private RequestItem distributedRequestItem;
    private int quantityDistributed;

    public RequestItem getDistributedRequestItem() {
        return distributedRequestItem;
    }

    public void setDistributedRequestItem(RequestItem distributedRequestItem) {
        this.distributedRequestItem = distributedRequestItem;
    }

    public int getQuantityDistributed() {
        return quantityDistributed;
    }

    public void setQuantityDistributed(int quantityDistributed) {
        this.quantityDistributed = quantityDistributed;
    }

}
