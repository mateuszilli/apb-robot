package model.bean;

public class Locais {
    private int idLocal;
    private int ordemLocal;
    private int buscarLocal;
    private int seq;
    private int idLocalAtual;
    private String tipoLocal;
    private String descricaoLocal;
    private String hashLocal;
    private Linhas linhas;
    private Paletes paletes;
    private Reservas reservas;

    public Locais() {
    }

    public Locais(int idLocal, int ordemLocal, int buscarLocal, int seq, int localAtual, String tipoLocal, String descricaoLocal, String hashLocal, Linhas linhas) {
        this.idLocal = idLocal;
        this.ordemLocal = ordemLocal;
        this.buscarLocal = buscarLocal;
        this.seq = seq;
        this.idLocalAtual = idLocalAtual;
        this.tipoLocal = tipoLocal;
        this.descricaoLocal = descricaoLocal;
        this.hashLocal = hashLocal;
        this.linhas = linhas;
    }

    public int getIdLocalAtual() {
        return idLocalAtual;
    }

    public void setIdLocalAtual(int idLocalAtual) {
        this.idLocalAtual = idLocalAtual;
    }

    public Reservas getReservas() {
        return reservas;
    }

    public void setReservas(Reservas reservas) {
        this.reservas = reservas;
    }
    
    
    
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public Paletes getPaletes() {
        return paletes;
    }

    public void setPaletes(Paletes paletes) {
        this.paletes = paletes;
    }
    
    
    
    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public int getBuscarLocal() {
        return buscarLocal;
    }

    public void setBuscarLocal(int buscarLocal) {
        this.buscarLocal = buscarLocal;
    }

    

    public int getOrdemLocal() {
        return ordemLocal;
    }

    public void setOrdemLocal(int ordemLocal) {
        this.ordemLocal = ordemLocal;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    public String getDescricaoLocal() {
        return descricaoLocal;
    }

    public void setDescricaoLocal(String descricaoLocal) {
        this.descricaoLocal = descricaoLocal;
    }

    public String getHashLocal() {
        return hashLocal;
    }

    public void setHashLocal(String hashLocal) {
        this.hashLocal = hashLocal;
    }

    public Linhas getLinhas() {
        return linhas;
    }

    public void setLinhas(Linhas linhas) {
        this.linhas = linhas;
    }
    
}
