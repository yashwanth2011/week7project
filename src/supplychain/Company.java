/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supplychain;


public class Company {

    
    
    private String name;
    
    private String Head_Office;

    public Company(String name, String Head_Office) {
        this.name = name;
        this.Head_Office = Head_Office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead_Office() {
        return Head_Office;
    }

    public void setHead_Office(String Head_Office) {
        this.Head_Office = Head_Office;
    }

    @Override
    public String toString() {
        return "Company{" + "name=" + name + ", Head_Office=" + Head_Office + '}';
    }
    
    

    
}
