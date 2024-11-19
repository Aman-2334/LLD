package design_patterns.strategy_design_pattern;

interface driveCapability{
    void drive();
}

class Off_road_drive implements driveCapability{
    @Override
    public void drive() {
        // Off-road drive capability
    }
}

class Commuter_drive implements driveCapability{
    @Override
    public void drive() {
        // commuter drive capability
    }
}

class Vehicle{
    driveCapability driveCapability;
    //Constructor Injection
    public Vehicle(driveCapability capability){
        this.driveCapability = capability;
    }

    public void drive(){
        driveCapability.drive();
    }
}

class Bike1 extends Vehicle{
    public Bike1(){
        super(new Commuter_drive());
    }
}

class Bike2 extends Vehicle{
    public Bike2(){
        super(new Off_road_drive());
    }
}

class Bike3 extends Vehicle{
    public Bike3(){
        super(new Off_road_drive());
    }
}

public class strategy_design_pattern {
    public static void main(String[] args) {
        
    }
}
