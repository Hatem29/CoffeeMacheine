
package coffeemachine;

public class Tank {
    double water;
    double Robusta, Arabica;
    final double waterCap = 2000;
    final double robustaCap = 500;
    final double arabicaCap = 500;

    public double getWater() {
        return water;
    }

    public void refillWater() {
        this.water = 500;
    }

    public double getRobusta() {
        return Robusta;
    }

    public void refillRobusta() {
        this.Robusta += 100;
    }

    public double getArabica() {
        return Arabica;
    }

    public void refillArabica() {
        this.Arabica += 100;
    }
    
    void drain(double coffee, double water, String name)
    {
        this.water -= water;
        if(name.equals("Arabica")){
            Arabica -= coffee;
        }
        else{
            Robusta -= coffee;
        }
    }
    
    public Tank() {
        this.water = waterCap;
        this.Robusta = robustaCap;
        this.Arabica = arabicaCap;
    }
    
}
