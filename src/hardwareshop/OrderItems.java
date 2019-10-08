package hardwareshop;

import java.awt.HeadlessException;
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class OrderItems extends javax.swing.JFrame {


    //connection objects
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public OrderItems() {
        initComponents();
        showdate();
        showTableData();
    }
    
  
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        newbill = new javax.swing.JButton();
        Print_Reciept = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        item = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        totalamount = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        gettotal = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        paidamount = new javax.swing.JTextField();
        dragger = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        showdata = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        close.setText(" X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        close.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                closeKeyPressed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, 30));

        minimize.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        minimize.setText(" -");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Item Ordering & Reciept Issuer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 360, 50));

        jLabel2.setText("Cashier name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 90, 30));

        jLabel4.setText("Item Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 80, 30));

        jLabel5.setText("Quantity:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 110, 30));

        jLabel6.setText("Unit Price:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Total:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 60, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Paid Amount:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 110, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Balance:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 70, 40));

        newbill.setBackground(new java.awt.Color(0, 0, 153));
        newbill.setForeground(new java.awt.Color(255, 255, 255));
        newbill.setText("New");
        newbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbillActionPerformed(evt);
            }
        });
        jPanel1.add(newbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 120, 40));

        Print_Reciept.setBackground(new java.awt.Color(0, 0, 153));
        Print_Reciept.setForeground(new java.awt.Color(255, 255, 255));
        Print_Reciept.setText("Print Reciept");
        Print_Reciept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_RecieptActionPerformed(evt);
            }
        });
        jPanel1.add(Print_Reciept, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 180, 70));

        date.setText("date");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 120, 40));

        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });
        jPanel1.add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 270, 30));
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 120, 30));
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 120, 30));

        totalamount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalamount.setText("0.00 LKR");
        jPanel1.add(totalamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 210, 40));

        balance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balance.setText("0.00 LKR");
        jPanel1.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 190, 40));

        gettotal.setBackground(new java.awt.Color(0, 0, 153));
        gettotal.setForeground(new java.awt.Color(255, 255, 255));
        gettotal.setText("Get Total");
        gettotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gettotalActionPerformed(evt);
            }
        });
        jPanel1.add(gettotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Balance");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 110, 40));

        Back.setBackground(new java.awt.Color(0, 0, 153));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Change Login");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 120, 40));
        jPanel1.add(paidamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 160, 40));

        dragger.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                draggerMouseDragged(evt);
            }
        });
        dragger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                draggerMouseClicked(evt);
            }
        });
        jPanel1.add(dragger, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        jLabel3.setText("Date entered:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 90, 40));

        user.setText("Username");
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 180, 40));

        showdata.setText("Show data");
        showdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdataActionPerformed(evt);
            }
        });
        jPanel1.add(showdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 520, 230));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//misspressed
    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemActionPerformed
//storing reciept data in the database
    private void Print_RecieptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_RecieptActionPerformed
        try {
            String sql = "INSERT INTO reciepts"
                    + "(   casheirname, itemname, quantity, price, dateissued, total, balance)"
                    + "VALUES (?,?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardware_shop?zeroDateTimeBehavior=convertToNull", "root", "");
            pst = con.prepareStatement(sql);
           
            pst.setString(1, user.getText());
            pst.setString(2, item.getText());
            pst.setString(3, quantity.getText());
            pst.setString(4, price.getText());
            pst.setString(5, date.getText());
           
            pst.setString(6, totalamount.getText());
            pst.setString(7, balance.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
       
        String Username1 =user.getText();
        String Date =date.getText();
        String Itemname =item.getText();
        String Quantity =quantity.getText();
        String itemtotal =totalamount.getText();
         String totalamountfinal =totalamount.getText();
        String paidcash =paidamount.getText();
        String balancefinals =balance.getText();
        new billprints(Username1,Date,Itemname,Quantity,itemtotal,totalamountfinal,paidcash,balancefinals).setVisible(true);
        
    }//GEN-LAST:event_Print_RecieptActionPerformed
//getting the total when total button is pressed
    private void gettotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gettotalActionPerformed
        int total, qty, unitprice;
        qty = Integer.parseInt(quantity.getText());
        unitprice = Integer.parseInt(price.getText());
        total = qty * unitprice;

        totalamount.setText(total + ".00 LKR");
    }//GEN-LAST:event_gettotalActionPerformed
//getting the balance when the balance button is pressed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int total, qty, unitprice, bal, paidamountfinal;
        qty = Integer.parseInt(quantity.getText());
        unitprice = Integer.parseInt(price.getText());
        total = qty * unitprice;
        paidamountfinal = Integer.parseInt(paidamount.getText());
        bal = paidamountfinal - total;
        balance.setText(bal + ".00 LKR");

    }//GEN-LAST:event_jButton2ActionPerformed
//resetting data on text feilds
    private void newbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbillActionPerformed
        
        
        item.setText("");
        quantity.setText("");
        price.setText("");
        
      
        totalamount.setText("");
        balance.setText("");
        paidamount.setText("");

    }//GEN-LAST:event_newbillActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_closeKeyPressed

    }//GEN-LAST:event_closeKeyPressed

    private void draggerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggerMouseClicked
      
    }//GEN-LAST:event_draggerMouseClicked

    private void draggerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggerMouseDragged
         Point p = evt.getLocationOnScreen();
       this.setLocation(p);
    }//GEN-LAST:event_draggerMouseDragged

    private void showdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdataActionPerformed
     showTableData();
     showdate();
    }//GEN-LAST:event_showdataActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed

        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed
    
    public void showTableData() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardware_shop?zeroDateTimeBehavior=convertToNull", "root", "");
            String sql = "SELECT * FROM items";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }
    
      public OrderItems(String Username){
        initComponents();
        user.setText(Username);
    }
    
    void showdate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy:MM:dd");
        date.setText(s.format(d));
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Print_Reciept;
    private javax.swing.JLabel background;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel close;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dragger;
    private javax.swing.JButton gettotal;
    private javax.swing.JTextField item;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton newbill;
    private javax.swing.JTextField paidamount;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton showdata;
    private javax.swing.JLabel totalamount;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
