package br.edu.up.controles;
import br.edu.up.modelos.Abono18;
import br.edu.up.util.Prompt;

public class Exercicio18 {
    public static void executar(){

        /*18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostre o nome e o salário líquido acrescido do abono conforme o sexo e a idade: */
        Abono18 abono = new Abono18();

        Prompt.imprimir(abono.toString());
    }
}
