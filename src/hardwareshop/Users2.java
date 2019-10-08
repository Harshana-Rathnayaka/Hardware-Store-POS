// same as user1 this class proved data for reciepts
package hardwareshop;

public class Users2 {

    private int Rid;
    private String casheirname;
    private String itemname;
    private int quantity;
    private String price;
    private String dateissued;
    private String total;
    private String balance;

    public Users2(int rid, String Casheirname, String Itemname, int Quantity, String Price, String Dateissued, String Total, String Balance) {

        this.Rid = rid;
        this.casheirname = Casheirname;
        this.itemname = Itemname;
        this.quantity = Quantity;
        this.price = Price;
        this.dateissued = Dateissued;
        this.total = Total;
        this.balance = Balance;

    }
    //getter methods

    public int getrid() {
        return Rid;
    }

    public String getCasheirname() {
        return casheirname;
    }

    public String getItemname() {
        return itemname;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public String getDateissued() {
        return dateissued;
    }

    public String getTotal() {
        return total;
    }

    public String getBalance() {
        return balance;
    }

}
