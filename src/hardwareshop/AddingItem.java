package hardwareshop;

import java.awt.HeadlessException;
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddingItem extends javax.swing.JFrame {

    //jframe objects classes
   public AdminLogin AdminLogin;
   public Reciepts Reciepts;
   public ItemList ItemList;
   public AddingItem AddingItem;
    
   //connection objects
   Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public AddingItem() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        itemlist = new javax.swing.JButton();
        reciepts = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        addingitems = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        itemname = new javax.swing.JTextField();
        itemtype = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        unitprice = new javax.swing.JTextField();
        dateentered = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        CLOSE = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        dragger = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 30));

        itemlist.setBackground(new java.awt.Color(153, 0, 51));
        itemlist.setForeground(new java.awt.Color(255, 255, 255));
        itemlist.setText("Item List");
        itemlist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        itemlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemlistActionPerformed(evt);
            }
        });
        jPanel1.add(itemlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 220, 50));

        reciepts.setBackground(new java.awt.Color(153, 0, 0));
        reciepts.setForeground(new java.awt.Color(255, 255, 255));
        reciepts.setText("Reciepts");
        reciepts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reciepts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recieptsActionPerformed(evt);
            }
        });
        jPanel1.add(reciepts, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 210, 50));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item Ordering System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 380, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 380, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 380, 0));

        addingitems.setBackground(new java.awt.Color(0, 153, 51));
        addingitems.setForeground(new java.awt.Color(255, 255, 255));
        addingitems.setText("Adding Items");
        addingitems.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addingitems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addingitemsActionPerformed(evt);
            }
        });
        jPanel1.add(addingitems, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 210, 50));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adding Items");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 30));

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/itemlistbackground2.jpg"))); // NOI18N
        jPanel1.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 580));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        jLabel3.setText("Adding Items");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 210, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Item Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 100, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Item Type:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 100, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Quantity:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 110, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Unit Price:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 100, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Date Entered:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 120, 40));

        itemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemnameActionPerformed(evt);
            }
        });
        jPanel1.add(itemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 310, 40));
        jPanel1.add(itemtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 310, 40));
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 310, 40));
        jPanel1.add(unitprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 310, 40));
        jPanel1.add(dateentered, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 310, 40));

        submit.setBackground(new java.awt.Color(204, 51, 0));
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit Data");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, 140, 50));

        reset.setBackground(new java.awt.Color(204, 51, 0));
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("New Record");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 110, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 192, 870, 10));

        CLOSE.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CLOSE.setText("X");
        CLOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLOSEMouseClicked(evt);
            }
        });
        jPanel1.add(CLOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 40, 40));

        minimize.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        minimize.setText(" -");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1234, 0, 40, 40));

        dragger.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                draggerMouseDragged(evt);
            }
        });
        jPanel1.add(dragger, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 40));
        jPanel1.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 900, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1321, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        AdminLogin= new AdminLogin();
        AdminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void itemlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemlistActionPerformed

        ItemList = new ItemList();
        ItemList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemlistActionPerformed

    private void recieptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recieptsActionPerformed
        Reciepts = new Reciepts();
        Reciepts.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_recieptsActionPerformed

    private void addingitemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addingitemsActionPerformed
        AddingItem = new AddingItem();
        AddingItem.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addingitemsActionPerformed
//misspressed
    private void itemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemnameActionPerformed
//inserting item data to the database 
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            String sql = "INSERT INTO items"
                    + "( itemname, itemtype, quantity, unitprice, dateentered)"
                    + "VALUES (?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardware_shop?zeroDateTimeBehavior=convertToNull", "root", "");
            pst = con.prepareStatement(sql);
            pst.setString(1, itemname.getText());
            pst.setString(2, itemtype.getText());
            pst.setString(3, quantity.getText());
            pst.setString(4, unitprice.getText());
            pst.setString(5, dateentered.getText());
            
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        
        }
    }//GEN-LAST:event_submitActionPerformed

    private void draggerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggerMouseDragged
        Point p = evt.getLocationOnScreen();
        this.setLocation(p);
    }//GEN-LAST:event_draggerMouseDragged

    private void CLOSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSEMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CLOSEMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
       this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       itemname.setText("");
       itemtype.setText("");
       quantity.setText("");
       unitprice.setText("");
       dateentered.setText("");
       
       
    }//GEN-LAST:event_resetActionPerformed

   
    public static void main(String args[]) {
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddingItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CLOSE;
    private javax.swing.JButton addingitems;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel background2;
    private javax.swing.JTextField dateentered;
    private javax.swing.JLabel dragger;
    private javax.swing.JButton itemlist;
    private javax.swing.JTextField itemname;
    private javax.swing.JTextField itemtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton logout;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton reciepts;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTextField unitprice;
    // End of variables declaration//GEN-END:variables
}
