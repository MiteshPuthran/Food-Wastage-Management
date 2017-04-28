/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.userAccount.UserAccount;
import business.util.request.RequestItem;

import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class CollectionWorkRequest extends WorkRequest {

    private UserAccount raisedBy;
    private UserAccount deliverTo;
    private UserAccount deliveredBy;
    private String raisedByRestaurant;
    private String deliverToNGO;
    private String deliveredByLogistics;
    private ArrayList<RequestItem> requestItems;
    private double totalQuantity;
    private double deliveryCost;
    private boolean paid;
    private boolean invoiceGenerated;

    public CollectionWorkRequest() {
        requestItems = new ArrayList();
    }

    public String getRaisedByRestaurant() {
        return raisedByRestaurant;
    }

    public void setRaisedByRestaurant(String raisedByRestaurant) {
        this.raisedByRestaurant = raisedByRestaurant;
    }

    public String getDeliverToNGO() {
        return deliverToNGO;
    }

    public void setDeliverToNGO(String deliverToNGO) {
        this.deliverToNGO = deliverToNGO;
    }

    public ArrayList<RequestItem> getRequestItems() {
        return requestItems;
    }

    public void setRequestItems(ArrayList<RequestItem> requestItems) {
        this.requestItems = requestItems;
    }

    public double getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(double totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public UserAccount getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(UserAccount raisedBy) {
        this.raisedBy = raisedBy;
    }

    public UserAccount getDeliveredBy() {
        return deliveredBy;
    }

    public void setDeliveredBy(UserAccount deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public UserAccount getDeliverTo() {
        return deliverTo;
    }

    public void setDeliverTo(UserAccount deliverTo) {
        this.deliverTo = deliverTo;
    }

    public String getDeliveredByLogistics() {
        return deliveredByLogistics;
    }

    public void setDeliveredByLogistics(String deliveredByLogistics) {
        this.deliveredByLogistics = deliveredByLogistics;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean getInvoiceGenerated() {
        return invoiceGenerated;
    }

    public void setInvoiceGenerated(boolean invoiceGenerated) {
        this.invoiceGenerated = invoiceGenerated;
    }

    public void addRequestItem(String food, int quantity, int hoursToPerish) {
        RequestItem ri = new RequestItem(food, quantity, hoursToPerish);
        requestItems.add(ri);
    }

    public void updatePerishable() {
        for (RequestItem ri : requestItems) {
            if (ri.getHoursToPerish() > 0 && ri.getQuantity() > 0) {
                ri.setHoursToPerish(ri.getHoursToPerish() - 0.25);
                System.out.println(ri.getFoodName() + " " + ri.getHoursToPerish());
            }
        }
    }
}
