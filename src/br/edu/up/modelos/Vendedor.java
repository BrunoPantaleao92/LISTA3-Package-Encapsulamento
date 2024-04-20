package br.edu.up.modelos;

import br.edu.up.util.Prompt;

public class Vendedor {

    // propriedades
    private String nome;
    private double salarioFixo;
    private double totalVendas;

    // metodos

    public double comissao() {
        return totalVendas * 0.15;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
                "Salário fixo: " + salarioFixo + "\n" +
                "Salário total: " + (comissao() + salarioFixo);
    }
}
