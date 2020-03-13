package br.com.centroweg.Projeto_Rest.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ferramenta {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int idFerramenta;
    @Column(nullable = false)
    private String nomeFerramenta;
    @Column(nullable = false)
    private String tipoFerramenta;
    @Column(nullable = false)
    private long qtdFerramenta;
    @Column(nullable = false)
    private long totalFerramenta;

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
}
