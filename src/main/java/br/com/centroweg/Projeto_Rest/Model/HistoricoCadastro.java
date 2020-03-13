package br.com.centroweg.Projeto_Rest.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

@Entity
public class HistoricoCadastro {

    @Id
    @GeneratedValue
    @Column
    private int idHistoricoCadastro;
    @Column(nullable = false)
    private String nomeFerramenta;
    @Column(nullable = false)
    private String tipoFerramenta;
    @Column(nullable = false)
    private long qtdFerramenta;
    @Column(nullable = false)
    private long totalFerramenta;
    @Column(nullable = false)
    private String usuario;
    @Column(nullable = false)
    private Date horaData;

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public String getTipoFerramenta() {
        return tipoFerramenta;
    }

    public void setTipoFerramenta(String tipoFerramenta) {
        this.tipoFerramenta = tipoFerramenta;
    }

    public long getQtdFerramenta() {
        return qtdFerramenta;
    }

    public void setQtdFerramenta(long qtdFerramenta) {
        this.qtdFerramenta = qtdFerramenta;
    }

    public long getTotalFerramenta() {
        return totalFerramenta;
    }

    public void setTotalFerramenta(long totalFerramenta) {
        this.totalFerramenta = totalFerramenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getHoraData() {
        return horaData;
    }

    public void setHoraData(Date horaData) {
        this.horaData = horaData;
    }
;}
