
package hardwareshop;

import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CashierLogin extends javax.swing.JFrame {

    //initializing objects of next jframes
    public AdminLogin AdminLogin;
//    public OrderItems OrderItems;
    
    
    //database connection establishing objects
    public Connection cn;
    public Statement st;
    
    public CashierLogin() {
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
        username2 = new javax.swing.JTextField();
        password2 = new javax.swing.JPasswordField();
        signin = new javax.swing.JButton();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        dragger = new javax.swing.JLabel();
        adminlogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username2ActionPerformed(evt);
            }
        });
        jPanel1.add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 330, 40));
        jPanel1.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 330, 40));

        signin.setBackground(new java.awt.Color(210, 17, 17));
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setText("Sign In");
        signin.setBorder(null);
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        jPanel1.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 150, 40));

        close.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        close.setForeground(new java.awt.Color(204, 0, 0));
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

        minimize.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 51, 0));
        minimize.setText(" -");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 30, 30));

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

        adminlogin.setBackground(new java.awt.Color(42, 116, 42));
        adminlogin.setForeground(new java.awt.Color(255, 255, 255));
        adminlogin.setText("Admin Login");
        adminlogin.setBorder(null);
        adminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminloginActionPerformed(evt);
            }
        });
        jPanel1.add(adminlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 190, 50));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 130, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 110, 20));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cashier Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 210, 50));

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

    //misspressed
    private void username2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username2ActionPerformed
//sign in button code
    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        try{
           String sql ="SELECT * FROM cashierlogin WHERE username = '"+username2.getText()+"' AND password = '"+String.valueOf(password2.getPassword())+"'";
           ResultSet rss =st.executeQuery(sql);
           if(rss.next()){
               OrderItems OrderItems = new OrderItems();
               OrderItems.setVisible(true);
               if (OrderItems.isVisible()) {
                   OrderItems.setVisible(false);
               } else {
                   OrderItems.setVisible(true);
               }
               this.dispose();
               
        String Username = username2.getText();
        new OrderItems(Username).setVisible(true);
           }else{
               JOptionPane.showMessageDialog(null,"Login failed:check password or username");
               
           }
       }catch(Exception e){
                   JOptionPane.showMessageDialog(null,"Login failed:check password or username");
                   }
        
    }//GEN-LAST:event_signinActionPerformed
//changing to admin login
    private void adminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminloginActionPerformed
        AdminLogin = new AdminLogin();
        AdminLogin.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_adminloginActionPerformed

//    private checkStatus()
//misspressed
    private void closeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_closeKeyPressed
     
    }//GEN-LAST:event_closeKeyPressed
//minimizing and exitting buttons
    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
         System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void draggerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggerMouseClicked
       
    }//GEN-LAST:event_draggerMouseClicked

    private void draggerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggerMouseDragged
         Point p = evt.getLocationOnScreen();
       this.setLocation(p);
    }//GEN-LAST:event_draggerMouseDragged

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
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminlogin;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel dragger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password2;
    private javax.swing.JButton signin;
    private javax.swing.JTextField username2;
    // End of variables declaration//GEN-END:variables
}
