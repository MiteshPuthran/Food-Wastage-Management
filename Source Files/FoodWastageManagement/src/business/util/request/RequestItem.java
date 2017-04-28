/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.util.request;

/**
 *
 * @author indap.n
 */
public class RequestItem {
    
    private String foodName;
    private int quantity;
    private double hoursToPerish;

    public RequestItem(String foodName, int quantity, double hoursToPerish) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.hoursToPerish = hoursToPerish;
    }
    
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getHoursToPerish() {
        return hoursToPerish;
    }

    public void setHoursToPerish(double hoursToPerish) {
        this.hoursToPerish = hoursToPerish;
    }
    
    @Override
    public String toString(){
        return foodName;
    }
    
}
