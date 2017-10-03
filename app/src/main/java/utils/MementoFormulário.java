package utils;

/**
 * Created by Josue on 16/09/2017.
 */

public class MementoFormulário {
    private String solicitante;
    private String apartamento;
    private String bloco;
    private String setor;
    private String descricao;
    private int quantidade;

    public MementoFormulário(String solicitante, String apartamento, String bloco, String setor, String descricao){
        this.solicitante = solicitante;
        this.apartamento = apartamento;
        this.bloco = bloco;
        this.setor = setor;
        this.descricao = descricao;
    }

    public MementoFormulário(String solicitante){
        this.solicitante = solicitante;
        this.apartamento = "";
        this.bloco = "";
        this.setor = "";
        this.descricao = "";
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDescriçao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
