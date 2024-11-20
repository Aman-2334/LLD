# OBSERVER DESIGN PATTERN

## PROBLEM
Suppose we have an class i with some feature F1 now we say we needed to add some more feature F2 to it so
we create a new class and extend the base class now suppose we again want to add a new feature F3 and so on.
The total number of class needed would be the total different combinations of features and it will lead to
class explosion (we end up with too many classes to manage). For just 3 features F1, F2 and F3 we end up with
7 classes F1, F2, F3, F1+F2, F1+F3, F2+F3, F1+F2+F3.

### EXAMPLE
Pizza Shop, we create a pizza can keep on adding multiple combination of toppings to it.
Coffee Machine

## SOLUTION
- Decorator Pattern.
- We create an abstract base class A and an abstract decorator class B which has-a instance of A and also
is-a instance of A. So we can decorate A with B and since B itself is-a A we can decorate that too and so on.