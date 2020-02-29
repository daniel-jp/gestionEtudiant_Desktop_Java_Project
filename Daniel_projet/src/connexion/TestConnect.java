
package connexion;

import java.awt.Color;
import java.sql.Connection;


public class TestConnect extends javax.swing.JFrame {

    
    
    Connection connex =null;
    
    
    public TestConnect() {
        initComponents();
        
        connex = MySQLConnection.connecteur();
        
        
        
        
        if(connex !=null){
            
        jLabelCCON.setText("Bien connecte !");
          jLabelCCON.setForeground(Color.green);
        }else{
        
        
        jLabelCCON.setText("Erreur de connection !");
        
        jLabelCCON.setForeground(Color.red);
        }
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCCON = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCCON.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabelCCON.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCCON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCCON.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TESTING CONNECTION...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabelCCON, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(58, 58, 58)
                .addComponent(jLabelCCON)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestConnect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCCON;
    // End of variables declaration//GEN-END:variables
}
