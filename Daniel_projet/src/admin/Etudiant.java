
package admin;

import connexion.MySQLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilisateur.ListeDepartements;
import static utilisateur.ListeDepartements.jTableAfficheEt;
import utilisateur.ListeEtudiants;



public class Etudiant extends javax.swing.JFrame {

                 Connection connexion =null;
                
                PreparedStatement pst = null;
                ResultSet reslt = null;
                
                ListeEtudiants st = new ListeEtudiants();
                
                String driver = "com.mysql.jdbc.Driver";
                String url ="jdbc:mysql://localhost:8889/G_Etudiant";
                String username="danny";
                String password="d012345";
          
       public Etudiant() {
                        initComponents();
        
                        
        connexion = MySQLConnection.connecteur();
      
        jLabelER_Text.setVisible(false);
        
         try{
       
               String query = "SELECT * FROM Etudiant ";
       
              pst= connexion.prepareStatement(query);
              reslt=pst.executeQuery();
              
              while(reslt.next()){
                  
               this.jComboCod_Dep1.addItem(reslt.getString("code"));
               this.jComboCode_Fil.addItem(reslt.getString("code_filiere"));
              }
              
        }catch (Exception exception){
            JOptionPane.showMessageDialog(this, exception.getMessage());
        
        }
  
         
        
           jBtn_Ajouter.setEnabled(false);
           
         this.setLocationRelativeTo(null);
    }

         public void ajouter() {

                    try{

                   Class.forName(driver);

                    String sql= "INSERT INTO Etudiant (cne, nom, prenom, adresse, sexe, Tel, code, code_filiere ) VALUES(?,?,?,?,?,?,?,?) ";
                    connexion = DriverManager.getConnection(url, username, password);


                      pst = connexion.prepareStatement(sql);

                      pst.setString(1, jTexCNE.getText());
                      pst.setString(2, jTexNomEt.getText());
                      pst.setString(3, jTextPrenomEt.getText());
                      pst.setString(4, jTextAreAdress.getText());
                      pst.setString(5, jComboSexe.getSelectedItem().toString());
                      pst.setString(6, jTextTeleph.getText());
                      pst.setString(7, jComboCod_Dep1.getSelectedItem().toString());
                      pst.setString(8, jComboCode_Fil.getSelectedItem().toString());
                       pst.setString(1, jTexCNE.getText());

              
                      if( jTexCNE.getText().isEmpty()
                              ||   jTexNomEt.getText().isEmpty()
                              || jTextPrenomEt.getText().isEmpty()
                              ||jTextAreAdress.getText().isEmpty()||jTextTeleph.getText().isEmpty()){



                        jLabelER_Text.setVisible(true);

                      }
                      
                     
                      else{

                      int ajout=   pst.executeUpdate();

                      if(ajout >0){

                         JOptionPane.showMessageDialog(null, "L'etudiant a été ajouté avec succès ");

//                      jTexCNE.setText(null);
//                      jTexNomEt.setText(null);
//                      jTextPrenomEt.setText(null);
//                      jTextAreAdress.setText(null);
//                      jComboSexe.setSelectedItem(null);
//                      jTextTeleph.setText(null); 
//                      jComboCod_Dep1.setSelectedItem(null);
//                      jComboCode_Fil.setSelectedItem(null);

                    
                         jLabelER_Text.setVisible(false);
                      } 
                  }
                    }catch(Exception e){


                        JOptionPane.showMessageDialog(this,"Le  CNE (' "+ jTexCNE.getText()+" ') existe deja!!");

                        
                    }


        }

