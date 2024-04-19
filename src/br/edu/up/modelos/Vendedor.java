package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Vendedor {

    // propriedades
    private String nome;
    private double salarioFixo;
    private double totalVendas;

    //metodos

    

    public double comissao(){
        return totalVendas * 0.15;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = Prompt.lerLinha("Nome do vendedor: ");
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo() {
        this.salarioFixo = Prompt.lerDecimal("Salário fixo: ");
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas() {
        this.totalVendas = Prompt.lerDecimal("Total de vendas mensal: ");
    }

    public String toString(){
        return "Nome: " + nome + "\n" +
                "Salário fixo: " + salarioFixo + "\n" +
                "Salário total: " + (comissao() + salarioFixo);
    }
}

