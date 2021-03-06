/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdpoint.telas;

import birdpoint.empresa.Empresa;
import birdpoint.empresa.EmpresaDAO;
import birdpoint.empresa.EmpresaTableModel;
import birdpoint.util.Util;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano Lima
 */
public class CadastroEmpresa extends javax.swing.JDialog {

    Empresa empresa = new Empresa();
    EmpresaDAO empresaDAO = new EmpresaDAO();

    public CadastroEmpresa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btLimparActionPerformed(null);

        this.getRootPane().setDefaultButton(btSalvar);
    }


    private void selecionarFoto() {
        BufferedImage bi;
        File file;
        selecionarFoto.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                return (f.getName().endsWith(".jpg")) || f.isDirectory();
            }

            public String getDescription() {
                return "Arquivos em Formato (*.jpg)";
            }
        });

        int returnVal = selecionarFoto.showOpenDialog(this);
        if (returnVal == selecionarFoto.APPROVE_OPTION) {
            try {
                file = selecionarFoto.getSelectedFile();
                bi = ImageIO.read(file);//carrega a imagem real num buffer  
                BufferedImage aux = new BufferedImage(120, 140, bi.getType());//cria um buffer auxiliar com o tamanho desejado    
                Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
                AffineTransform at = AffineTransform.getScaleInstance((double) 120 / bi.getWidth(), (double) 140 / bi.getHeight());//cria a transformacao  
                g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar 
                // Capturar foto formatada e converter bytes pra salvar
                ImageIcon foto = new ImageIcon();
                foto.setImage(aux);
                btFoto.setIcon(foto);
                empresa.setFotoEmpresa(Util.imageToByte(aux));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Não foi possível carregar essa imagem",
                        "Erro ao carregar imagem", JOptionPane.ERROR_MESSAGE);
                btFoto.setIcon(new ImageIcon(getClass().getResource("/birdpoint/imagens/default.jpg")));
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        selecionarFoto = new javax.swing.JFileChooser();
        tfNomeFantasia = new javax.swing.JTextField();
        jLObrigatorioNome1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        tfTelefone = new javax.swing.JFormattedTextField();
        tfCNPJ = new javax.swing.JFormattedTextField();
        tfNome = new javax.swing.JTextField();
        jLObrigatorioNome = new javax.swing.JLabel();
        jLObrigatorioCpf = new javax.swing.JLabel();
        btFoto = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlCadProfessores = new javax.swing.JLabel();

        selecionarFoto.setMaximumSize(new java.awt.Dimension(580, 245));
        selecionarFoto.setMinimumSize(new java.awt.Dimension(550, 245));
        selecionarFoto.setPreferredSize(new java.awt.Dimension(520, 320));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 421));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        tfNomeFantasia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        tfNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeFantasiaActionPerformed(evt);
            }
        });
        getContentPane().add(tfNomeFantasia);
        tfNomeFantasia.setBounds(270, 130, 290, 23);

        jLObrigatorioNome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome1.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome1.setText("*");
        getContentPane().add(jLObrigatorioNome1);
        jLObrigatorioNome1.setBounds(560, 120, 20, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Cadastro de Empresa");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 20, 320, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome.:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 100, 60, 20);

        tfEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        getContentPane().add(tfEmail);
        tfEmail.setBounds(210, 190, 170, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Telefone:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(360, 160, 70, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Rua.:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 220, 40, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Bairro.:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 220, 60, 20);

        tfRua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        getContentPane().add(tfRua);
        tfRua.setBounds(190, 220, 130, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("N.:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 220, 20, 20);

        tfBairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        getContentPane().add(tfBairro);
        tfBairro.setBounds(450, 220, 110, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Cidade.:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 190, 60, 19);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CNPJ.:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 160, 50, 17);

        tfNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        getContentPane().add(tfNumero);
        tfNumero.setBounds(350, 220, 30, 23);

        tfCidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        tfCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(tfCidade);
        tfCidade.setBounds(450, 190, 110, 23);

        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/voltar.png"))); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(20, 340, 90, 70);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(180, 340, 80, 70);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/pesquisar.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(280, 340, 100, 69);

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(390, 340, 80, 70);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/Salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(480, 340, 80, 70);

        tfTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefone.setToolTipText("");
        tfTelefone.setMinimumSize(new java.awt.Dimension(2, 19));
        tfTelefone.setName(""); // NOI18N
        tfTelefone.setPreferredSize(new java.awt.Dimension(2, 19));
        getContentPane().add(tfTelefone);
        tfTelefone.setBounds(430, 160, 130, 22);

        tfCNPJ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        try {
            tfCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCNPJ.setToolTipText("");
        tfCNPJ.setMinimumSize(new java.awt.Dimension(2, 19));
        tfCNPJ.setName(""); // NOI18N
        tfCNPJ.setPreferredSize(new java.awt.Dimension(2, 19));
        tfCNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCNPJFocusLost(evt);
            }
        });
        getContentPane().add(tfCNPJ);
        tfCNPJ.setBounds(210, 160, 130, 22);

        tfNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(tfNome);
        tfNome.setBounds(210, 100, 350, 23);

        jLObrigatorioNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome.setText("*");
        getContentPane().add(jLObrigatorioNome);
        jLObrigatorioNome.setBounds(560, 90, 20, 30);

        jLObrigatorioCpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioCpf.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioCpf.setText("*");
        getContentPane().add(jLObrigatorioCpf);
        jLObrigatorioCpf.setBounds(340, 150, 10, 30);

        btFoto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/default.jpg"))); // NOI18N
        btFoto.setContentAreaFilled(false);
        btFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFoto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btFoto);
        btFoto.setBounds(20, 90, 120, 150);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("E-mail.:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(150, 190, 60, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nome Fantasia.:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 130, 120, 20);

        jlCadProfessores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/cadGenerico.png"))); // NOI18N
        jlCadProfessores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jlCadProfessores);
        jlCadProfessores.setBounds(0, 0, 600, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Util.limparCamposGenerico(this);
        btExcluir.setEnabled(false);
        empresa = new Empresa();
        tfCNPJ.setEnabled(true);
        btFoto.setIcon(new ImageIcon(getClass().getResource("/birdpoint/imagens/default.jpg")));
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<Empresa> lista;
        lista = (empresaDAO.listar());
        EmpresaTableModel itm = new EmpresaTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Empresa");
        if (objetoRetorno != null) {
            empresa = empresaDAO.consultarObjetoId("idEmpresa", objetoRetorno);
            tfNome.setText(empresa.getNomeEmpresa().toUpperCase());
            tfNomeFantasia.setText(empresa.getNomeFantasiaEmpresa().toUpperCase());
            tfEmail.setText(empresa.getEmailEmpresa());
            tfTelefone.setText(empresa.getTelefoneEmpresa());
            tfCidade.setText(empresa.getCidadeEnderecoEmpresa().toUpperCase());
            tfCNPJ.setText(empresa.getCnpjEmpresa());
            tfRua.setText(empresa.getRuaEmpresa().toUpperCase());
            tfBairro.setText(empresa.getBairroEnderecoEmpresa().toUpperCase());
            tfNumero.setText(String.valueOf(empresa.getNumeroEnderecoEmpresa()));
            try {
                ImageIcon foto = new ImageIcon();
                foto.setImage(Util.byteToImage(empresa.getFotoEmpresa()));
                btFoto.setIcon(foto);
            } catch (Exception e) {
            }
           
            btExcluir.setEnabled(true);
            tfCNPJ.setEnabled(false);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Object[] options = {"Sim", "Não"};
        if (empresa.getIdEmpresa() != 0) {
            if (JOptionPane.showOptionDialog(rootPane, "Deseja excluir a Empresa " + empresa.getNomeEmpresa()
                    + "?", "BirdPoint", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (empresaDAO.remover(empresa)) {
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir a Empresa " + empresa.getNomeEmpresa(),
                            "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "A exclusão foi cancelada!");
            }

        }
        btLimparActionPerformed(null);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (empresaDAO.consultarValorRepetido("cnpjEmpresa", tfCNPJ.getText()) && empresa.getIdEmpresa() == 0) {
            JOptionPane.showMessageDialog(rootPane, "O CNPJ '" + tfCNPJ.getText() + "' já está cadastrado!",
                    "Erro ao salvar", JOptionPane.ERROR_MESSAGE);
        } else if (Util.chkVazio(tfNome.getText(), tfCNPJ.getText())) {
            empresa.setNomeEmpresa(tfNome.getText().toUpperCase());
            empresa.setNomeFantasiaEmpresa(tfNomeFantasia.getText().toUpperCase());
            empresa.setEmailEmpresa(tfEmail.getText());
            empresa.setCnpjEmpresa(tfCNPJ.getText());
            empresa.setTelefoneEmpresa(tfTelefone.getText());
            empresa.setCidadeEnderecoEmpresa(tfCidade.getText().toUpperCase());
            empresa.setBairroEnderecoEmpresa(tfBairro.getText().toUpperCase());
            empresa.setRuaEmpresa(tfRua.getText().toUpperCase());
            try {
                empresa.setNumeroEnderecoEmpresa(Integer.parseInt(tfNumero.getText()));
            } catch (Exception e) {
            }

            empresaDAO.salvar(empresa);
            btLimparActionPerformed(null);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfCNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCNPJFocusLost
        
    }//GEN-LAST:event_tfCNPJFocusLost

    private void btFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFotoActionPerformed
        selecionarFoto();
    }//GEN-LAST:event_btFotoActionPerformed

    private void tfCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCidadeActionPerformed

    private void tfNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeFantasiaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroEmpresa dialog = new CadastroEmpresa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFoto;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLObrigatorioCpf;
    private javax.swing.JLabel jLObrigatorioNome;
    private javax.swing.JLabel jLObrigatorioNome1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlCadProfessores;
    private javax.swing.JFileChooser selecionarFoto;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCNPJ;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNomeFantasia;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRua;
    private javax.swing.JFormattedTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
