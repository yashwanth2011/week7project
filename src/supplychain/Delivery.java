/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supplychain;


public class Delivery extends Services{
    
    
    private double Price_Per_Anum;

    private String[] Distributed_Area;

    

    public Delivery(double Price_Per_Anum, String[] Distributed_Area, 
            String Name, String Type, int Years, Company company) {
       
        super(Name, Type, Years, company);
        this.Price_Per_Anum = Price_Per_Anum;
        this.Distributed_Area = Distributed_Area;
    
    }
    
   

    
    public String[] getDistributed_Area() {
        return Distributed_Area;
    }

    public void setDistributed_Area(String[] Distributed_Area) {
        this.Distributed_Area = Distributed_Area;
    }
    
    

    public double getPrice_Per_Anum() {
        return Price_Per_Anum;
    }

    public void setPrice_Per_Anum(double Price_Per_Anum) {
        this.Price_Per_Anum = Price_Per_Anum;
    }

    @Override
    public String toString() {
        return "Delivery{" + 
                ", Price_Per_Anum=" + Price_Per_Anum + ", Distributed_Area=" + Distributed_Area + '}';
    }
    
    
    
}
