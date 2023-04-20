
package coffeemachine;

public class Arabica extends Beans{
    
    public Arabica() {
        super.setName("Arabica");
        super.setCalories(3); //set calories
        super.setCaffeine(0.035); //set caffeine
        
        coffee = 10;
        water = 170;
    }
          
    
    @Override
    String getInfo()
    {
        String info = "";
        
        return info;
    }
}
