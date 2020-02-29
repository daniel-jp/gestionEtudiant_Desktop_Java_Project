
package utilisateur;

import connexion.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListeEtudiants extends javax.swing.JFrame {

                Connection connexion =null;
                
                PreparedStatement pst = null;
                ResultSet reslt = null;
    
    
 
    
    
    public ListeEtudiants() {
        
        initComponents();
        
        connexion = MySQLConnection.connecteur();
        
        
        fillEtudiantTable(jTableAfficheEt,"");
        
         this.setLocationRelativeTo(null);
    }

    
    
     public void fillEtudiantTable(JTable table, String valueAchrecher ){
    
        
        
          String sql = "SELECT * FROM `Etudiant` WHERE CONCAT(`nom`, `prenom`, `Tel`)LIKE ? ";
           
          
          
       try{
       
       pst= connexion.prepareStatement(sql);
       pst.setString(1, "%"+valueAchrecher+"%");
       
       reslt=pst.executeQuery();
       
       DefaultTableModel tb = (DefaultTableModel)table.getModel();
       
       Object [] row;
       
         while(reslt.next()){
             
             row = new Object[8];
            
              
                    row[0]=reslt.getString(1);
                    row[1]=reslt.getString(2);
                    row[2]=reslt.getString(3);
                    row[3]=reslt.getString(4);
                    row[4]=reslt.getString(5);
                    row[5]=reslt.getString(6);
                    row[6]=reslt.getString(7);
                    row[7]=reslt.getString(8);
             
             tb.addRow(row);
             
             
         
         
         
         }
       
       
       }catch(Exception et){
           
       
       
       }
        
    
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextRecher = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAfficheEt = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jTextRecher.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTextRecher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextRecherKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextRecherKeyPressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Recherche etudiant par nom ou prenom : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextRecher, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextRecher, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(25, 52, 79));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableAfficheEt.setBackground(new java.awt.Color(153, 102, 0));
        jTableAfficheEt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTableAfficheEt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableAfficheEt.setForeground(new java.awt.Color(0, 0, 0));
        jTableAfficheEt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNE", "NOM", "PRENOM", "ADRESSE", "SEXE", "TELPHONE", "CODE DEPART", "CODE FILIERE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAfficheEt.setRowHeight(18);
        jTableAfficheEt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAfficheEtMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableAfficheEt);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LISTE COMPLETE DES ETUDIANTS ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(145, 145, 145))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAfficheEtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAfficheEtMouseClicked

        
        int rowIndex = jTableAfficheEt.getSelectedRow();
        
         DefaultTableModel model = (DefaultTableModel)jTableAfficheEt.getModel();
         
         jTextRecher.setText(model.getValueAt(rowIndex, 0).toString());
          
        
        
    }//GEN-LAST:event_jTableAfficheEtMouseClicked

    private void jTextRecherKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRecherKeyTyped

        jTableAfficheEt.setModel(new DefaultTableModel(null, new Object[]{"CNE","NOM","PRENOM","ADRESSE","SEXE","TELPHONE","CODE DEPART","CODE FILIERE"}));
         this.fillEtudiantTable(jTableAfficheEt,jTextRecher.getText());
        
        
    }//GEN-LAST:event_jTextRecherKeyTyped

    private void jTextRecherKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRecherKeyPressed
       
   jTableAfficheEt.setModel(new DefaultTableModel(null, new Object[]{"CNE","NOM","PRENOM","ADRESSE","SEXE","TELPHONE","CODE DEPART","CODE FILIERE"}));
         this.fillEtudiantTable(jTableAfficheEt,jTextRecher.getText());
        
        
    }//GEN-LAST:event_jTextRecherKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListeEtudiants().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTableAfficheEt;
    private javax.swing.JTextField jTextRecher;
    // End of variables declaration//GEN-END:variables
}
