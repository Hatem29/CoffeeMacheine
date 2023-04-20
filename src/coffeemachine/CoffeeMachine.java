package coffeemachine;

import java.util.Scanner;

public class CoffeeMachine {
    
    private Grinder grinder;
    private Tank tank;
    private Beans bean;

    public Grinder getGrinder() {
        return grinder;
    }

    public void setGrinder(Grinder grinder) {
        this.grinder = grinder;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Beans getBean() {
        return bean;
    }

    public void setBean(Beans bean) {
        this.bean = bean;
    }

    public CoffeeMachine() {
    }
    
    
}
