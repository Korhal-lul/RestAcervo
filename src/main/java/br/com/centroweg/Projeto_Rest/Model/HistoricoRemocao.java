package br.com.centroweg.Projeto_Rest.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;
@Entity
public class HistoricoRemocao {

    @Id
    @GeneratedValue
    @Column()
    private int idHistoricoRemocao;
    @Column(nullable = false)
    private String nomeFerramenta;
    @Column(nullable = false)
    private int qtdFerramenta;
    @Column(nullable = false)
    private String tipoFerramenta;
    @Column(nullable = false)
    private String usuario;
    @Column(nullable = false)
    private Date horaData;

    public int getIdHistoricoRemocao() {
        return idHistoricoRemocao;
    }

    public void setIdHistoricoRemocao(int idHistoricoRemocao) {
        this.idHistoricoRemocao = idHistoricoRemocao;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
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
}
