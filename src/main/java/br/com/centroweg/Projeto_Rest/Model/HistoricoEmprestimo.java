package br.com.centroweg.Projeto_Rest.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;
@Entity
public class HistoricoEmprestimo {

    @Id
    @GeneratedValue
    @Column
    private int idHistoricoEmprestimo;
    @Column(nullable = false)
    private String nomeFerramenta;
    @Column(nullable = false)
    private String usuario;
    @Column(nullable = false)
    private Date hora;
    @Column(nullable = false)
    private int qtdFerramenta;
    @Column(nullable = false)
    private String tipoFerramenta;
    @Column(nullable = false)
    private String acoes;

    public int getIdHistoricoEmprestimo() {
        return idHistoricoEmprestimo;
    }

    public void setIdHistoricoEmprestimo(int idHistoricoEmprestimo) {
        this.idHistoricoEmprestimo = idHistoricoEmprestimo;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public int getQtdFerramenta() {
        return qtdFerramenta;
    }

    public void setQtdFerramenta(int qtdFerramenta) {
        this.qtdFerramenta = qtdFerramenta;
    }

    public String getTipoFerramenta() {
        return tipoFerramenta;
    }

    public void setTipoFerramenta(String tipoFerramenta) {
        this.tipoFerramenta = tipoFerramenta;
    }

    public String getAcoes() {
        return acoes;
    }

    public void setAcoes(String acoes) {
        this.acoes = acoes;
    }
}
