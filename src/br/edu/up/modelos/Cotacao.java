package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Cotacao {
    //propriedades
    private double qtdeDolares;
    private double valorCotacaoDolar;

    //metodos

    public double conversaoReais(){
    return qtdeDolares * valorCotacaoDolar;
    }

    public double getQtdeDolares() {
        return qtdeDolares;
    }

    public void setQtdeDolares() {
        this.qtdeDolares = Prompt.lerDecimal("Digite a quantidade de dólares: ");
    }

    public double getValorCotacaoDolar() {
        return valorCotacaoDolar;
    }

    public void setValorCotacaoDolar() {
        this.valorCotacaoDolar = Prompt.lerDecimal("Digite o valor da cotação em reais: ");
    }

    public String toString(){
        return "Dólares: " + qtdeDolares + "\n" +
                "Cotação do dólar R$: " + valorCotacaoDolar  + "\n" +
                "Conversão em reais: " + conversaoReais();
    }
}
