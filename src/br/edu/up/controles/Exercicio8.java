package br.edu.up.controles;
import br.edu.up.modelos.Aluno8;
import br.edu.up.util.Prompt;

public class Exercicio8 {
    public static void executar(){
        /* Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre.
        Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), 
        Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9).*/

        Aluno8 aluno = new Aluno8();

        aluno.nome = Prompt.lerLinha("Digite o nome do aluno: ");
        aluno.nota1 = Prompt.lerDecimal("Digite a 1ª nota: ");
        aluno.nota2 = Prompt.lerDecimal("Digite a 2ª nota: ");
        aluno.nota3 = Prompt.lerDecimal("Digite a 3ª nota: ");

        Prompt.linhaEmBranco();
        Prompt.separador();
        Prompt.linhaEmBranco();

        Prompt.imprimir(aluno.toString());

    }
}
