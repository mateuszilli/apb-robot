package model.bean;

public class Linhas {

    private int idLinha;
    private int ordemLinha;
    private int buscarLinha;
    private String sentidoLinha;
    private String descricaoLinha;

    public Linhas() {
    }

    public Linhas(int ordemLinha, String sentidoLinha, String descricaoLinha, int buscarLinha) {
        this.ordemLinha = ordemLinha;
        this.sentidoLinha = sentidoLinha;
        this.descricaoLinha = descricaoLinha;
        this.buscarLinha = buscarLinha;
    }

    public Linhas(String descricaoLinha) {
        this.descricaoLinha = descricaoLinha;
    }

    public Linhas(int idLinha, int ordemLinha, String sentidoLinha, String descricaoLinha) {
        this.idLinha = idLinha;
        this.ordemLinha = ordemLinha;
        this.sentidoLinha = sentidoLinha;
        this.descricaoLinha = descricaoLinha;
    }

    public int getBuscarLinha() {
        return buscarLinha;
    }

    public void setBuscarLinha(int buscarLinha) {
        this.buscarLinha = buscarLinha;
    }

    public int getIdLinha() {
        return idLinha;
    }

    public void setIdLinha(int idLinha) {
        this.idLinha = idLinha;
    }

    public int getOrdemLinha() {
        return ordemLinha;
    }

    public void setOrdemLinha(int ordemLinha) {
        this.ordemLinha = ordemLinha;
    }

    public String getSentidoLinha() {
        return sentidoLinha;
    }

    public void setSentidoLinha(String sentidoLinha) {
        this.sentidoLinha = sentidoLinha;
    }

    public String getDescricaoLinha() {
        return descricaoLinha;
    }

    public void setDescricaoLinha(String descricaoLinha) {
        this.descricaoLinha = descricaoLinha;
    }

}
