
package admin;

import connexion.MySQLConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Utilisateur extends javax.swing.JFrame {

    
                Connection connexion =null;
                PreparedStatement pst = null;
                ResultSet reslt = null;
                
 

    public Utilisateur() {
        initComponents();
        
         this.setLocationRelativeTo(null);
         
         
            connexion = MySQLConnection.connecteur();
                
                 jLabelER_Text.setVisible(false);
                 jBtn_Ajouter.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextCod_UT = new javax.swing.JTextField();
        jTextNom_UT = new javax.swing.JTextField();
        jTextMotP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabelER_Text = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBtn_Ajouter = new javax.swing.JButton();
        jBn_Supp = new javax.swing.JButton();
        jBnModif = new javax.swing.JButton();
        jButtonValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("CODE");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("NOM ");

        jTextCod_UT.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jTextCod_UT.setForeground(new java.awt.Color(0, 0, 0));
        jTextCod_UT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCod_UTActionPerformed(evt);
            }
        });

        jTextNom_UT.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jTextMotP.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("TYPE");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("MOT PASS");

        jComboBoxType.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Utilisateur" }));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-search.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelER_Text.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabelER_Text.setForeground(new java.awt.Color(255, 51, 51));
        jLabelER_Text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-high_priority.png"))); // NOI18N
        jLabelER_Text.setText("Le champs sont obligatoire *");

        jButton2.setBackground(new java.awt.Color(0, 102, 153));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-todo_list.png"))); // NOI18N
        jButton2.setText("Afficher liste");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(63, 63, 63)
                        .addComponent(jLabelER_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextCod_UT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextNom_UT)
                            .addComponent(jComboBoxType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextMotP))
                        .addGap(79, 79, 79))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextCod_UT, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNom_UT, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextMotP))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabelER_Text))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATION D'UTILISATEUR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jBtn_Ajouter.setBackground(new java.awt.Color(0, 102, 153));
        jBtn_Ajouter.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jBtn_Ajouter.setForeground(java.awt.Color.white);
        jBtn_Ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add_user_group_man_man.png"))); // NOI18N
        jBtn_Ajouter.setText("Ajouter");
        jBtn_Ajouter.setBorder(null);
        jBtn_Ajouter.setContentAreaFilled(false);
        jBtn_Ajouter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtn_Ajouter.setOpaque(true);
        jBtn_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_AjouterActionPerformed(evt);
            }
        });

        jBn_Supp.setBackground(new java.awt.Color(0, 102, 153));
        jBn_Supp.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jBn_Supp.setForeground(java.awt.Color.white);
        jBn_Supp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-denied.png"))); // NOI18N
        jBn_Supp.setText("Supprimer");
        jBn_Supp.setBorder(null);
        jBn_Supp.setContentAreaFilled(false);
        jBn_Supp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBn_Supp.setOpaque(true);
        jBn_Supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBn_SuppActionPerformed(evt);
            }
        });

        jBnModif.setBackground(new java.awt.Color(0, 102, 153));
        jBnModif.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jBnModif.setForeground(java.awt.Color.white);
        jBnModif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-change_user.png"))); // NOI18N
        jBnModif.setText("Modifier");
        jBnModif.setBorder(null);
        jBnModif.setContentAreaFilled(false);
        jBnModif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBnModif.setOpaque(true);
        jBnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnModifActionPerformed(evt);
            }
        });

        jButtonValider.setBackground(new java.awt.Color(0, 102, 153));
        jButtonValider.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButtonValider.setForeground(java.awt.Color.white);
        jButtonValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-ok.png"))); // NOI18N
        jButtonValider.setText("Valider");
        jButtonValider.setBorder(null);
        jButtonValider.setContentAreaFilled(false);
        jButtonValider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonValider.setOpaque(true);
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jBtn_Ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jButtonValider, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jBnModif, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(jBn_Supp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jBn_Supp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtn_Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_AjouterActionPerformed
      
                      jTextCod_UT.setText(null);
                      jTextNom_UT.setText(null);
                      jComboBoxType.setSelectedItem(null);
                      jTextMotP.setText(null);
                                                                   
                      jTextCod_UT.setEnabled(false);
                      
                      jButtonValider.setEnabled(true);
                      jBtn_Ajouter.setEnabled(false);
    }//GEN-LAST:event_jBtn_AjouterActionPerformed

    private void jBn_SuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBn_SuppActionPerformed
        // TODO add your handling code here:
 int confirmation   
            = JOptionPane.showConfirmDialog(null, "Voulez-vous  supprimer ce utilisateur ?","Atantion",JOptionPane.YES_NO_OPTION);

              if (confirmation==JOptionPane.YES_OPTION){
    
                    String sql ="DELETE  FROM Utilisateur WHERE id='"+jTextCod_UT.getText()+"' ";
                    
                    try{
                    
                     pst = connexion.prepareStatement(sql);
                         
            
                         int delete = pst.executeUpdate();
                         
                         if ( delete > 0){
                         
                         JOptionPane.showMessageDialog(null, "Etudiant bien supprimé ");
                         
                       jButtonValider.setEnabled(false);
                       jBtn_Ajouter.setEnabled(true);
                        
                      jTextCod_UT.setText(null);
                      jTextNom_UT.setText(null);
                      jComboBoxType.setSelectedItem(null);
                      jTextMotP.setText(null);

                      
                         }
                    
                    
                    }catch(Exception ex){
                    
                        JOptionPane.showMessageDialog(null, ex);
 
                    }

    }
   
    }//GEN-LAST:event_jBn_SuppActionPerformed

    private void jBnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnModifActionPerformed
        // TODO add your handling code here:

        String sql = "update  Utilisateur  set nom_Utilisateur  = '"+ jTextNom_UT.getText()+"', type_utilisateur ='"
                
                +jComboBoxType.getSelectedItem().toString()+"',  motpass ='"+jTextMotP.getText() 
                +"'  where id = '"+ jTextCod_UT.getText()+"'";
        
                  try{ 
                      
                      
                      pst = connexion.prepareStatement(sql);

//                       pst.setString(1, jTextCod_UT.getText());
//                      pst.setString(2, jTextNom_UT .getText());
//                      pst.setString(3, jComboBoxType.getSelectedItem().toString());
//                      pst.setString(4, jTextMotP .getText());
//                  
                      
                       if( jTextCod_UT.getText().isEmpty() ||   jTextNom_UT.getText().isEmpty()
                               ||   jTextMotP.getText().isEmpty()){

                        jLabelER_Text.setVisible(true);

                      }

                      else{

                      int modif=pst.executeUpdate();

                      if( modif > 0 ){

                         JOptionPane.showMessageDialog(null, "Le filiere a été ajouté avec succès ");

//                        jTextCod_UT.setText(null);
//                        jTextNom_UT.setText(null);
//                         jComboBoxType.setSelectedItem(null);
//                        jTextMotP.setText(null);

                        jButtonValider.setEnabled(false);
                         jBtn_Ajouter.setEnabled(true);
                         
                        jLabelER_Text.setVisible(false);
                      } 
                       
                   }
                  } catch(Exception e){
                  JOptionPane.showMessageDialog(null,e);
                  }

    }//GEN-LAST:event_jBnModifActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String sql = "SELECT * FROM Utilisateur WHERE id=? ";

        try{

            pst = connexion.prepareStatement(sql);

            pst.setString(1, jTextCod_UT.getText());

            reslt=pst.executeQuery();

            if(reslt.next()){

                jTextNom_UT.setText(reslt.getString(2));
                jComboBoxType.setSelectedItem(reslt.getString(3));
                jTextMotP.setText(reslt.getString(4));
            
                
                jButtonValider.setEnabled(false);
                jBtn_Ajouter.setEnabled(true);

            }   else{

                JOptionPane.showMessageDialog(null, "Ce utilisateur n'a pas rensistre  ! ");

             
                jLabelER_Text.setVisible(false);

            }

        }  catch(Exception exep){

            JOptionPane.showMessageDialog(null,exep);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextCod_UTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCod_UTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCod_UTActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        // TODO add your handling code here:
        
         try{

                    String sql= "INSERT INTO Utilisateur (  nom_Utilisateur ,type_utilisateur, motpass  ) VALUES( ?,?,?)";
                 

                      pst = connexion.prepareStatement(sql);

                     // pst.setString(1, jTextCod_UT.getText());
                      pst.setString(1, jTextNom_UT.getText());
                      pst.setString(2, jComboBoxType.getSelectedItem().toString());
                      pst.setString(3, jTextMotP.getText());
                      
                      if( jTextNom_UT.getText().isEmpty()||   jTextMotP.getText().isEmpty()){

                        jLabelER_Text.setVisible(true);

                    
                      }
                      else{
              
                            
                       int ajout=   pst.executeUpdate();
                       
                        if(ajout >0){

                         JOptionPane.showMessageDialog(null, "L'utlisateur a été ajouté avec succès ");

                      jTextCod_UT.setText(null);
                      jTextNom_UT.setText(null);
                      jComboBoxType.setSelectedItem(null);
                      jTextMotP.setText(null);
                      
                      jLabelER_Text.setVisible(false);
                      
                     jTextCod_UT.setEnabled(true);

                        
                         jBtn_Ajouter.setEnabled(true);
                         jButtonValider.setEnabled(false);

                      } 
                  }
                    }catch(Exception e){


                        JOptionPane.showMessageDialog(this,"Le  CNE (' "+ jTextCod_UT.getText()+" ') existe deja!!");
                    }
        
        
 
        
        
        
        
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        ListeUtilisateurs ls = new ListeUtilisateurs();
        
        ls.setVisible(true);
        ls.pack();
        
        ls.setLocationRelativeTo(null);
        ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnModif;
    private javax.swing.JButton jBn_Supp;
    private javax.swing.JButton jBtn_Ajouter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelER_Text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextCod_UT;
    private javax.swing.JTextField jTextMotP;
    private javax.swing.JTextField jTextNom_UT;
    // End of variables declaration//GEN-END:variables
}
