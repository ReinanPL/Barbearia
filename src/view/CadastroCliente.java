/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.CadastroClienteController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Reinan
 */
public class CadastroCliente extends javax.swing.JFrame {
    
    private final CadastroClienteController controller;

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        controller = new CadastroClienteController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        TextFormatedData = new javax.swing.JFormattedTextField();
        bottomCadastrar = new javax.swing.JButton();
        emailTxt = new javax.swing.JTextField();
        cepTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sexooTxt = new javax.swing.JComboBox<>();
        idTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        telefoneTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rgTxt = new javax.swing.JTextField();
        enderecoTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastro de Clientes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        TextFormatedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        TextFormatedData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFormatedDataActionPerformed(evt);
            }
        });
        getContentPane().add(TextFormatedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 280, 40));

        bottomCadastrar.setBackground(new java.awt.Color(60, 233, 106));
        bottomCadastrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bottomCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        bottomCadastrar.setText("Cadastrar");
        bottomCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(bottomCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 470, 60));
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 270, 40));
        getContentPane().add(cepTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 230, 40));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("email");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        sexooTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        sexooTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexooTxtActionPerformed(evt);
            }
        });
        getContentPane().add(sexooTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 372, 230, 40));

        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 230, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 230, 40));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data Nascimento");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefone");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, -1));

        telefoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneTxtActionPerformed(evt);
            }
        });
        getContentPane().add(telefoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 230, 40));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rg");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, -1, -1));
        getContentPane().add(rgTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 230, 40));

        enderecoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(enderecoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 230, 40));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Endereço");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cep");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/fundo-cadastro-clientes.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 726));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1210, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFormatedDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFormatedDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFormatedDataActionPerformed

    private void bottomCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomCadastrarActionPerformed
        controller.cadastrarClientes();

    }//GEN-LAST:event_bottomCadastrarActionPerformed

    private void sexooTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexooTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexooTxtActionPerformed

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void telefoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneTxtActionPerformed

    private void enderecoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoTxtActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField TextFormatedData;
    private javax.swing.JButton bottomCadastrar;
    private javax.swing.JTextField cepTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField enderecoTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField rgTxt;
    private javax.swing.JComboBox<String> sexooTxt;
    private javax.swing.JTextField telefoneTxt;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
    public JFormattedTextField getTextFormatedData() {
        return TextFormatedData;
    }

    public void setTextFormatedData(JFormattedTextField TextFormatedData) {
        this.TextFormatedData = TextFormatedData;
    }

    public JButton getBottomCadastrar() {
        return bottomCadastrar;
    }

    public void setBottomCadastrar(JButton bottomCadastrar) {
        this.bottomCadastrar = bottomCadastrar;
    }

    public JTextField getCepTxt() {
        return cepTxt;
    }

    public void setCepTxt(JTextField cepTxt) {
        this.cepTxt = cepTxt;
    }

    public JTextField getEmailTxt() {
        return emailTxt;
    }

    public void setEmailTxt(JTextField emailTxt) {
        this.emailTxt = emailTxt;
    }

    public JTextField getEnderecoTxt() {
        return enderecoTxt;
    }

    public void setEnderecoTxt(JTextField enderecoTxt) {
        this.enderecoTxt = enderecoTxt;
    }

    public JTextField getIdTxt() {
        return idTxt;
    }

    public void setIdTxt(JTextField idTxt) {
        this.idTxt = idTxt;
    }

    public JTextField getNomeTxt() {
        return nomeTxt;
    }

    public void setNomeTxt(JTextField nomeTxt) {
        this.nomeTxt = nomeTxt;
    }

    public JTextField getRgTxt() {
        return rgTxt;
    }

    public void setRgTxt(JTextField rgTxt) {
        this.rgTxt = rgTxt;
    }

    public JComboBox<String> getSexooTxt() {
        return sexooTxt;
    }

    public void setSexooTxt(JComboBox<String> sexooTxt) {
        this.sexooTxt = sexooTxt;
    }

    public JTextField getTelefoneTxt() {
        return telefoneTxt;
    }

    public void setTelefoneTxt(JTextField telefoneTxt) {
        this.telefoneTxt = telefoneTxt;
    }
 
   
}
