package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Reajuste17 {
    public String nome;
    public double salario;
    public double salarioMinimo = 1412;
    public double porcentagemAjuste;
    public double novoSalario;


    public String toString(){
        nome = Prompt.lerLinha("Digite o nome: ");
        salario = Prompt.lerDecimal("Digite o salário atual: ");
        porcentagemAjuste = Prompt.lerDecimal("Digite a porcentagem do reajuste salarial: ");

        novoSalario = salario + (salario * (porcentagemAjuste / 100));

        return "Nome: " + nome + 
                "\nPorcentagem de reajuste: " + porcentagemAjuste +
                "\nSalario atual: " + salario + 
                "\nSalario reajustado: " + novoSalario;

    }

}
