
package admin;

import connexion.MySQLConnection;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilisateur.ListeDepartements;
import static utilisateur.ListeDepartements.jTableAfficheEt;
import utilisateur.ListeFilières;

public class Filiere extends javax.swing.JFrame {

                 Connection connexion =null;
                PreparedStatement pst = null;
                ResultSet reslt = null;
                
         ListeFilières ls = new ListeFilières();
 
    public Filiere() {
        initComponents();
        
        
           connexion = MySQLConnection.connecteur();
        

          jBnAjouF.setEnabled(false);
          
         this.setLocationRelativeTo(null);
           jLabelER_Text.setVisible(false);
           
           
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextCod_Fil = new javax.swing.JTextField();
        jTextNom_Fil = new javax.swing.JTextField();
        jLabelER_Text = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBnAjouF = new javax.swing.JButton();
        jBnSup = new javax.swing.JButton();
        jBnMod_F = new javax.swing.JButton();
        jButtonValider = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(java.awt.Color.white);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("CODE");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("NOM FILIERE");

        jTextCod_Fil.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jTextNom_Fil.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabelER_Text.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelER_Text.setForeground(new java.awt.Color(255, 51, 51));
        jLabelER_Text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-high_priority.png"))); // NOI18N
        jLabelER_Text.setText("Le champs sont obligatoire *");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelER_Text)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextCod_Fil, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextNom_Fil)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2)
                    .addComponent(jTextCod_Fil)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextNom_Fil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelER_Text)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jBnAjouF.setBackground(new java.awt.Color(0, 153, 204));
        jBnAjouF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBnAjouF.setForeground(java.awt.Color.white);
        jBnAjouF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add_list_1.png"))); // NOI18N
        jBnAjouF.setText("Ajouter");
        jBnAjouF.setBorder(null);
        jBnAjouF.setContentAreaFilled(false);
        jBnAjouF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBnAjouF.setOpaque(true);
        jBnAjouF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnAjouFActionPerformed(evt);
            }
        });

        jBnSup.setBackground(new java.awt.Color(0, 153, 204));
        jBnSup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBnSup.setForeground(java.awt.Color.white);
        jBnSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete_file.png"))); // NOI18N
        jBnSup.setText("Supprimer");
        jBnSup.setBorder(null);
        jBnSup.setContentAreaFilled(false);
        jBnSup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBnSup.setOpaque(true);
        jBnSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnSupActionPerformed(evt);
            }
        });

        jBnMod_F.setBackground(new java.awt.Color(0, 153, 204));
        jBnMod_F.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBnMod_F.setForeground(java.awt.Color.white);
        jBnMod_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-synchronize.png"))); // NOI18N
        jBnMod_F.setText("Modifier");
        jBnMod_F.setBorder(null);
        jBnMod_F.setContentAreaFilled(false);
        jBnMod_F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBnMod_F.setOpaque(true);
        jBnMod_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnMod_FActionPerformed(evt);
            }
        });

        jButtonValider.setBackground(new java.awt.Color(0, 153, 204));
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jBnAjouF)
                .addGap(61, 61, 61)
                .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jBnMod_F)
                .addGap(47, 47, 47)
                .addComponent(jBnSup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnAjouF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBnMod_F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBnSup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATION DE FILIERE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addGap(156, 156, 156))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void jBnAjouFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnAjouFActionPerformed
        // TODO add your handling code here:
        
      
                     
                      jTextNom_Fil.setText(null);
                      
                      jLabelER_Text.setVisible(false);

                       jButtonValider.setEnabled(true);
                      jBnAjouF.setEnabled(false);
        
       
        
    }//GEN-LAST:event_jBnAjouFActionPerformed

    private void jBnMod_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnMod_FActionPerformed

       
        
        
           String sql  = "update  Filiere  set code_filiere = '"+ jTextCod_Fil.getText()+"', nom_filiere = '"+jTextNom_Fil.getText()+"'  where  code_filiere = '"+jTextCod_Fil.getText()+"' ";
        
                  try{ 
                      
                      
                      pst = connexion.prepareStatement(sql);

                    //    pst.setString(1, jTextCod_Fil.getText());
                    //   pst.setString(2, jTextNom_Fil .getText());

                       if( jTextCod_Fil.getText().isEmpty() ||   jTextNom_Fil.getText().isEmpty()){

                        jLabelER_Text.setVisible(true);

                      }

                      else{

                      int modif=pst.executeUpdate();

                      if(modif > 0){

                         JOptionPane.showMessageDialog(null, "Le filiere a été modifie avec succès ");

//                      jTextCod_Fil.setText(null);
//                      jTextNom_Fil.setText(null);
//                      
                       jButtonValider.setEnabled(true);
                      jBnAjouF.setEnabled(false);
                      
                      
                     jLabelER_Text.setVisible(false);
                      } 
                       
                   }
                  } catch(Exception ex){
                      
                    JOptionPane.showMessageDialog(null,ex);
                      
                      
                  }
                     
    }//GEN-LAST:event_jBnMod_FActionPerformed

    private void jBnSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnSupActionPerformed
        // TODO add your handling code here:
        
        
          int confirmation   
            = JOptionPane.showConfirmDialog(null, "Voulez-vous  supprimer cette filiere ?","Atantion",JOptionPane.YES_NO_OPTION);

              if (confirmation==JOptionPane.YES_OPTION){
    
                    String sql ="DELETE  FROM Filiere WHERE code_filiere=? ";
                    
                    try{
                    
                         pst = connexion.prepareStatement(sql);
                         
                         pst.setString(1,jTextCod_Fil.getText());
                         
                         int delete = pst.executeUpdate();
                         
                         if (delete>0){
                         
                         JOptionPane.showMessageDialog(null, "Etudiant bien supprimé ");
                         
                        jTextCod_Fil.setText(null);
                        jTextNom_Fil.setText(null);
                        
                       jButtonValider.setEnabled(false);
                       jBnAjouF.setEnabled(true);
                       

                         }
                    
                    
                    }catch(Exception ex){
                    
                        JOptionPane.showMessageDialog(null, ex);
 
                    }

    }

    }//GEN-LAST:event_jBnSupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
              String sql = "SELECT * FROM Filiere WHERE code_filiere=? ";
             
             try{
                    
                    pst = connexion.prepareStatement(sql);
                    
                    pst.setString(1, jTextCod_Fil.getText());
                    
                    reslt=pst.executeQuery();
                    
                    if(reslt.next()){
                    
                   jTextNom_Fil.setText(reslt.getString(2));
                   
                    jButtonValider.setEnabled(false);
                   jBnAjouF.setEnabled(true);
                
            
                    }   else{

                    
                         JOptionPane.showMessageDialog(null, "Cet filire ne pas rensistre ! ");

//                      jTextCod_Fil.setText(null);
//                      jTextNom_Fil.setText(null);

                         jLabelER_Text.setVisible(false);
                         
                     jButtonValider.setEnabled(true);
                      
                    }
             
             }  catch(Exception exep){
                 
                  JOptionPane.showMessageDialog(null,exep);
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        // TODO add your handling code here:

        try{

            String sql= "INSERT INTO Filiere (  code_filiere ,nom_filiere ) VALUES( ?,?)";

            pst = connexion.prepareStatement(sql);

             pst.setString(1, jTextCod_Fil.getText());
             pst.setString(2, jTextNom_Fil.getText());
           

            if( jTextCod_Fil.getText().isEmpty() ||   jTextNom_Fil.getText().isEmpty()){

                jLabelER_Text.setVisible(true);
                
            
            }
         else{
                
                 int ajout=   pst.executeUpdate();

                if(ajout >0){

                    JOptionPane.showMessageDialog(null, "L'filiere a été ajouté avec succès ");

                   
                     jTextCod_Fil.setText(null);
                     jTextNom_Fil.setText(null);
          
                     jLabelER_Text.setVisible(false);
                     jBnAjouF.setEnabled(true);
                     jButtonValider.setEnabled(false);
                
                     jTableAfficheEt.setModel(new DefaultTableModel(null, new Object[]{"CODE FILIERE","NOM FILIERE"}));
                    
                     ls.fillEtudiantTable(ListeDepartements.jTableAfficheEt,"");            
             
            }
          }
        }catch(Exception e){

                       JOptionPane.showMessageDialog(null,"Le  CNE (' "+ jTextCod_Fil.getText()+" ') existe deja!!");

        }

    }//GEN-LAST:event_jButtonValiderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filiere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnAjouF;
    private javax.swing.JButton jBnMod_F;
    private javax.swing.JButton jBnSup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelER_Text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextCod_Fil;
    private javax.swing.JTextField jTextNom_Fil;
    // End of variables declaration//GEN-END:variables
}
