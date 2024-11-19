// Objects or entities should be open for extension but closed for modification.

class InvoiceDao{
    Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        // save invoice to DB logic
    }
}

/* PROBLEM:
 * Suppose we have the invoiceDao class that currently saves the invoice to a DB
 * say this class is tested and taking live traffic and i want to add a new method to now save to file
 * so making a new function in this class will violate the open closed principle because making changes to a tested
 * class may be prone to bugs.
 * 
 * SOLUTION:
 * Make an interface and for every new capability extend from the interface
 */

interface invoiceDao{
    public void save();
}

class DatabaseInvoiceDao implements invoiceDao{
    @Override
    public void save() {
        // save to DB
    }
}

class FileInvoiceDao implements invoiceDao{
    @Override
    public void save() {
        // save to File
    }
}

class Open_closed_principle{
    public static void main(String[] args) {
        
    }
}