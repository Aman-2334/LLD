# STRATEGY DESIGN PATTERN

## PROBLEM
Suppose we have a base class BASE where we define a function F, Now say we have N subclasses which inherit
this base class out of these N subclasses say we have 2 subclasses i and j that want a different implementation
of the function F say F' then their will be code repitition we have to repeat same function in both i and j.

### EXAMPLE
- BASE CLASS -> Class Vehicle has a drive() function
- SUB CLASS_1 -> Class Bike1 inherits Vehicle and needs the normal drive() function as implemented in Vehicle
- SUB CLASS_2 -> Class Bike2 inherits Vehicle and needs the off_road drive() function
- SUB CLASS_3 -> Class Bike3 inherits Vehicle and needs the off_road drive() function same as Bike2

## SOLUTION
- Create a interface drive_capability which has a function drive()
- Make for any new drive capability make a class which implements drive capability interface
- Example.
  - Class Off_road_drive implements drive_capability{}
  - Class Normal_drive implements drive_capability{}
- Create a has-a relationship between the Base Class and drive_capability interface and let the subclass decide
which type of drive_capability they want using constructor injection