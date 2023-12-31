/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Color;

/**
 *
 * @author dhiys
 */
public class MainMenuScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenuScreen() {
        initComponents();
        //BACKEND.DeckManager.removeCharsFromActiveDB();
        usernameLab1.setText("User: " + BACKEND.LoginManager.getUser());
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
        StartGameBut = new javax.swing.JButton();
        DeskCreatorBut = new javax.swing.JButton();
        ViewStatsBut = new javax.swing.JButton();
        label8 = new javax.swing.JLabel();
        ViewDeckBut = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        exitBut = new javax.swing.JButton();
        usernameLab1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        viewCharacterInfoBut = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TutBut2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(20, 19, 18));
        jPanel1.setPreferredSize(new java.awt.Dimension(1490, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StartGameBut.setBackground(new java.awt.Color(65, 49, 65));
        StartGameBut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        StartGameBut.setForeground(new java.awt.Color(228, 217, 226));
        StartGameBut.setText("New Game");
        StartGameBut.setBorder(null);
        StartGameBut.setPreferredSize(new java.awt.Dimension(286, 84));
        StartGameBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartGameButActionPerformed(evt);
            }
        });
        jPanel1.add(StartGameBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 290, 80));

        DeskCreatorBut.setBackground(new java.awt.Color(65, 49, 65));
        DeskCreatorBut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DeskCreatorBut.setForeground(new java.awt.Color(228, 217, 226));
        DeskCreatorBut.setText("Deck Creator");
        DeskCreatorBut.setBorder(null);
        DeskCreatorBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeskCreatorButActionPerformed(evt);
            }
        });
        jPanel1.add(DeskCreatorBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 290, 80));

        ViewStatsBut.setBackground(new java.awt.Color(65, 49, 65));
        ViewStatsBut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ViewStatsBut.setForeground(new java.awt.Color(228, 217, 226));
        ViewStatsBut.setText("View Stats");
        ViewStatsBut.setBorder(null);
        ViewStatsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewStatsButActionPerformed(evt);
            }
        });
        jPanel1.add(ViewStatsBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 290, 80));

        label8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userImg.jpg"))); // NOI18N
        label8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 220, 220));

        ViewDeckBut.setBackground(new java.awt.Color(65, 49, 65));
        ViewDeckBut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ViewDeckBut.setForeground(new java.awt.Color(228, 217, 226));
        ViewDeckBut.setText("View Deck");
        ViewDeckBut.setBorder(null);
        ViewDeckBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDeckButActionPerformed(evt);
            }
        });
        jPanel1.add(ViewDeckBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 290, 80));

        errorLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        errorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 740, 412, 42));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EXIT");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 100));

        exitBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/90x90button.png"))); // NOI18N
        exitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButActionPerformed(evt);
            }
        });
        jPanel1.add(exitBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 100));

        usernameLab1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        usernameLab1.setForeground(new java.awt.Color(228, 217, 226));
        usernameLab1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(usernameLab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 340, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/decor3.png"))); // NOI18N
        jLabel4.setText("kitty geniuses");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, 400, 400));

        jLabel3.setBackground(new java.awt.Color(211, 169, 196));
        jLabel3.setForeground(new java.awt.Color(224, 176, 176));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 420, 420));

        viewCharacterInfoBut.setBackground(new java.awt.Color(65, 49, 65));
        viewCharacterInfoBut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        viewCharacterInfoBut.setForeground(new java.awt.Color(228, 217, 226));
        viewCharacterInfoBut.setText("View Character Info");
        viewCharacterInfoBut.setBorder(null);
        viewCharacterInfoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCharacterInfoButActionPerformed(evt);
            }
        });
        jPanel1.add(viewCharacterInfoBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 290, 80));

        jLabel7.setBackground(new java.awt.Color(109, 161, 213));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 64)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(215, 148, 203));
        jLabel7.setText("Main Menu");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        TutBut2.setBackground(new java.awt.Color(65, 49, 65));
        TutBut2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TutBut2.setForeground(new java.awt.Color(228, 217, 226));
        TutBut2.setText("Tutorial");
        TutBut2.setBorder(null);
        TutBut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutBut2ActionPerformed(evt);
            }
        });
        jPanel1.add(TutBut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 290, 80));

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
    }// </editor-fold>//GEN-END:initComponents

    private void StartGameButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGameButActionPerformed
        // TODO add your handling code here:
        if (BACKEND.DeckManager.isFullDeck()) {
            //go to start
            //REROLLSCREEN
            this.setVisible(false);
            DiceRollingScreen rs = new DiceRollingScreen();
            rs.setVisible(true);
        } else {
            errorLabel.setText("Need to create a deck first.");
            errorLabel.setForeground(Color.red);
        }
    }//GEN-LAST:event_StartGameButActionPerformed

    private void DeskCreatorButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeskCreatorButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DeckCharCreatorScreen dccs = new DeckCharCreatorScreen();
        dccs.setVisible(true);
    }//GEN-LAST:event_DeskCreatorButActionPerformed

    private void ViewStatsButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewStatsButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
            ViewStats vs = new ViewStats();
            vs.setVisible(true);
    }//GEN-LAST:event_ViewStatsButActionPerformed

    private void ViewDeckButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDeckButActionPerformed
        // TODO add your handling code here:
        if (BACKEND.DeckManager.isFullDeck()) {
            //go to start
            this.setVisible(false);
            ViewDeckScreen vds = new ViewDeckScreen();
            vds.setVisible(true);
        } else {
            errorLabel.setText("Need to create a deck first.");
            errorLabel.setForeground(Color.red);
        }


    }//GEN-LAST:event_ViewDeckButActionPerformed

    private void exitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButActionPerformed
        // TODO add your handling code here:
        BACKEND.DeckManager.clearCardDeck();
        BACKEND.DeckManager.clearCharacterDeck();
        this.setVisible(false);
        LoginScreen ls = new LoginScreen();
        ls.setVisible(true);
    }//GEN-LAST:event_exitButActionPerformed

    private void viewCharacterInfoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCharacterInfoButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CharacterInfoScreen cis = new CharacterInfoScreen();
        cis.setVisible(true);
    }//GEN-LAST:event_viewCharacterInfoButActionPerformed

    private void TutBut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutBut2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TutorialScreen ts = new TutorialScreen();
        ts.setVisible(true);
    }//GEN-LAST:event_TutBut2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeskCreatorBut;
    private javax.swing.JButton StartGameBut;
    private javax.swing.JButton TutBut2;
    private javax.swing.JButton ViewDeckBut;
    private javax.swing.JButton ViewStatsBut;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton exitBut;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel usernameLab1;
    private javax.swing.JButton viewCharacterInfoBut;
    // End of variables declaration//GEN-END:variables
}
