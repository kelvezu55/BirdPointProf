/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdpoint.funcionario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Adriano Lima
 */
public class FuncionarioTableModelDigital extends AbstractTableModel {

    private List<Funcionario> professores = new ArrayList<>();
    private String[] colunas = {"Código", "Nome", "Digital Direita", "Digital Esquerda"};

    public FuncionarioTableModelDigital(List<Funcionario> professor) {
        this.professores = professor;
    }

    @Override
    public int getRowCount() {
        return professores.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario professor = professores.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return professor.getIdFuncionario();
            case 1:
                return professor.getNomeFuncionario();
            case 2:
                if (professor.getDigitalDireita() != null) {
                    return "Sim";
                } else {
                    return "Não";
                }
            case 3:
                if (professor.getDigitalEsquerda()!= null) {
                    return "Sim";
                } else {
                    return "Não";
                }
        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];

        }
        return null;
    }

}
