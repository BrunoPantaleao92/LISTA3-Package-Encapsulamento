package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Reajuste16 {
    public double salario;
    public double novoSalario;

    double salarioMinimo = 1412;


    public void reajusteSalario(){

        for(int i = 0; i < 584; i++){
            salario = Prompt.lerDecimal("Salario atual: ");

            if (salario < 3 * salarioMinimo) {
                novoSalario = salario * 1.5;
                Prompt.separador();
                Prompt.linhaEmBranco();
                Prompt.imprimir("Salário atual: " + (salario));
                Prompt.imprimir("Novo salário: " + (novoSalario));
                Prompt.linhaEmBranco();
                Prompt.separador();
            
            } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
                novoSalario = salario * 1.2;
                Prompt.separador();
                Prompt.linhaEmBranco();
                Prompt.imprimir("Salário atual: " + (salario));
                Prompt.imprimir("Novo salário: " + (novoSalario));
                Prompt.linhaEmBranco();
                Prompt.separador();
            
            } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
                novoSalario = salario * 1.15;
                Prompt.separador();
                Prompt.linhaEmBranco();
                Prompt.imprimir("Salário atual: " + (salario));
                Prompt.imprimir("Novo salário: " + (novoSalario));
                Prompt.linhaEmBranco();
                Prompt.separador();
            
            } else {
                novoSalario = salario * 1.1;
                Prompt.separador();
                Prompt.linhaEmBranco();
                Prompt.imprimir("Salário atual: " + (salario));
                Prompt.imprimir("Novo salário: " + (novoSalario));
                Prompt.linhaEmBranco();
                Prompt.separador();
            
            }
            
        }
    }
}

