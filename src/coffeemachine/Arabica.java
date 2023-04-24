
package coffeemachine;

public class Arabica extends Beans{
    
    public Arabica() {
        super.setName("Arabica");
        
        coffee = 10;
        water = 170;
        super.setCalories(3 * coffee); //set calories
        super.setCaffeine(0.035 * coffee); //set caffein
    }
          
    String getInfo()
    {
        String info = "";
        
        return info;
    }
}
