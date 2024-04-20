package br.edu.up.modelos;

public class Venda {
    // propriedades

    private double totalVenda;

    // metodo

    public double prestacoes() {
        return totalVenda / 5;
    }

    public String toString() {
        return "Total R$:" + totalVenda + "\n" +
                "Valor da prestação em 5x é R$:" + prestacoes();
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }
}
