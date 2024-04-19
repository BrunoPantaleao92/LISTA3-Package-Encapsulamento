package br.edu.up.controles;
import br.edu.up.modelos.PesoIdeal23;
import br.edu.up.util.Prompt;

public class Exercicio23 {
    public static void executar(){

        /*Faça um programa que leia
        o nome, o sexo, a altura e a idade de uma pessoa.
        
        Calcule e mostre nome e o seu peso ideal de acordo com as seguintes características da pessoa: 
        
        */

        PesoIdeal23 peso = new PesoIdeal23();
        Prompt.imprimir(peso.toString());
    }
}
