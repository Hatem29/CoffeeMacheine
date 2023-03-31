
package coffeemachine;

public abstract class Beans {
    
    String name;
    double calories;
    double caffeine;
    
    abstract String getInfo();  

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
