package br.edu.up.controles;

import br.edu.up.modelos.Aluno;
import br.edu.up.util.Prompt;

public class Exercicio1 {
    public static void executar() {
        /*
         * Escrever um programa que leia o nome de um aluno e as notas das três provas
         * que ele obteve no semestre.
         * No final informar o nome do aluno e a sua média (aritmética).
         */

        Aluno objAluno = new Aluno();

        objAluno.setNome(Prompt.lerLinha("Nome do aluno: "));

        objAluno.setNota1(Prompt.lerDecimal("Nota 1: "));
        objAluno.setNota2(Prompt.lerDecimal("Nota 2: "));
        objAluno.setNota3(Prompt.lerDecimal("Nota 3: "));

        Prompt.imprimir(objAluno.getNome());
        Prompt.imprimir(objAluno.calcularMedia());
    }
}
