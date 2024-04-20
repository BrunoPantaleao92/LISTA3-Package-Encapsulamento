package br.edu.up.modelos;

import br.edu.up.util.Prompt;

public class Cotacao {
    // propriedades
    private double qtdeDolares;
    private double valorCotacaoDolar;

    // metodos

    public double conversaoReais() {
        return qtdeDolares * valorCotacaoDolar;
    }

    public double getQtdeDolares() {
        return qtdeDolares;
    }

    public void setQtdeDolares(double qtdeDolares) {
        this.qtdeDolares = qtdeDolares;
    }

    public double getValorCotacaoDolar() {
        return valorCotacaoDolar;
    }

    public void setValorCotacaoDolar(double valorCotacaoDolar) {
        this.valorCotacaoDolar = valorCotacaoDolar;
    }

    public String toString() {
        return "Dólares: " + qtdeDolares + "\n" +
                "Cotação do dólar R$: " + valorCotacaoDolar + "\n" +
                "Conversão em reais: " + conversaoReais();
    }
}
