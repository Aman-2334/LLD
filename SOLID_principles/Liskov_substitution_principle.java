/*
 * If class B is a subtype of class A then we should be able to replace object of A with B without breaking the behaviour of the program
 * Alternatively: Subclass should extend the capabilities of parent class and not narrow it down
 */

interface bike{
    public void turnOnEngine();
    public void accelerate();
}

class MotorBike implements bike{
    @Override
    public void turnOnEngine() {}
    @Override
    public void accelerate() {}
}

class Bicycle implements bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }
    @Override
    public void accelerate() {}
}

/* PROBLEM
 * Here bicycle implements bike but doesnt have an engine so it throws an error for
 * turn on engine now if we have a seperate class that takes and instance of bike and does
 * bike.turnOnEngine() this will break if we pass a bicycle object because even though
 * technically its a bike it doesnt have the turn on Engine functionality so we have narrowed
 * the capability of the parent class violating liskov substitution principle and a cheap way to
 * fix these will be write if .isInstanceof() in multiple places
 * 
 * SOLUTION:
 * Put only very generic methods in parent class that is common to all base classes
 */

public class Liskov_substitution_principle {
    public static void main(String[] args) {

    }
}