
package hardwareshop;

import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class ItemList extends javax.swing.JFrame {

    //jframe objects initialization
    public AdminLogin AdminLogin;
    public AddingItem AddingItem;
    public Reciepts Reciepts;
    //connection objects 
     Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
  
    public ItemList() {
        initComponents();
        findUsers();
    }
    //connection establishing to the database
     public Connection getConnection()
    {
        Connection con = null;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardware_shop?zeroDateTimeBehavior=convertToNull", "root", "");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
     
     
     //same as recipts class.check recipt class for details
         public ArrayList<User> ListUsers(String ValToSearch)
    {
        ArrayList<User> usersList = new ArrayList<User>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Connection con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `items` WHERE CONCAT (`Iid`, `itemname`, `itemtype`, `quantity`, `unitprice`, `dateentered`)LIKE '%"+ValToSearch+"%'";
            rs = st.executeQuery(searchQuery);
            
            User user;
            
            while(rs.next())
            {
                user = new User(
                                 rs.getInt("Iid"),
                                 rs.getString("itemname"),
                                 rs.getString("itemtype"),
                                 rs.getInt("quantity"),
                                 rs.getString("unitprice"),
                                 rs.getString("dateentered")
                                );
                usersList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return usersList;
    }
         
          public void findUsers()
    {
        ArrayList<User> users = ListUsers(searchbox.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"iid","Itemname","Itemtype","Quantity","Unitprice","Dateentered"});
        Object[] row = new Object[6];
        
        for(int i = 0; i < users.size(); i++)
        {
            row[0] = users.get(i).getiid();
            row[1] = users.get(i).getItemname();
            row[2] = users.get(i).getItemtype();
            row[3] = users.get(i).getQuantity();
            row[4] = users.get(i).getUnitprice();
            row[5] = users.get(i).getDateentered();
            
            model.addRow(row);
        }
       jTable1.setModel(model);
       
    }    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        itemlist = new javax.swing.JButton();
        reciepts = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        addingitems = new javax.swing.JButton();
        background1 = new javax.swing.JLabel();
        searchbox = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        dragger = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item List");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 30));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 30));

        itemlist.setBackground(new java.awt.Color(51, 153, 0));
        itemlist.setForeground(new java.awt.Color(255, 255, 255));
        itemlist.setText("Item List");
        itemlist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        itemlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemlistActionPerformed(evt);
            }
        });
        jPanel1.add(itemlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 50));

        reciepts.setBackground(new java.awt.Color(204, 51, 0));
        reciepts.setForeground(new java.awt.Color(255, 255, 255));
        reciepts.setText("Reciepts");
        reciepts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reciepts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recieptsActionPerformed(evt);
            }
        });
        jPanel1.add(reciepts, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 190, 50));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item Ordering System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 192, 300, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 522, 380, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 712, 380, 10));

        addingitems.setBackground(new java.awt.Color(204, 51, 0));
        addingitems.setForeground(new java.awt.Color(255, 255, 255));
        addingitems.setText("Adding Items");
        addingitems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addingitemsActionPerformed(evt);
            }
        });
        jPanel1.add(addingitems, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 50));

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/itemlistbackground2.jpg"))); // NOI18N
        jPanel1.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 520));
        jPanel1.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 380, 40));

        Search.setBackground(new java.awt.Color(204, 51, 0));
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search item");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 170, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 700, 320));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Item List");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 170, 50));

        minimize.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        minimize.setText(" -");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 0, 30, 40));

        close.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        close.setText(" X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 0, 30, 40));

        dragger.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                draggerMouseDragged(evt);
            }
        });
        jPanel1.add(dragger, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 30));
        jPanel1.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 760, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addingitemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addingitemsActionPerformed
        AddingItem = new AddingItem();
        AddingItem.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addingitemsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        AdminLogin= new AdminLogin();
        AdminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    //misclicked
    private void itemlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemlistActionPerformed
       
    }//GEN-LAST:event_itemlistActionPerformed

    private void recieptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recieptsActionPerformed
        Reciepts = new Reciepts();
        Reciepts.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_recieptsActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
       findUsers();
    }//GEN-LAST:event_SearchActionPerformed

    private void draggerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggerMouseDragged
        Point p = evt.getLocationOnScreen();
        this.setLocation(p);
    }//GEN-LAST:event_draggerMouseDragged

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JButton addingitems;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel close;
    private javax.swing.JLabel dragger;
    private javax.swing.JButton itemlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton reciepts;
    private javax.swing.JTextField searchbox;
    // End of variables declaration//GEN-END:variables
}
