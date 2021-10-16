/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supplychain;


public class Services implements Observer_Logistics, State{

    private String Name;
    
    private String Type;

    private int Years;
    
     private Company company;
    
    
    public Services() {
    }

    public Services(String Name, String Type, int Years, Company company) {
        this.Name = Name;
        this.Type = Type;
        this.Years = Years;
        this.company = company;
    }

    

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    
    
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getYears() {
        return Years;
    }

    public void setYears(int Years) {
        this.Years = Years;
    }
    
    
    
    
    @Override
    public double Annual_Services() {
    return 0;
    }

    @Override
    public void StateLogistics() {
    
    }

    @Override
    public String toString() {
        return "Services{" + "Name=" + Name + ", Type=" + Type + ", Years=" + Years + '}';
    }

    
    
    
    
}
