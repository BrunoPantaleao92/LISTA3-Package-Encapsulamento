package br.edu.up.controles;
import br.edu.up.modelos.Pessoa10;
import br.edu.up.util.Prompt;

public class Exercicio10 {
    public static void executar() {

        /*
         * Faça um programa que receba a idade de um número finito de pessoas e mostre
         * mensagem informando “maior de idade” e “menor de idade” para cada pessoa.
         * Considerar a pessoa com 18 anos como maior de idade.
         */

        int num = Prompt.lerInteiro("Digite a quantidade de pessoas a serem checadas: ");

        for (int i = 0; i < num; i++) {
            Pessoa10 pessoa = new Pessoa10();

            pessoa.idade = Prompt.lerInteiro("Digite a idade da " + (i + 1) + "ª pessoa: ");

            Prompt.imprimir(pessoa.checarIdade());
        }

    }
}
