
package coffeemachine;

public class Beans {
    
    String name;
    double water, coffee;

    public Beans() {
        
    }
    
    void options(boolean single, boolean esp){}
    
    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getCoffee() {
        return coffee;
    }

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }
    double calories;
    double caffeine;
    
    protected void setName(String name) {
        this.name = name;
    }
    
    protected void setCalories(double calories) {
        this.calories = calories;
    }

    protected void setCaffeine(double caffeine) {
        this.caffeine = caffeine;
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getCaffeine() {
        return caffeine;
    }
}
