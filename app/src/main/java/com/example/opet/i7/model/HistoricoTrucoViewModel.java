package com.example.opet.i7.model;

/**
 * Created by opet on 05/10/2018.
 */

public class HistoricoTrucoViewModel {

    private int partidas;
    private int vitorias;
    private String percentVitorias;

    public HistoricoTrucoViewModel() {
    }

    public HistoricoTrucoViewModel(int partidas, int vitorias, String percentVitorias) {
        this.partidas = partidas;
        this.vitorias = vitorias;
        this.percentVitorias = percentVitorias;
    }

    public int getPartidas() {
        return partidas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getPercentVitorias() {
        return percentVitorias;
    }

    public void setPercentVitorias(String percentVitorias) {
        this.percentVitorias = percentVitorias;
    }
}
