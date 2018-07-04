
package model.bean;

public class Reservas {
    private int idReserva;
    private int buscarReserva;
    private int idLocalAtual;
    private Locais locais;
    private Paletes paletes;

    public Reservas() {
    }

    public Reservas(int idReserva, int idLocalAtual, Locais locais, Paletes paletes, int buscarReserva) {
        this.idReserva = idReserva;
        this.idLocalAtual = idLocalAtual;
        this.locais = locais;
        this.paletes = paletes;
    }

    public int getBuscarReserva() {
        return buscarReserva;
    }

    public void setBuscarReserva(int buscarReserva) {
        this.buscarReserva = buscarReserva;
    }

    public int getIdLocalAtual() {
        return idLocalAtual;
    }

    public void setIdLocalAtual(int idLocalAtual) {
        this.idLocalAtual = idLocalAtual;
    }
    
    
    
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Locais getLocais() {
        return locais;
    }

    public void setLocais(Locais locais) {
        this.locais = locais;
    }

    public Paletes getPaletes() {
        return paletes;
    }

    public void setPaletes(Paletes paletes) {
        this.paletes = paletes;
    }
    
    
}
