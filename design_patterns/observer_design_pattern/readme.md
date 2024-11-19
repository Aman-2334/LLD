# OBSERVER DESIGN PATTERN

## PROBLEM
Suppose we have an class i and a class j and for every change in the data of i we want to notify class j.

### EXAMPLE
In Amazon when a user clicks notify me for some product that has ran out of stock we want to notify them
when the stock updates.

## SOLUTION
- Create a Observer and Observable interface.
- Anything that needs to be observed should implement the observable interface and anything that needs update 
on changed data should implement the observer interface.
- Instead of passing the observable instance from notify method to observer update method we rather choose to
create a has-a relation between them and use constructor injection otherwise in the updata method we need to
check instanceof multiple times.