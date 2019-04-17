package invoiceitem;


public class TestInvoiceItem {
    public static void main (String[] args){
        InvoiceItem x = new InvoiceItem("fe34598123","paliwo",5,30);
        System.out.println("InvoiceItem ID: "+ x.getId() + "\nDescription: "+ x.getDesc() + "\nQuantity: " + x.getQty() + "\nUnit Price: " + x.getUnitPrice());
    }
}
