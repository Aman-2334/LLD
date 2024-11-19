// A class should have one and only one reason to change, meaning that a class should have only one job.

class Marker{
    int price;
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}

class Invoice{
    int quantity;
    public Invoice(int quantity){
        this.quantity = quantity;
    }

    public void generateInvoice(){
        // generate invoice logic
    }
    public void saveToDB(){
        // save to DB logic
    }
}

/* PROBLEM:
 * The invoice class violates the single responsibility theorm
 * If i have to make some changes in generating the invoice logic like including discount then this class will change
 * If i have to make some changes to how to save in the DB then also this class will change 
 * So the invoice class has multiple reason to change violating the single responsibility theorm
 * 
 * SOLUTION:
 * Make Seperate classes for each responsibility
 */

class InvoicePrinter{
    Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }
    public void generateInvoice(){
        //generate invoice login
    }
}

class InvoiceDao{
    Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        // save invoice to DB logic
    }
}

class Single_responsibility_principle{
    public static void main(String[] args) {
        
    }
}