public class Purchase {
    private String invoiceNumber;
    private double saleAmount;
    private double tax;
    
    public static void main(String[] args){}    

    public Purchase(String invoiceNumber, double saleAmount) {
        this.invoiceNumber = invoiceNumber;
        setSaleAmount(saleAmount);
        
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        
    }

    public double getSaleAmount() {
        return saleAmount;
    }

   public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
        calculateSalesTax();
    }
    public double getTax() {
        return tax;
    }
    
    private void calculateSalesTax() {
        tax = 0.05 * saleAmount;
    }

    
    public void display() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Sale Amount: $" + saleAmount);
        System.out.println("Sales Tax: $" + tax);
    }

    
}
