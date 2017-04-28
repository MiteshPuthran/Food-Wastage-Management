/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.util.inventory;

import business.util.request.RequestItem;
import java.util.ArrayList;

/**
 *
 * @author vighnesh
 */
public class Inventory {

    private ArrayList<RequestItem> requestItemList;

    public void setRequestItemList(ArrayList<RequestItem> requestItemList) {
        this.requestItemList = requestItemList;
    }
    
    public ArrayList<RequestItem> getRequestItemList() {
        return requestItemList;
    }

    public Inventory() {
        requestItemList = new ArrayList<RequestItem>();
    }

    public void addRequestItem(RequestItem requestItem) {
        requestItemList.add(requestItem);
    }

    public void removeRequestItem(RequestItem requestItem) {
        requestItemList.remove(requestItem);
    }

}
