

//this frame is used only for the design of the loading screen
package hardwareshop;

public class splashscreen extends javax.swing.JFrame {

    public splashscreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loadingpgbar = new javax.swing.JProgressBar();
        loadingtxt = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadingpgbar.setBackground(new java.awt.Color(255, 255, 255));
        loadingpgbar.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(loadingpgbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 800, -1));

        loadingtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(loadingtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 340, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/splash.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

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

   
    public static void main(String args[]) {
              
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splashscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JProgressBar loadingpgbar;
    public javax.swing.JLabel loadingtxt;
    // End of variables declaration//GEN-END:variables
}
