package br.edu.up.modelos;
public class Venda06 {
    public double precoCusto;
    public double percentualAcrescimo;

    public double valorVenda(){
        return precoCusto + (precoCusto * percentualAcrescimo);
    }
    public String toString(){
        return "O preço de custo é R$:" + precoCusto + "\n" +
        "O valor de venda é R$:" + valorVenda();
    }
    
}
