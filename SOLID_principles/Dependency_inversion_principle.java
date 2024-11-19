// Class should depend on interfaces rather than concrete implementation

interface keyboardInterface{}
class WiredKeyborad implements keyboardInterface{}
class WirelessKeyboard implements keyboardInterface{}

interface mouseInterface{}
class Wiredmouse implements mouseInterface{}
class Wirelessmouse implements mouseInterface{}

class Laptop{
    WiredKeyborad keyborad;
    Wiredmouse mouse;
    public Laptop(WiredKeyborad keyborad, Wiredmouse mouse){
        this.keyborad = keyborad; this.mouse = mouse;
    }
}

/* PROBLEM:
 * Here laptop class is wired to the concrete implementation of WiredKeyborad and WiredMouse class
 * if we want to create a laptop with WirelessKeyboard and WirelessMouse we have to change the class
 * this violates dependency inversion principle
 * 
 * SOLUTION:
 * Make class dependent on interface
 */

 class BetterLaptop{
    keyboardInterface keyborad;
    mouseInterface mouse;
    public BetterLaptop(WiredKeyborad keyborad, Wiredmouse mouse){
        this.keyborad = keyborad; this.mouse = mouse;
    }
}
public class Dependency_inversion_principle{
    public static void main(String[] args) {
        
    }
}