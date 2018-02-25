/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdpoint.telas;

import birdpoint.funcionario.Funcionario;
import birdpoint.funcionario.FuncionarioDAO;
import birdpoint.funcionario.FuncionarioTableModel;
import birdpoint.horariosemanal.Horario;
import birdpoint.horariosemanal.HorarioDAO;
import birdpoint.horariosemanal.HorarioSemanal;
import birdpoint.horariosemanal.HorarioSemanalDAO;
import birdpoint.horariosemanal.HorarioSemanalTableModel;
import birdpoint.horariosemanal.HorarioTableModel;
import birdpoint.util.Util;
import com.google.gson.Gson;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano Lima
 */
public class CadastroHorario extends javax.swing.JDialog {

    Horario horario = new Horario();
    HorarioDAO horarioDAO = new HorarioDAO();

    HorarioSemanalDAO horarioSemanalDAO = new HorarioSemanalDAO();
    ArrayList<HorarioSemanal> listaHorarioSemanal = new ArrayList<>();

    Funcionario funcionario = new Funcionario();
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    Gson json = new Gson();

    SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");

    public CadastroHorario() {
        initComponents();
        btExcluir.setEnabled(false);
        getRootPane().setDefaultButton(btSalvar);
        atualizarTabelaHorarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcTurno = new javax.swing.JComboBox();
        jlNomeUsuario4 = new javax.swing.JLabel();
        tfHorarioSaida = new javax.swing.JFormattedTextField();
        jcDiaSemana = new javax.swing.JComboBox();
        jlNomeUsuario7 = new javax.swing.JLabel();
        jlNomeUsuario6 = new javax.swing.JLabel();
        jlNomeUsuario5 = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHorario = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tfHorarioEntrada = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();
        tfFuncionario = new javax.swing.JTextField();
        jlNomeUsuario3 = new javax.swing.JLabel();
        jLObrigatorioNome2 = new javax.swing.JLabel();
        jlNomeUsuario8 = new javax.swing.JLabel();
        btCurso18 = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btCurso114 = new javax.swing.JButton();
        btVoltar2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(602, 421));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jcTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Manhã", "Tarde", "Noite" }));
        jcTurno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        getContentPane().add(jcTurno);
        jcTurno.setBounds(420, 180, 160, 23);

        jlNomeUsuario4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario4.setText("Entrada.:");
        getContentPane().add(jlNomeUsuario4);
        jlNomeUsuario4.setBounds(420, 200, 70, 30);

        tfHorarioSaida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        try {
            tfHorarioSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfHorarioSaida.setToolTipText("");
        tfHorarioSaida.setMinimumSize(new java.awt.Dimension(2, 19));
        tfHorarioSaida.setName(""); // NOI18N
        tfHorarioSaida.setPreferredSize(new java.awt.Dimension(2, 19));
        getContentPane().add(tfHorarioSaida);
        tfHorarioSaida.setBounds(510, 230, 70, 20);

        jcDiaSemana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcDiaSemana.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo" }));
        jcDiaSemana.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        getContentPane().add(jcDiaSemana);
        jcDiaSemana.setBounds(420, 130, 160, 23);

        jlNomeUsuario7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario7.setText("Turno.:");
        getContentPane().add(jlNomeUsuario7);
        jlNomeUsuario7.setBounds(420, 150, 60, 30);

        jlNomeUsuario6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario6.setText("Saída.:");
        getContentPane().add(jlNomeUsuario6);
        jlNomeUsuario6.setBounds(510, 200, 60, 30);

        jlNomeUsuario5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario5.setText("Horários.:");
        getContentPane().add(jlNomeUsuario5);
        jlNomeUsuario5.setBounds(170, 100, 130, 30);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/pesquisar.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(240, 340, 100, 69);

        tbHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbHorario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 380, 200);

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(350, 340, 80, 70);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(150, 340, 80, 70);

        tfHorarioEntrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        try {
            tfHorarioEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfHorarioEntrada.setToolTipText("");
        tfHorarioEntrada.setMinimumSize(new java.awt.Dimension(2, 19));
        tfHorarioEntrada.setName(""); // NOI18N
        tfHorarioEntrada.setPreferredSize(new java.awt.Dimension(2, 19));
        getContentPane().add(tfHorarioEntrada);
        tfHorarioEntrada.setBounds(420, 230, 60, 20);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/Salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(480, 340, 80, 70);

        tfFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfFuncionario.setForeground(new java.awt.Color(51, 0, 51));
        tfFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        tfFuncionario.setEnabled(false);
        tfFuncionario.setMaximumSize(new java.awt.Dimension(8, 200));
        tfFuncionario.setMinimumSize(new java.awt.Dimension(8, 200));
        tfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(tfFuncionario);
        tfFuncionario.setBounds(140, 70, 390, 30);

        jlNomeUsuario3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario3.setText("Funcionário.:");
        getContentPane().add(jlNomeUsuario3);
        jlNomeUsuario3.setBounds(40, 70, 100, 30);

        jLObrigatorioNome2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome2.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome2.setText("*");
        getContentPane().add(jLObrigatorioNome2);
        jLObrigatorioNome2.setBounds(530, 70, 20, 10);

        jlNomeUsuario8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario8.setText("Dia da Semana.:");
        getContentPane().add(jlNomeUsuario8);
        jlNomeUsuario8.setBounds(420, 100, 130, 30);

        btCurso18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCurso18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/pesquisar20.png"))); // NOI18N
        btCurso18.setContentAreaFilled(false);
        btCurso18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCurso18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCurso18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCurso18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCurso18ActionPerformed(evt);
            }
        });
        getContentPane().add(btCurso18);
        btCurso18.setBounds(530, 70, 30, 30);

        btAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/Salvar.png"))); // NOI18N
        btAdd.setText("Adicionar");
        btAdd.setContentAreaFilled(false);
        btAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        getContentPane().add(btAdd);
        btAdd.setBounds(410, 260, 100, 70);

        btRemover.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/Salvar.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.setContentAreaFilled(false);
        btRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btRemover);
        btRemover.setBounds(490, 260, 100, 70);

        btCurso114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCurso114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/limpar20.png"))); // NOI18N
        btCurso114.setContentAreaFilled(false);
        btCurso114.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCurso114.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCurso114.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCurso114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCurso114ActionPerformed(evt);
            }
        });
        getContentPane().add(btCurso114);
        btCurso114.setBounds(560, 70, 20, 29);

        btVoltar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/voltar.png"))); // NOI18N
        btVoltar2.setText("Voltar");
        btVoltar2.setContentAreaFilled(false);
        btVoltar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar2);
        btVoltar2.setBounds(20, 340, 90, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/CadastroSetor.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(2, 0, 600, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void atualizarTabelaHorarios() {

        HorarioSemanalTableModel itm = new HorarioSemanalTableModel(listaHorarioSemanal);
        tbHorario.setModel(itm);
    }

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<Horario> lista;
        lista = horarioDAO.listar();
        HorarioTableModel itm = new HorarioTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Horário");
        if (objetoRetorno != null) {
            horario = horarioDAO.consultarObjetoId("idHorario", objetoRetorno);
            listaHorarioSemanal = (ArrayList) horarioSemanalDAO.converterJsonEmLista(horario.getListaHorario(), HorarioSemanal.class);
            tfFuncionario.setText(horario.getFuncionario().getNomeFuncionario());
            funcionario = horario.getFuncionario();
            atualizarTabelaHorarios();
            btExcluir.setEnabled(true);
        }

    }//GEN-LAST:event_btPesquisarActionPerformed


    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (horario.getIdHorario() != 0) {
            horarioDAO.remover(horario);
        }
        btLimparActionPerformed(null);

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Util.limparCamposGenerico(this);
        btExcluir.setEnabled(false);
        horario = new Horario();
        funcionario = new Funcionario();
        listaHorarioSemanal = new ArrayList<>();
        atualizarTabelaHorarios();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (funcionario.getIdFuncionario() != 0) {
            horario.setListaHorario(json.toJson(listaHorarioSemanal));
            if (horario.getIdHorario() == 0) {
                horarioDAO.adicionar(horario);
                JOptionPane.showMessageDialog(this, "Horário cadastrado com sucesso!");
            } else {
                horarioDAO.atualizar(horario);
                JOptionPane.showMessageDialog(this, "Horário atualizado com sucesso!");
            }
            btLimparActionPerformed(null);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione o funcionário!");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFuncionarioActionPerformed

    private void btCurso18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCurso18ActionPerformed
        btLimparActionPerformed(null);
        List<Funcionario> lista;
        lista = (funcionarioDAO.listar());
        FuncionarioTableModel itm = new FuncionarioTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Funcionário");
        if (objetoRetorno != null) {
            funcionario = funcionarioDAO.consultarObjetoId("idFuncionario", objetoRetorno);
            if (horarioDAO.checkExistseq("funcionario.idFuncionario", funcionario.getIdFuncionario()).isEmpty()) {
                horario.setFuncionario(funcionario);
                tfFuncionario.setText(funcionario.getNomeFuncionario());
            } else {
                JOptionPane.showMessageDialog(this, "O funcionário.: " + funcionario.getNomeFuncionario()
                        + " Já possui horário cadastrado! \n\n"
                        + "Caso pretenda alterar o horário, pesquise pelo funcionário e realize as modificações.");
            }
        }
    }//GEN-LAST:event_btCurso18ActionPerformed

    private void btCurso114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCurso114ActionPerformed
        tfFuncionario.setText("");
        funcionario = new Funcionario();
    }//GEN-LAST:event_btCurso114ActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if (!(jcDiaSemana.getSelectedItem() == "-----"
                || jcTurno.getSelectedItem() == "-----"
                || tfHorarioEntrada.getText().length() != 5
                || tfHorarioSaida.getText().length() != 5)) {
            HorarioSemanal horarioSemanal = new HorarioSemanal();
            try {
                Date horarioEntrada = formatador.parse(tfHorarioEntrada.getText());
                Date horarioSaida = formatador.parse(tfHorarioSaida.getText());
                horarioSemanal.setTurno(String.valueOf(jcTurno.getSelectedItem()));
                horarioSemanal.setNomeDiaSemana(String.valueOf(jcDiaSemana.getSelectedItem()));
                horarioSemanal.setHoraEntrada(new Time(horarioEntrada.getTime()));
                horarioSemanal.setHoraSaida(new Time(horarioSaida.getTime()));
                listaHorarioSemanal.add(0, horarioSemanal);
                atualizarTabelaHorarios();
                tfHorarioEntrada.setText("");
                tfHorarioSaida.setText("");
                jcDiaSemana.setSelectedItem("-----");
                jcTurno.setSelectedItem("-----");
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Hora Inválida!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "É obrigatório informar: Dia da Semana, Turno, Horários de Entrada e Saída.");
        }

    }//GEN-LAST:event_btAddActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int row = tbHorario.getSelectedRow();
        if (row > -1) {
            listaHorarioSemanal.remove(row);
            atualizarTabelaHorarios();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione o Horário!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltar2ActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltar2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                CadastroHorario dialog = new CadastroHorario();
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
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCurso114;
    private javax.swing.JButton btCurso18;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton btVoltar1;
    private javax.swing.JButton btVoltar2;
    private javax.swing.JLabel jLObrigatorioNome2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcDiaSemana;
    private javax.swing.JComboBox jcTurno;
    private javax.swing.JLabel jlNomeUsuario3;
    private javax.swing.JLabel jlNomeUsuario4;
    private javax.swing.JLabel jlNomeUsuario5;
    private javax.swing.JLabel jlNomeUsuario6;
    private javax.swing.JLabel jlNomeUsuario7;
    private javax.swing.JLabel jlNomeUsuario8;
    private javax.swing.JTable tbHorario;
    private javax.swing.JTextField tfFuncionario;
    private javax.swing.JFormattedTextField tfHorarioEntrada;
    private javax.swing.JFormattedTextField tfHorarioSaida;
    // End of variables declaration//GEN-END:variables
}