         public void suppression(){

  
                    String sql ="DELETE  FROM Etudiant WHERE cne=? ";
                    
                    try{
                    
                         pst = connexion.prepareStatement(sql);
                         
                         pst.setString(1,jTexCNE.getText());
                     
                         
                      
                             int confirmation   
                              = JOptionPane.showConfirmDialog(null, "Voulez-vous  supprimer cet étudiant?","Atantion",JOptionPane.YES_NO_OPTION);

                               if (confirmation==JOptionPane.YES_OPTION){
    
                           
                                      int delete = pst.executeUpdate();
                         
                                          if (delete>0){
                         
                                            JOptionPane.showMessageDialog(null, "Etudiant bien supprimé ");
                                            jTableAfficheEt.setModel(new DefaultTableModel(null, new Object[]{"CNE","NOM","PRENOM","ADRESSE","SEXE","TELPHONE","CODE DEPART","CODE FILIERE"}));
                                      
                                            st.fillEtudiantTable(ListeDepartements.jTableAfficheEt,"");
                                            
                                            jTexCNE.setText(null);
                                            jTexNomEt.setText(null);
                                            jTextPrenomEt.setText(null);
                                            jTextAreAdress.setText(null);
                                            jComboSexe.setSelectedItem(null);
                                            jTextTeleph.setText(null); 
                                            jComboCod_Dep1.setSelectedItem(null);
                                            jComboCode_Fil.setSelectedItem(null);

                                     }
                                  }  
                        
                       
                    }catch(Exception ex){
                    
                
                     //   JOptionPane.showMessageDialog(null, ex.getMessage());
                     
                 

                    }
               }
        
         
         public void modification(){
        
                  String sql = "UPDATE  Etudiant SET  nom= '"+ jTexNomEt.getText()+"', prenom= '"+jTextPrenomEt.getText()
                          
                          +"', adresse= '"+ jTextAreAdress.getText()+"', sexe= '"+ jComboSexe.getSelectedItem().toString()
                          +"', Tel= '"+ jTextTeleph.getText()+"', code = '"+jComboCod_Dep1.getSelectedItem().toString()+"', code_filiere= '"+jComboCode_Fil.getSelectedItem().toString()+"' WHERE cne=  '"+ jTexCNE.getText()+"'";
        
                  try{ 
                      
                      
                      pst = connexion.prepareStatement(sql);
                                   
                      
                       if( jTexCNE.getText().isEmpty()
                              ||   jTexNomEt.getText().isEmpty()
                              || jTextPrenomEt.getText().isEmpty()
                              ||jTextAreAdress.getText().isEmpty()||jTextTeleph.getText().isEmpty()){

                        jLabelER_Text.setVisible(true);

                      }

                      else{

                      int modif=   pst.executeUpdate();

                      if(modif > 0){

                         JOptionPane.showMessageDialog(null, "L'etudiant a été modifie avec succès ");

//                      jTexCNE.setText(null);
//                      jTexNomEt.setText(null);
//                      jTextPrenomEt.setText(null);
//                      jTextAreAdress.setText(null);
//                      jComboSexe.setSelectedItem(null);
//                      jTextTeleph.setText(null); 
//                      jComboCod_Dep1.setSelectedItem(null);
//                      jComboCode_Fil.setSelectedItem(null);

                         jLabelER_Text.setVisible(false);
                      } 
                       
                   }
                  } catch(Exception ex){
                  
                     JOptionPane.showMessageDialog(null, ex.getMessage());

                  }
                     
        
        
        
        
        
        
        }
         
         
         
         public void cosulter(){
         
             String sql = "SELECT * FROM Etudiant WHERE cne=? ";
             
             try{
                    
                    pst = connexion.prepareStatement(sql);
                    
                    pst.setString(1, jTexCNE.getText());
                    
                    reslt=pst.executeQuery();
                    
                    if(reslt.next()){
                    
                   jTexNomEt.setText(reslt.getString(2));
                   jTextPrenomEt.setText(reslt.getString(3));
                   jTextAreAdress.setText(reslt.getString(4));
                   jComboSexe.setSelectedItem(reslt.getString(5));
                   jTextTeleph.setText(reslt.getString(6));
                   jComboCod_Dep1.setSelectedItem(reslt.getString(7));
                   jComboCode_Fil.setSelectedItem(reslt.getString(8));
            
                    }   else{

                    
                         JOptionPane.showMessageDialog(null, "Cet Etudiant n'a pas rensistre ! ");

                      jTexCNE.setText("cne");
                    
                      
                        jLabelER_Text.setVisible(false);
                        
                    
                    }
             
             }  catch(Exception exep){
                 
                  JOptionPane.showMessageDialog(null,exep);
           }
 }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTexNomEt = new javax.swing.JTextField();
        jTextPrenomEt = new javax.swing.JTextField();
        jTexCNE = new javax.swing.JTextField();
        jTextTeleph = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreAdress = new javax.swing.JTextArea();
        jComboCode_Fil = new javax.swing.JComboBox<>();
        jComboSexe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboCod_Dep1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBtn_Ajouter = new javax.swing.JButton();
        jBn_Supp = new javax.swing.JButton();
        jBnModif = new javax.swing.JButton();
        jButtonValider = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelER_Text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(java.awt.Color.white);

        jTexNomEt.setBackground(new java.awt.Color(255, 255, 255));
        jTexNomEt.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jTexNomEt.setPreferredSize(null);

        jTextPrenomEt.setBackground(new java.awt.Color(255, 255, 255));
        jTextPrenomEt.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jTextPrenomEt.setPreferredSize(null);

        jTexCNE.setBackground(new java.awt.Color(255, 255, 255));
        jTexCNE.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jTexCNE.setMargin(new java.awt.Insets(2, 0, 0, 0));

