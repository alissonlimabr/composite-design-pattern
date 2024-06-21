package org.alissonlimadev;

public class TrechoAereoSimples implements TrechoAereo {
    private String origem;
    private String destino;
    private int custo;
    private int distancia;

    public TrechoAereoSimples (String origem, String destino, int custo, int distancia) {
        super();
        this.origem = origem;
        this.destino = destino;
        this.custo = custo;
        this.distancia = distancia;
    }

    @Override
    public String getOrigem() {
        return origem;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public int getCusto() {
        return custo;
    }

    @Override
    public int getDistancia() {
        return distancia;
    }
}
