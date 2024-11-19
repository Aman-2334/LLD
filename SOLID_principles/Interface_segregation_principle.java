/*
 * A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.
 */

interface restrauntEmployee{
    public void washDishes();
    public void cookFood();
    public void serveCustomers();
}

class Chef implements restrauntEmployee{
    @Override
    public void cookFood() {
        // cook food
    }
    @Override
    public void washDishes() {}
    @Override
    public void serveCustomers() {}
}

class Waiter implements restrauntEmployee{
    @Override
    public void cookFood() {}
    @Override
    public void washDishes() {}
    @Override
    public void serveCustomers() {
        // serve customers
    }
}
/* PROBLEM
 * Here the Chef class and Waiter class is forced to implement the function that is not their responsibility
 * so we are breaking the interface segregation principle here.
 * 
 * SOLUTION:
 * Segregate the interfaces so that the client implementing the interface doesnt have to implement unnecessary functions
 */

interface waiterInterface{
    public void serveCustomers();
}
interface chefInterface{
    public void cookFood();
}

class BetterChef implements chefInterface{
    @Override
    public void cookFood() {
        // cook food
    }
}

class BetterWaiter implements waiterInterface{
    @Override
    public void serveCustomers() {
        // serve customers
    }
}

public class Interface_segregation_principle{
    public static void main(String[] args) {
        
    }
}