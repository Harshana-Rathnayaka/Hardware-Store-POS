//this class stores relavant searched data from the database and acts as a data provider
package hardwareshop;

public class User {
    //initializing objects for call back
    private int Iid;
    private String itemname;
    private String itemtype;
    private int quantity;
    private String unitprice;
    private String dateentered;
    
    
    
    public User(int iid,String Itemname,String Itemtype,int Quantity,String Unitprice,String Dateentered){
        
            this.Iid = iid;
            this.itemname =Itemname;
            this.itemtype=Itemtype;
            this.quantity=Quantity;
            this.unitprice=Unitprice;
            this.dateentered=Dateentered;
        
    }
    
     //getter method is used here
    public int getiid(){
            return Iid;
        }
         public String getItemname(){
            return itemname;
        }
          public String getItemtype(){
            return itemtype;
        }
           public int getQuantity(){
            return quantity;
        }
            public String getUnitprice(){
            return unitprice;
        }
             public String getDateentered(){
            return dateentered;
        }
    
    
}
