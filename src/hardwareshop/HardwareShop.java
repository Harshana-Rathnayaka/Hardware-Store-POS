
package hardwareshop;

public class HardwareShop {

    public static void main(String[] args) {
        
        //splash(loading screen) screen starts the program
        //initializing objects of next jframes
        splashscreen obr = new splashscreen();
        obr.setVisible(true);
        CashierLogin obr2 = new CashierLogin();
        
        //loading action using a for loop
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(12);
                obr.loadingtxt.setText("Staring Services.."+Integer.toString(i) + "%");
                obr.loadingpgbar.setValue(i);
                 for (int x = 20; x <= 25; x++) {
                Thread.sleep(1);
             
           
            }
                if (i == 100) {

                    obr.setVisible(false);
                    obr2.setVisible(true);

                }
            }
        } catch (Exception e) {

        }
        
    }
    
    
}
