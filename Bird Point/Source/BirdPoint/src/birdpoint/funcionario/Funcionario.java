/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdpoint.funcionario;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 *
 * @author Adriano Lima
 */
@Entity
public class Funcionario {

    @Id
    @GeneratedValue
    private int idFuncionario;

    @Column(length = 100, nullable = false)
    private String nomeFuncionario;

    @Column(length = 100)
    private String ruaFuncionario;

    @Column(length = 100, nullable = false)
    private String cpfFuncionario;

    @Column(length = 100)
    private String RGFuncionario;

    @Column(length = 100)
    private String bairroFuncionario;

    @Column(length = 100)
    private String telefoneFuncionario;

    @Column(length = 100)
    private String emailFuncionario;

    @Column
    private boolean receberEmail;

    @Column(nullable = false)
    private boolean situacaoFuncionario;

    @Column(length = 100)
    private int numeroCasa;

    @Column(length = 100)
    private String cidadeFuncionario;

    @Column
    @Lob
    private byte[] digitalDireita;

    @Column
    @Lob
    private byte[] digitalEsquerda;

    @Column
    @Lob
    private byte[] fotoFunc;

    /**
     * @return the idFuncionario
     */
    public int getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    /**
     * @return the nomeFuncionario
     */
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * @param nomeFuncionario the nomeFuncionario to set
     */
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    /**
     * @return the ruaFuncionario
     */
    public String getRuaFuncionario() {
        return ruaFuncionario;
    }

    /**
     * @param ruaFuncionario the ruaFuncionario to set
     */
    public void setRuaFuncionario(String ruaFuncionario) {
        this.ruaFuncionario = ruaFuncionario;
    }

    /**
     * @return the cpfFuncionario
     */
    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    /**
     * @param cpfFuncionario the cpfFuncionario to set
     */
    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    /**
     * @return the RGFuncionario
     */
    public String getRGFuncionario() {
        return RGFuncionario;
    }

    /**
     * @param RGFuncionario the RGFuncionario to set
     */
    public void setRGFuncionario(String RGFuncionario) {
        this.RGFuncionario = RGFuncionario;
    }

    /**
     * @return the bairroFuncionario
     */
    public String getBairroFuncionario() {
        return bairroFuncionario;
    }

    /**
     * @param bairroFuncionario the bairroFuncionario to set
     */
    public void setBairroFuncionario(String bairroFuncionario) {
        this.bairroFuncionario = bairroFuncionario;
    }

    /**
     * @return the telefoneFuncionario
     */
    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    /**
     * @param telefoneFuncionario the telefoneFuncionario to set
     */
    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    /**
     * @return the emailFuncionario
     */
    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    /**
     * @param emailFuncionario the emailFuncionario to set
     */
    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    /**
     * @return the receberEmail
     */
    public boolean isReceberEmail() {
        return receberEmail;
    }

    /**
     * @param receberEmail the receberEmail to set
     */
    public void setReceberEmail(boolean receberEmail) {
        this.receberEmail = receberEmail;
    }

    /**
     * @return the situacaoFuncionario
     */
    public boolean isSituacaoFuncionario() {
        return situacaoFuncionario;
    }

    /**
     * @param situacaoFuncionario the situacaoFuncionario to set
     */
    public void setSituacaoFuncionario(boolean situacaoFuncionario) {
        this.situacaoFuncionario = situacaoFuncionario;
    }

    /**
     * @return the numeroCasa
     */
    public int getNumeroCasa() {
        return numeroCasa;
    }

    /**
     * @param numeroCasa the numeroCasa to set
     */
    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    /**
     * @return the cidadeFuncionario
     */
    public String getCidadeFuncionario() {
        return cidadeFuncionario;
    }

    /**
     * @param cidadeFuncionario the cidadeFuncionario to set
     */
    public void setCidadeFuncionario(String cidadeFuncionario) {
        this.cidadeFuncionario = cidadeFuncionario;
    }

    /**
     * @return the digitalDireita
     */
    public byte[] getDigitalDireita() {
        return digitalDireita;
    }

    /**
     * @param digitalDireita the digitalDireita to set
     */
    public void setDigitalDireita(byte[] digitalDireita) {
        this.digitalDireita = digitalDireita;
    }

    /**
     * @return the digitalEsquerda
     */
    public byte[] getDigitalEsquerda() {
        return digitalEsquerda;
    }

    /**
     * @param digitalEsquerda the digitalEsquerda to set
     */
    public void setDigitalEsquerda(byte[] digitalEsquerda) {
        this.digitalEsquerda = digitalEsquerda;
    }

    /**
     * @return the fotoFunc
     */
    public byte[] getFotoFunc() {
        return fotoFunc;
    }

    /**
     * @param fotoFunc the fotoFunc to set
     */
    public void setFotoFunc(byte[] fotoFunc) {
        this.fotoFunc = fotoFunc;
    }

  

}
