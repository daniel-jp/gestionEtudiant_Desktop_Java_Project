
package admin;

import connexion.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilisateur.ListeDepartements;
import static utilisateur.ListeDepartements.jTableAfficheEt;


public class Departement extends javax.swing.JFrame {

    
                Connection connexion =null;
                PreparedStatement pst = null;
                ResultSet reslt = null;
                
                ListeDepartements dp = new ListeDepartements();
 
    public Departement() {
        
        initComponents();
         
         this.setLocationRelativeTo(null);
           connexion = MySQLConnection.connecteur();
           
           
              jBnAjouF5.setEnabled(false);
              jLabelER_Text.setVisible(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFCOD_DEP = new javax.swing.JTextField();
        jTextNom_DEP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelER_Text = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jBnAjouF5 = new javax.swing.JButton();
        jBnSup5 = new javax.swing.JButton();
        jBnMod_F5 = new javax.swing.JButton();
        jButtonValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("CODE");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("NOM DEP");

        jTextFCOD_DEP.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTextFCOD_DEP.setMaximumSize(new java.awt.Dimension(32, 32));
        jTextFCOD_DEP.setPreferredSize(new java.awt.Dimension(32, 30));

        jTextNom_DEP.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTextNom_DEP.setPreferredSize(new java.awt.Dimension(32, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-search.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.setPreferredSize(new java.awt.Dimension(32, 34));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelER_Text.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelER_Text.setForeground(new java.awt.Color(255, 51, 51));
        jLabelER_Text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-high_priority.png"))); // NOI18N
        jLabelER_Text.setText("Le champs sont obligatoire *");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFCOD_DEP, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextNom_DEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabelER_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFCOD_DEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextNom_DEP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabelER_Text)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("CREATION DE DEPARTEMENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 153, 204));

        jBnAjouF5.setBackground(new java.awt.Color(0, 153, 204));
        jBnAjouF5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBnAjouF5.setForeground(java.awt.Color.white);
        jBnAjouF5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add_list_1.png"))); // NOI18N
        jBnAjouF5.setText("Ajouter");
        jBnAjouF5.setBorder(null);
        jBnAjouF5.setContentAreaFilled(false);
        jBnAjouF5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBnAjouF5.setOpaque(true);
        jBnAjouF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnAjouF5ActionPerformed(evt);
            }
        });

        jBnSup5.setBackground(new java.awt.Color(0, 153, 204));
        jBnSup5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBnSup5.setForeground(java.awt.Color.white);
        jBnSup5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete_file.png"))); // NOI18N
        jBnSup5.setText("Supprimer");
        jBnSup5.setBorder(null);
        jBnSup5.setContentAreaFilled(false);
        jBnSup5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBnSup5.setOpaque(true);
        jBnSup5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnSup5ActionPerformed(evt);
            }
        });

        jBnMod_F5.setBackground(new java.awt.Color(0, 153, 204));
        jBnMod_F5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBnMod_F5.setForeground(java.awt.Color.white);
        jBnMod_F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-synchronize.png"))); // NOI18N
        jBnMod_F5.setText("Modifier");
        jBnMod_F5.setBorder(null);
        jBnMod_F5.setContentAreaFilled(false);
        jBnMod_F5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBnMod_F5.setOpaque(true);
        jBnMod_F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnMod_F5ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jBnAjouF5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jBnMod_F5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jBnSup5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnMod_F5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBnAjouF5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBnSup5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnAjouF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnAjouF5ActionPerformed
        // TODO add your handling code here:

                     jTextFCOD_DEP.setText(null);
                     jTextNom_DEP.setText(null);
                     
                     jButtonValider.setEnabled(true);
                     jBnAjouF5.setEnabled(false);
    }//GEN-LAST:event_jBnAjouF5ActionPerformed

    private void jBnSup5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnSup5ActionPerformed
        // TODO add your handling code here:

        int confirmation
        = JOptionPane.showConfirmDialog(null, "Voulez-vous  supprimer cette filiere ?","Atantion",JOptionPane.YES_NO_OPTION);

        if (confirmation==JOptionPane.YES_OPTION){

            String sql ="DELETE  FROM Departement WHERE code=? ";

            try{

                pst = connexion.prepareStatement(sql);

                pst.setString(1,jTextFCOD_DEP.getText());

                int delete = pst.executeUpdate();

                if (delete>0){

                    JOptionPane.showMessageDialog(null, "Etudiant bien supprimé ");

//                    jTextFCOD_DEP.setText(null);
//                    jTextNom_DEP.setText(null);
//                   
                    jButtonValider.setEnabled(false);
                     jButtonValider.setEnabled(true);

                }

            }catch(Exception ex){

                JOptionPane.showMessageDialog(null, ex);

            }

        }
    }//GEN-LAST:event_jBnSup5ActionPerformed

    private void jBnMod_F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnMod_F5ActionPerformed
        // TODO add your handling code here:

        String sql = "UPDATE  Departement  SET nom_depart ='"+ jTextNom_DEP .getText()+"'  WHERE code ='"+ jTextFCOD_DEP.getText()+"' ";

        try{

            pst = connexion.prepareStatement(sql);


            if( jTextFCOD_DEP.getText().isEmpty() ||  jTextNom_DEP.getText().isEmpty()){

                jLabelER_Text.setVisible(true);

            }

            
            else{

                int modif=   pst.executeUpdate();

                if(modif >0){

                    JOptionPane.showMessageDialog(null, "Le departement a été modifie  ");

                    jTextFCOD_DEP.setText(null);
                    jTextNom_DEP.setText(null);
                    
                     jButtonValider.setEnabled(true);
                     
                    jLabelER_Text.setVisible(false);
                    
             
                }

            }
        } catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_jBnMod_F5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String sql = "SELECT * FROM Departement WHERE code=? ";

        try{

            pst = connexion.prepareStatement(sql);

            pst.setString(1, jTextFCOD_DEP.getText());

            reslt=pst.executeQuery();

            if(reslt.next()){
                
                jTextFCOD_DEP.setText(reslt.getString(1));
                jTextNom_DEP.setText(reslt.getString(2));

            }   else{

                JOptionPane.showMessageDialog(null, "Ce departement ne pas rensistre ! ");

                jTextFCOD_DEP.setText(null);
                jTextNom_DEP.setText(null);

                jLabelER_Text.setVisible(false);

            }

        }  catch(Exception exep){

            JOptionPane.showMessageDialog(null,exep.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        // TODO add your handling code here:

       try{

            String sql= "INSERT INTO Departement (code,  nom_depart ) VALUES(?, ?)";

            pst = connexion.prepareStatement(sql);

            pst.setString(1, jTextFCOD_DEP.getText());
            pst.setString(2, jTextNom_DEP.getText());

            if( jTextFCOD_DEP.getText().isEmpty() ||   jTextNom_DEP.getText().isEmpty()){

                jLabelER_Text.setVisible(true);

            }
            else{
                
         
                    int ajout=   pst.executeUpdate();

                    if(ajout >0){

                        JOptionPane.showMessageDialog(null, "La departement a été ajouté avec succès ");
                        
                        
                     jTableAfficheEt.setModel(new DefaultTableModel(null, new Object[]{"CODE DEPARTEMENT","NOM DEPARTEMENT"}));

                     dp. fillEtudiantTable(ListeDepartements.jTableAfficheEt,"");
                        
                    jTextFCOD_DEP.setText(null);
                    jTextNom_DEP.setText(null);
                    
                    jLabelER_Text.setVisible(false);
                    
                    
                    jButtonValider.setEnabled(false);
                    jBnAjouF5.setEnabled(true);
                   jButtonValider.setEnabled(false);

                   
                }
            }
        }catch(Exception e){

            JOptionPane.showMessageDialog(this,"Le  CNE (' "+ jTextFCOD_DEP.getText()+" ') existe deja!!");
        }

    }//GEN-LAST:event_jButtonValiderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Departement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnAjouF5;
    private javax.swing.JButton jBnMod_F5;
    private javax.swing.JButton jBnSup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelER_Text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextFCOD_DEP;
    private javax.swing.JTextField jTextNom_DEP;
    // End of variables declaration//GEN-END:variables
}
