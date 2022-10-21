/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;

/**
 *
 * @author yasmi
 */
public class Home_CEAP_GUI extends javax.swing.JFrame {

    /**
     * Creates new form home_DGV_GUI
     */
    public Home_CEAP_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FundoPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botaoChaves = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        Titulo = new javax.swing.JLabel();
        Subtitulo = new javax.swing.JLabel();
        Copyright = new javax.swing.JLabel();
        botaoItens = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        botaoDados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        botaoSair = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagina Inicial");
        setUndecorated(true);

        FundoPrincipal.setLayout(null);

        jPanel1.setLayout(null);

        botaoChaves.setBackground(new java.awt.Color(204, 204, 204));
        botaoChaves.setToolTipText("Gerenciar registro de chaves.");
        botaoChaves.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoChaves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoChavesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoChavesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoChavesMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gerenciar Chaves");

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Chaves.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botaoChavesLayout = new javax.swing.GroupLayout(botaoChaves);
        botaoChaves.setLayout(botaoChavesLayout);
        botaoChavesLayout.setHorizontalGroup(
            botaoChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoChavesLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        botaoChavesLayout.setVerticalGroup(
            botaoChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoChavesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoChavesLayout.createSequentialGroup()
                        .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(botaoChaves);
        botaoChaves.setBounds(0, 160, 260, 50);

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("CEAP");
        jPanel1.add(Titulo);
        Titulo.setBounds(10, 10, 240, 40);

        Subtitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitulo.setText("Gerenciamento de Chaves");
        jPanel1.add(Subtitulo);
        Subtitulo.setBounds(10, 54, 240, 20);

        Copyright.setText("@yasnikki - @sle");
        jPanel1.add(Copyright);
        Copyright.setBounds(10, 454, 240, 20);

        botaoItens.setBackground(new java.awt.Color(204, 204, 204));
        botaoItens.setToolTipText("Gerenciar registro de itens.");
        botaoItens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoItensMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoItensMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoItensMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Gerenciar Itens");

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Itens.png"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botaoItensLayout = new javax.swing.GroupLayout(botaoItens);
        botaoItens.setLayout(botaoItensLayout);
        botaoItensLayout.setHorizontalGroup(
            botaoItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoItensLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        botaoItensLayout.setVerticalGroup(
            botaoItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoItensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoItensLayout.createSequentialGroup()
                        .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(botaoItens);
        botaoItens.setBounds(0, 220, 260, 50);

        botaoDados.setBackground(new java.awt.Color(204, 204, 204));
        botaoDados.setToolTipText("Gerenciar dados cadastrados.");
        botaoDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoDadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoDadosMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Gerenciar Dados");

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Database.png"))); // NOI18N

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botaoDadosLayout = new javax.swing.GroupLayout(botaoDados);
        botaoDados.setLayout(botaoDadosLayout);
        botaoDadosLayout.setHorizontalGroup(
            botaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoDadosLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(panelImage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        botaoDadosLayout.setVerticalGroup(
            botaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoDadosLayout.createSequentialGroup()
                        .addComponent(panelImage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(botaoDados);
        botaoDados.setBounds(0, 280, 260, 50);

        botaoSair.setBackground(new java.awt.Color(204, 204, 204));
        botaoSair.setToolTipText("");
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoSairMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fechar Software");

        javax.swing.GroupLayout botaoSairLayout = new javax.swing.GroupLayout(botaoSair);
        botaoSair.setLayout(botaoSairLayout);
        botaoSairLayout.setHorizontalGroup(
            botaoSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoSairLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        botaoSairLayout.setVerticalGroup(
            botaoSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(botaoSair);
        botaoSair.setBounds(0, 340, 260, 50);

        FundoPrincipal.add(jPanel1);
        jPanel1.setBounds(0, 0, 260, 490);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        FundoPrincipal.add(panelImage1);
        panelImage1.setBounds(70, 0, 660, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(730, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoChavesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoChavesMouseEntered
        
        botaoChaves.setBackground(new Color(153,153,153));
        
    }//GEN-LAST:event_botaoChavesMouseEntered

    private void botaoChavesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoChavesMouseExited
        
        botaoChaves.setBackground(new Color(204,204,204));
        
    }//GEN-LAST:event_botaoChavesMouseExited

    private void botaoItensMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoItensMouseEntered
        
        botaoItens.setBackground(new Color(153,153,153));
        
    }//GEN-LAST:event_botaoItensMouseEntered

    private void botaoItensMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoItensMouseExited
        
        botaoItens.setBackground(new Color(204,204,204));
        
    }//GEN-LAST:event_botaoItensMouseExited

    private void botaoDadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDadosMouseEntered
        
        botaoDados.setBackground(new Color(153,153,153));
        
    }//GEN-LAST:event_botaoDadosMouseEntered

    private void botaoDadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDadosMouseExited
        
        botaoDados.setBackground(new Color(204,204,204));
        
    }//GEN-LAST:event_botaoDadosMouseExited

    private void botaoSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseEntered
        
        botaoSair.setBackground(new Color(153,153,153));
        
    }//GEN-LAST:event_botaoSairMouseEntered

    private void botaoSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseExited
        
        botaoSair.setBackground(new Color(204,204,204));
        
    }//GEN-LAST:event_botaoSairMouseExited

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_botaoSairMouseClicked

    private void botaoDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDadosMouseClicked
        
        new Bd_CEAP_GUI().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_botaoDadosMouseClicked

    private void botaoChavesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoChavesMouseClicked
        
        new Chave_CEAP_GUI().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_botaoChavesMouseClicked

    private void botaoItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoItensMouseClicked
        
        new Item_CEAP_GUI().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_botaoItensMouseClicked

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
            java.util.logging.Logger.getLogger(Home_CEAP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_CEAP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_CEAP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_CEAP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_CEAP_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Copyright;
    private javax.swing.JPanel FundoPrincipal;
    private javax.swing.JLabel Subtitulo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel botaoChaves;
    private javax.swing.JPanel botaoDados;
    private javax.swing.JPanel botaoItens;
    private javax.swing.JPanel botaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    // End of variables declaration//GEN-END:variables
}
