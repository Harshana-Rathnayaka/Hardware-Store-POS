package hardwareshop;
//libraries
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Reciepts extends javax.swing.JFrame {
// objects of the changed classes when button is pressed
    public AdminLogin AdminLogin;
    public ItemList ItemList;
    public AddingItem AddingItem;
  //connection objects initializiation  
      Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //method initialization
    public Reciepts() {
        initComponents();
        findUsers();
    }
    //connection to the database
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
     //storing search results in the array and get support of the java class users2
          public ArrayList<Users2> ListUsers(String ValToSearch)
    {
        ArrayList<Users2> usersList = new ArrayList<Users2>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Connection con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `reciepts` WHERE CONCAT (`Rid`, `casheirname`, `itemname`, `quantity`, `price`, `dateissued`, `total`, `balance`)LIKE '%"+ValToSearch+"%'";
            rs = st.executeQuery(searchQuery);
            
            Users2 user;
            
            while(rs.next())
            {
                user = new Users2(
                                 rs.getInt("Rid"),
                                 rs.getString("casheirname"), 
                                 rs.getString("itemname"),
                                 rs.getInt("quantity"),
                                 rs.getString("price"),
                                 rs.getString("dateissued"), 
                                 rs.getString("total"),
                                 rs.getString("balance")
                                );
                usersList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return usersList;
    }
          
          //search results are filterd from this method
                public void findUsers()
    {
        ArrayList<Users2> users = ListUsers(searchbox.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"RID","Cashiername","Itemname","Quantity","Price","Dateissued","Total","Balance"});
        Object[] row = new Object[8];
        
        for(int i = 0; i < users.size(); i++)
        {
            row[0] = users.get(i).getrid(); 
            row[1] = users.get(i).getCasheirname(); 
            row[2] = users.get(i).getItemname();
            row[3] = users.get(i).getQuantity();
            row[4] = users.get(i).getPrice();
            row[5] = users.get(i).getDateissued();
            row[6] = users.get(i).getTotal();
            row[7] = users.get(i).getBalance();
            
            model.addRow(row);
        }
       jTable1.setModel(model);
       
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        dragger = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        itemlist = new javax.swing.JButton();
        reciepts = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addingitems = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();
        searchbox = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 30, 30));

        minimize.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        minimize.setText(" -");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 30, 30));

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
        jPanel2.add(dragger, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 30));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, 30));

        itemlist.setBackground(new java.awt.Color(204, 51, 0));
        itemlist.setForeground(new java.awt.Color(255, 255, 255));
        itemlist.setText("Item List");
        itemlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemlistActionPerformed(evt);
            }
        });
        jPanel2.add(itemlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 140, 50));

        reciepts.setBackground(new java.awt.Color(51, 153, 0));
        reciepts.setForeground(new java.awt.Color(255, 255, 255));
        reciepts.setText("Reciepts");
        reciepts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recieptsActionPerformed(evt);
            }
        });
        jPanel2.add(reciepts, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 140, 50));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item Ordering System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 330, 70));

        addingitems.setBackground(new java.awt.Color(204, 51, 0));
        addingitems.setForeground(new java.awt.Color(255, 255, 255));
        addingitems.setText("Adding Items");
        addingitems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addingitemsActionPerformed(evt);
            }
        });
        jPanel2.add(addingitems, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, 50));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reciepts");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 30));

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/itemlistbackground2.jpg"))); // NOI18N
        jPanel2.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 510));
        jPanel2.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 440, 40));

        search.setBackground(new java.awt.Color(204, 51, 0));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search Reciept");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 130, 40));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 630, 300));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Reciepts");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 170, 70));
        jPanel2.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1120, 750));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
       
    }//GEN-LAST:event_recieptsActionPerformed

    private void addingitemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addingitemsActionPerformed
        AddingItem = new AddingItem();
        AddingItem.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addingitemsActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        findUsers();
    }//GEN-LAST:event_searchActionPerformed

    private void draggerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggerMouseClicked
       
    }//GEN-LAST:event_draggerMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_closeKeyPressed

    }//GEN-LAST:event_closeKeyPressed

    private void draggerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggerMouseDragged
        Point p = evt.getLocationOnScreen();
       this.setLocation(p);
    }//GEN-LAST:event_draggerMouseDragged

    
    public static void main(String args[]) {
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reciepts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton reciepts;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchbox;
    // End of variables declaration//GEN-END:variables
}
