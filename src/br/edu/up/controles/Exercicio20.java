package br.edu.up.controles;
import br.edu.up.modelos.Professor20;
import br.edu.up.util.Prompt;

public class Exercicio20 {
    public static void executar(){
        /*A escola “APRENDER” faz o pagamento de seus professores por hora/aula.
        Faça um programa que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:

        Professor Nível 1 R$12,00 por hora/aula
        Professor Nível 2 R$17,00 por hora/aula
        Professor Nível 3 R$25,00 por hora/aula */

        Professor20 professor = new Professor20();

        Prompt.imprimir(professor.toString());



    }
}
