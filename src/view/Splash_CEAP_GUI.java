
package view;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash_CEAP_GUI extends javax.swing.JFrame {

    public Splash_CEAP_GUI() {
        initComponents();
        
        new Thread(){
            public void run(){
                for(int i=0;i<101;i++){
                    try {
                        sleep(8);
                        LoadBar.setValue(i);
                        
                        if (LoadBar.getValue() == 50){
                            LoadTXT.setText("Carregando sistema");
                        }
                        
                        else if (LoadBar.getValue() == 80){
                            LoadTXT.setText("Sistema inicializado");
                        }
                        
                        else if (LoadBar.getValue() == 99){
                            LoadTXT.setText("Sistema inicializado");
                            
                            new Home_CEAP_GUI().setVisible(true);
                            dispose();
                        }
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash_CEAP_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
            
        }.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EscolaTitle = new javax.swing.JLabel();
        LoadBar = new javax.swing.JProgressBar();
        LoadTXT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Carregamento");
        setUndecorated(true);

        jPanel1.setLayout(null);

        EscolaTitle.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        EscolaTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EscolaTitle.setText("CEAP");
        jPanel1.add(EscolaTitle);
        EscolaTitle.setBounds(10, 10, 430, 70);
        jPanel1.add(LoadBar);
        LoadBar.setBounds(20, 110, 410, 14);

        LoadTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoadTXT.setText("Carregando");
        jPanel1.add(LoadTXT);
        LoadTXT.setBounds(20, 90, 410, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(450, 144));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash_CEAP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_CEAP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_CEAP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_CEAP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash_CEAP_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EscolaTitle;
    private javax.swing.JProgressBar LoadBar;
    private javax.swing.JLabel LoadTXT;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
