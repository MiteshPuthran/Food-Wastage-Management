/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.util.inventory;

import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class Distributed {

    private ArrayList<DistributedItems> distributedItemList;
    private int peopleFed;

    public Distributed() {
        distributedItemList = new ArrayList();
    }

    public ArrayList<DistributedItems> getDistributedItemList() {
        return distributedItemList;
    }

    public int getPeopleFed() {
        return peopleFed;
    }

    public void setPeopleFed(int peopleFed) {
        this.peopleFed = peopleFed;
    }

    public void removeDistributedItem(DistributedItems di) {
        distributedItemList.remove(di);
    }

    public DistributedItems addDistributedItems() {
        DistributedItems di = new DistributedItems();
        distributedItemList.add(di);
        return di;
    }

}
