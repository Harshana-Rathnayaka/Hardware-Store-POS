
package hardwareshop;

import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AdminLogin extends javax.swing.JFrame {

    
    public CashierLogin CashierLogin;
    public ItemList ItemList;
    
      //database connection establishing objects
    public Connection cn;
    public Statement st;
  
    public AdminLogin() {
         initComponents();
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        //establishing connection with database
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hardware_shop?zeroDateTimeBehavior=convertToNull","root","");
            st=cn.createStatement();
           
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Not Connected");
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signin = new javax.swing.JButton();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        dragger = new javax.swing.JLabel();
        cashierlogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 300, 40));

        password.setBorder(null);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 272, 300, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 160, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 90, -1));

        signin.setBackground(new java.awt.Color(228, 0, 6));
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setText("Sign In");
        signin.setBorder(null);
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        jPanel1.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 130, 40));

        minimize.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 0, 0));
        minimize.setText(" -");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 30, 30));

        close.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        close.setForeground(new java.awt.Color(255, 0, 0));
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
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 30, 30));

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
        jPanel1.add(dragger, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

        cashierlogin.setBackground(new java.awt.Color(0, 0, 204));
        cashierlogin.setForeground(new java.awt.Color(255, 255, 255));
        cashierlogin.setText("Cashier Login");
        cashierlogin.setBorder(null);
        cashierlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierloginActionPerformed(evt);
            }
        });
        jPanel1.add(cashierlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 190, 50));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin Login ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 200, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 570));

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

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
      
    }//GEN-LAST:event_usernameActionPerformed

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        try{
            String sql ="select *from adminlogin where username = '"+username.getText()+"'and password = '"+String.valueOf(password.getPassword())+"'";
            ResultSet rss =st.executeQuery(sql);
            if(rss.next()){
                ItemList = new ItemList();
                ItemList.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Login failed:check password or username");

            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Login failed:check password or username");
        }
    }//GEN-LAST:event_signinActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_closeKeyPressed

    }//GEN-LAST:event_closeKeyPressed

    private void draggerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggerMouseClicked
      ;
    }//GEN-LAST:event_draggerMouseClicked

    private void cashierloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierloginActionPerformed
        CashierLogin = new CashierLogin();
        CashierLogin.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_cashierloginActionPerformed

    private void draggerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggerMouseDragged
        Point p = evt.getLocationOnScreen();
       this.setLocation(p);
    }//GEN-LAST:event_draggerMouseDragged

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton cashierlogin;
    private javax.swing.JLabel close;
    private javax.swing.JLabel dragger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signin;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
