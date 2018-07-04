package model.bean;

import java.util.Date;

public class Paletes {
    private int idPalete;
    private int buscarPalete;
    private String descricaoPalete;
    private String validadePalete;

    public Paletes() {
    }

    public Paletes(int idPalete, String descricaoPalete, String validadePalete, int buscarPalete) {
        this.idPalete = idPalete;
        this.descricaoPalete = descricaoPalete;
        this.validadePalete = validadePalete;
        this.buscarPalete = buscarPalete;
    }

    public int getBuscarPalete() {
        return buscarPalete;
    }

    public void setBuscarPalete(int buscarPalete) {
        this.buscarPalete = buscarPalete;
    }
    
    public int getIdPalete() {
        return idPalete;
    }

    public void setIdPalete(int idPalete) {
        this.idPalete = idPalete;
    }

    public String getDescricaoPalete() {
        return descricaoPalete;
    }

    public void setDescricaoPalete(String descricaoPalete) {
        this.descricaoPalete = descricaoPalete;
    }

    public String getValidadePalete() {
        return validadePalete;
    }

    public void setValidadePalete(String validadePalete) {
        this.validadePalete = validadePalete;
    }
    
    
}
