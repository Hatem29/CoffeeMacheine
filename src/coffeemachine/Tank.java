
package coffeemachine;

public class Tank {
    double water;
    double Robusta, Arabica;
    final double waterCap = 2000;
    final double robustaCap = 500;
    final double arabicaCap = 500;
    MyLogger l=new MyLogger();

    public double getWater() {
        return water;
    }

    public void refillWater() {
        this.water += 500;
        if(water > waterCap)
        {
            water = waterCap;
            throw new CoffeeMachineExceptions("Water overflow");
        }
        l.log(water, Arabica, Robusta, CoffeeFrame.cups);
    }

    public double getRobusta() {
        return Robusta;
    }

    public void refillRobusta() {
        this.Robusta += 100;
        if(Robusta > robustaCap)
        {
            Robusta = robustaCap;
            throw new CoffeeMachineExceptions("Robusta beans overflow");
        }
        l.log(water, Arabica, Robusta, CoffeeFrame.cups);
    }

    public double getArabica() {
        return Arabica;
    }

    public void refillArabica() {
        this.Arabica += 100;
        if(Arabica > arabicaCap)
        {
            Arabica = arabicaCap;
            throw new CoffeeMachineExceptions("Arabica beans overflow");
        }
        l.log(water, Arabica, Robusta, CoffeeFrame.cups);
    }
    
    void drain(double coffee, double water, String name)
    {
        if(this.water < water)
            throw new CoffeeMachineExceptions("Not enough water");
            
        this.water -= water;
        
        if(name.equals("Arabica")){
            if(this.Arabica < coffee)
                throw new CoffeeMachineExceptions("Not enough Arabica beans");
                
            this.Arabica -= coffee;
        }
        else{
            if(this.Robusta < coffee)
                throw new CoffeeMachineExceptions("Not enough Robusta beans");
            
            this.Robusta -= coffee;
        }
        l.log(this.water, Arabica, Robusta, CoffeeFrame.cups);
    }
    
    public Tank() {
        this.water = waterCap;
        this.Robusta = robustaCap;
        this.Arabica = arabicaCap;
    }
    
}
