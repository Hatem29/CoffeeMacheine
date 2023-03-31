
package coffeemachine;

import java.util.Scanner;

public class Robusta extends Beans{
    boolean single;
    boolean espresso;
    
    public Robusta() {
        super.setName("Robusta");
        super.setCalories(calories); //set calories
        super.setCaffeine(caffeine); //set caffeine
        
        espresso = true;
        single = true;
    }
    
    void options()
    {
        Scanner input = new Scanner(System.in);
        int shot, type;
        
        System.out.println("Do you want your coffee to be Espresso or Americano? (1 or 2) \n");
        type = input.nextInt();
        
        System.out.println("Do you want your coffee to be single or double shot? (1 or 2) \n");
        shot = input.nextInt();
                
        if(type == 1)
            espresso = true;
        else
            espresso = false;
        
        if(shot == 1)
            single = true;
        else
            single = false;
    }
    
    @Override
    String getInfo()
    {
        String info = "";
        
        
        return info;
    }
}
