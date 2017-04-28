/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.util.food;

import java.util.HashMap;

/**
 *
 * @author indap.n
 */
public class Food {

    // Food Name and quantity(in pounds) per serving
    public static HashMap foodMap;

    public static void initializeFood() {
        foodMap = new HashMap();
        foodMap.put("Fruits", 1d);
        foodMap.put("Sandwich", 0.75d);
        foodMap.put("Meat", 2d);
        foodMap.put("Pizza", 3d);
        foodMap.put("Eggs", 1d);
        foodMap.put("Salad", 0.5d);
    }

    public static HashMap getFoodMap() {
        return foodMap;
    }

    public static double getFoodQuantityPerServing(String name) {
        return (double) foodMap.get(name);
    }

}
