/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

/**
 *
 * @author indap.n
 */
public class Employee {
    
    private static int count = 0;
    private int id;
    private String name;

    public Employee() {
        id = ++count;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
