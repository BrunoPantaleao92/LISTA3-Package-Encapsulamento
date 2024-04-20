package br.edu.up.modelos;

public class Venda06 {
    private double precoCusto;
    private double percentualAcrescimo;

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPercentualAcrescimo() {
        return percentualAcrescimo;
    }

    public void setPercentualAcrescimo(double percentualAcrescimo) {
        this.percentualAcrescimo = percentualAcrescimo;
    }

    public double valorVenda() {
        return precoCusto + (precoCusto * percentualAcrescimo);
    }

    public String toString() {
        return "O preço de custo é R$:" + precoCusto + "\n" +
                "O valor de venda é R$:" + valorVenda();
    }

}
