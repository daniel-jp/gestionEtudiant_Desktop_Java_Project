
package connexion;


import admin.MenuProjet;
import static admin.MenuProjet.jButtonDpa;
import static admin.MenuProjet.jButtonEtud;
import static admin.MenuProjet.jButtonFil;
import static admin.MenuProjet.jButtonUtil;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;


import javax.swing.border.Border;

public class Login extends javax.swing.JFrame {

                Connection connexion =null;
                PreparedStatement pst = null;
                ResultSet reslt = null;
                String driver = "com.mysql.jdbc.Driver";
                String url ="jdbc:mysql://localhost:8889/G_Etudiant";
                String username="danny";
                String password="d012345";
                      
   
    public Login() {
        initComponents();
//                
//                connexion = ConnexionDatabase.connecteurt();
//        
//                System.out.println(connexion);

  this.setLocationRelativeTo(null);
        jLabelErr.setVisible(false);

    }
    
    
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButtonLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTexUsername1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelErr = new javax.swing.JLabel();

        jColorChooser1.setBackground(new java.awt.Color(102, 102, 102));
        jColorChooser1.setForeground(new java.awt.Color(102, 102, 102));
        jColorChooser1.setColor(new java.awt.Color(102, 102, 102));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(new java.awt.Color(0, 153, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(6, 30, 46));
        jPanel1.setForeground(javax.swing.UIManager.getDefaults().getColor("nb.startpage.tab.border1.color"));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8key_2.png"))); // NOI18N

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jPassword.setForeground(new java.awt.Color(153, 153, 153));
        jPassword.setText("pass");
        jPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFocusLost(evt);
            }
        });

        jCheckBox1.setForeground(java.awt.Color.white);
        jCheckBox1.setText("View pass");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButtonLogin.setBackground(new java.awt.Color(0, 153, 255));
        jButtonLogin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-login.png"))); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.setBorder(null);
        jButtonLogin.setContentAreaFilled(false);
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonLogin.setOpaque(true);
        jButtonLogin.setPreferredSize(new java.awt.Dimension(78, 48));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-businessman.png"))); // NOI18N
        jLabel4.setText("jLabel1");

        jTexUsername1.setBackground(new java.awt.Color(255, 255, 255));
        jTexUsername1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTexUsername1.setForeground(new java.awt.Color(153, 153, 153));
        jTexUsername1.setText("Username");
        jTexUsername1.setPreferredSize(new java.awt.Dimension(92, 20));
        jTexUsername1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTexUsername1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTexUsername1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPassword)
                            .addComponent(jTexUsername1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 124, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconslock.png"))); // NOI18N

        jLabelErr.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabelErr.setForeground(new java.awt.Color(255, 51, 51));
        jLabelErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8Error.png"))); // NOI18N
        jLabelErr.setText("Vouillez verifie l'utilisateur et mot pass");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
            .addComponent(jLabelErr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErr)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        
        // Operations operations = new Operations();
        
        try{
            
               Class.forName(driver);
            
               String query = "SELECT * FROM Utilisateur WHERE nom_Utilisateur = ?  AND motpass =? ";
               
               connexion = DriverManager.getConnection(url, username, password);
               
              pst= connexion.prepareStatement(query);
              
              pst.setString(1, jTexUsername1.getText() );
            //  pst.setString(2,String.valueOf( jComboType.getSelectedItem() ));
              pst.setString(2, jPassword.getText() );
              reslt=pst.executeQuery();
              
              if(reslt.next()){
                  
             
                 
                   String  type = reslt.getString(3);
            

                  
                 if(type.equals("Admin") ){
                 
                     MenuProjet adm= new MenuProjet();
                     
                     MenuProjet.JLabnomUt.setText(jTexUsername1.getText());
               
                     MenuProjet.nicknameLbl.setText(reslt.getString(3));
                     
                       jButtonEtud.setEnabled(true);
                       jButtonDpa.setEnabled(true);
                       jButtonFil.setEnabled(true);
                       jButtonUtil.setEnabled(true);
                       
                     adm.setVisible(true);
                     
                     this.dispose();
                   
                 }else {
                 
            
                  MenuProjet ult= new MenuProjet();
                     
                  MenuProjet.JLabnomUt.setText(jTexUsername1.getText());

                  MenuProjet.nicknameLbl.setText(reslt.getString(3));
                
                        
                     ult.setVisible(true);
                     
                      this.dispose();
                 
                 }
              
              
              
              }else{
              
                    jLabelErr.setVisible(true);
              
              
              }
              
        }catch (Exception exception){
            JOptionPane.showMessageDialog(this, exception.getMessage());
        
        }
        
    }//GEN-LAST:event_jButtonLoginActionPerformed
  
    private void jPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusGained
        // TODO add your handling code here:
        
          if( jPassword.getText().trim().toLowerCase().equals("pass")){
        
            jPassword.setText("");
            jPassword.setForeground(Color.black);
            
        }
           
           Border  jTextuser =  BorderFactory.createMatteBorder(1,1,1,1, Color.yellow);
                   
             jPassword.setBorder(jTextuser);
           
    }//GEN-LAST:event_jPasswordFocusGained

    private void jPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusLost
        // TODO add your handling code here:
        
        
               if( jPassword.getText().trim().equals("")
                  
                  ||  jPassword.getText().trim().toLowerCase().equals("pass")){
              
              
        
            jPassword.setText("pass");
            jPassword.setForeground(new Color(153, 153, 153));
            
        }
           
        
        jLabel3.setBorder(null);
        
    }//GEN-LAST:event_jPasswordFocusLost

    private void jTexUsername1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTexUsername1FocusGained
        // TODO add your handling code here:
        
           if( jTexUsername1.getText().trim().toLowerCase().equals("username")){
        
            jTexUsername1.setText("");
            jTexUsername1.setForeground(Color.black);
            
        }
           
           Border  jTextuser =  BorderFactory.createMatteBorder(1,1,1,1, Color.yellow);
                   
             jTexUsername1.setBorder(jTextuser);
           
        
        
        
    }//GEN-LAST:event_jTexUsername1FocusGained

    private void jTexUsername1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTexUsername1FocusLost
        // TODO add your handling code here:


 
          if( jTexUsername1.getText().trim().equals("")
                  
                  ||  jTexUsername1.getText().trim().toLowerCase().equals("username")){
              
              
        
            jTexUsername1.setText("username");
            jTexUsername1.setForeground(new Color(153, 153, 153));
            
        }
           
        
        jLabel4.setBorder(null);

    }//GEN-LAST:event_jTexUsername1FocusLost

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        
        if(jCheckBox1.isSelected()){
        
                    jPassword.setEchoChar((char)0 );
        
        }else {
                    jPassword.setEchoChar('*');
        
        }
        
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelErr;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTexUsername1;
    // End of variables declaration//GEN-END:variables
}
