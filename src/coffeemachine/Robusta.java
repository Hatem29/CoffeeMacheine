
package coffeemachine;

import java.util.Scanner;

public class Robusta extends Beans{
    
    public Robusta() {
        super.setName("Robusta");
        super.setCalories(1); //set calories
        super.setCaffeine(0.075); //set caffeine
    }
    
    @Override
    void options(boolean single, boolean esp)
    {      
        if(esp && single)
        {
            coffee = 7;
            water = 30;
            
        }
        else if(esp && !single)
        {
            coffee = 14;
            water = 60;
        }
        else if(!esp && single)
        {
            coffee = 7;
            water = 170;
        }
        else
        {
            coffee = 14;
            water = 220;
        }
        
        super.setCalories(1 * coffee); //set calories
        super.setCaffeine(0.075 * coffee); //set caffein
        
    }

    String getInfo()
    {
        String info = "";
        
        
        return info;
    }
}
