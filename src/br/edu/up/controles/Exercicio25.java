package br.edu.up.controles;
import br.edu.up.modelos.Estudante25;
import br.edu.up.util.Prompt;

public class Exercicio25 {
    public static void executar(){
        /*Dado o nome de um estudante, com o respectivo número de matrícula e as três notas acima mencionadas, desenvolva um programa para calcular a nota final e a classificação de cada estudante. A classificação é dada conforme a lista abaixo:
        Nota Final Classificação
        [8,10] A
        [7,8] B
        [6,7] C
        [5,6] D
        [0,5] R
        Imprima o nome do estudante, com o seu número, nota final e classificação. */

        Estudante25 estudante = new Estudante25();

        Prompt.imprimir(estudante.toString());
    }
}
