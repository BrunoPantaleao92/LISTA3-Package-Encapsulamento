package br.edu.up.modelos;
public class Venda {
    // propriedades

    public double totalVenda;

    //metodo

    public double prestacoes(){
        return totalVenda / 5;
    }

    public String toString(){
        return "Total R$:" + totalVenda + "\n" +
        "Valor da prestação em 5x é R$:" + prestacoes();
    }
}