        jTextTeleph.setBackground(new java.awt.Color(255, 255, 255));
        jTextTeleph.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jTextTeleph.setPreferredSize(null);
        jTextTeleph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelephActionPerformed(evt);
            }
        });

        jTextAreAdress.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreAdress.setColumns(20);
        jTextAreAdress.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jTextAreAdress.setRows(5);
        jTextAreAdress.setPreferredSize(null);
        jScrollPane1.setViewportView(jTextAreAdress);

        jComboCode_Fil.setBackground(new java.awt.Color(255, 255, 255));
        jComboCode_Fil.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jComboCode_Fil.setPreferredSize(null);

        jComboSexe.setBackground(new java.awt.Color(255, 255, 255));
        jComboSexe.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jComboSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Homme", " Femme", " " }));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("CNE");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("PRENOM");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("NOM");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("ADRESSE");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("SEXE");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("TELPHONE");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("CODE DEPART");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("CODE FILIERE");

        jComboCod_Dep1.setBackground(new java.awt.Color(255, 255, 255));
        jComboCod_Dep1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jComboCod_Dep1.setPreferredSize(null);

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
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTexCNE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTexNomEt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextPrenomEt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextTeleph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboCod_Dep1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboCode_Fil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jTexCNE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTexNomEt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPrenomEt, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboSexe, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jTextTeleph, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jComboCod_Dep1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboCode_Fil, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jBtn_Ajouter.setBackground(new java.awt.Color(0, 153, 204));
        jBtn_Ajouter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn_Ajouter.setForeground(java.awt.Color.white);
        jBtn_Ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add_user_male.png"))); // NOI18N
        jBtn_Ajouter.setText("Nouvau");
        jBtn_Ajouter.setBorder(null);
        jBtn_Ajouter.setContentAreaFilled(false);
        jBtn_Ajouter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtn_Ajouter.setOpaque(true);
        jBtn_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_AjouterActionPerformed(evt);
            }
        });

        jBn_Supp.setBackground(new java.awt.Color(0, 153, 204));
        jBn_Supp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBn_Supp.setForeground(java.awt.Color.white);
        jBn_Supp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete_document.png"))); // NOI18N
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

        jBnModif.setBackground(new java.awt.Color(0, 0, 0));
        jBnModif.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBnModif.setForeground(java.awt.Color.white);
        jBnModif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-change_user.png"))); // NOI18N
        jBnModif.setText("Modifier");
        jBnModif.setBorder(null);
        jBnModif.setContentAreaFilled(false);
        jBnModif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBnModif.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBnModif.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBnModif.setOpaque(true);
        jBnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnModifActionPerformed(evt);
            }
        });

        jButtonValider.setBackground(new java.awt.Color(0, 153, 204));
        jButtonValider.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonValider.setForeground(java.awt.Color.white);
        jButtonValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-ok.png"))); // NOI18N
        jButtonValider.setText("Valider");
        jButtonValider.setBorder(null);
        jButtonValider.setContentAreaFilled(false);
        jButtonValider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonValider.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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
                .addGap(36, 36, 36)
                .addComponent(jBtn_Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jBn_Supp, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn_Ajouter)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBn_Supp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBnModif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATION D'ETUDIANT");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(145, 145, 145))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelER_Text.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabelER_Text.setForeground(new java.awt.Color(255, 51, 51));
        jLabelER_Text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-high_priority.png"))); // NOI18N
        jLabelER_Text.setText("Le remplissage de champs sont obligatoires *");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jLabelER_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelER_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_AjouterActionPerformed
       

                   jTexCNE.setText(null);
                      jTexNomEt.setText(null);
                      jTextPrenomEt.setText(null);
                      jTextAreAdress.setText(null);
                      jComboSexe.setSelectedItem(null);
                      jTextTeleph.setText(null); 
                      jComboCod_Dep1.setSelectedItem(null);
                      jComboCode_Fil.setSelectedItem(null);

                      jButtonValider.setEnabled(true);
                      jBtn_Ajouter.setEnabled(false);



    }//GEN-LAST:event_jBtn_AjouterActionPerformed

    private void jBn_SuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBn_SuppActionPerformed
       
                      jTexNomEt.setText(null);
                      jTextPrenomEt.setText(null);
                      jTextAreAdress.setText(null);
                      jComboSexe.setSelectedItem(null);
                      jTextTeleph.setText(null); 
                      jComboCod_Dep1.setSelectedItem(null);
                      jComboCode_Fil.setSelectedItem(null);

          jButtonValider.setEnabled(false);
          jBtn_Ajouter.setEnabled(true);
          suppression();
             
      
    }//GEN-LAST:event_jBn_SuppActionPerformed

    private void jBnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnModifActionPerformed

        jButtonValider.setEnabled(false);
        jBtn_Ajouter.setEnabled(true);
        
        modification();
        
        
    }//GEN-LAST:event_jBnModifActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
            jButtonValider.setEnabled(false);
            jBtn_Ajouter.setEnabled(true);
                      
           cosulter();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextTelephActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelephActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelephActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed

                        jButtonValider.setEnabled(false);
                        jBtn_Ajouter.setEnabled(true);
        ajouter();
    }//GEN-LAST:event_jButtonValiderActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnModif;
    private javax.swing.JButton jBn_Supp;
    private javax.swing.JButton jBtn_Ajouter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox<String> jComboCod_Dep1;
    private javax.swing.JComboBox<String> jComboCode_Fil;
    private javax.swing.JComboBox<String> jComboSexe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelER_Text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTexCNE;
    private javax.swing.JTextField jTexNomEt;
    private javax.swing.JTextArea jTextAreAdress;
    private javax.swing.JTextField jTextPrenomEt;
    private javax.swing.JTextField jTextTeleph;
    // End of variables declaration//GEN-END:variables
}
