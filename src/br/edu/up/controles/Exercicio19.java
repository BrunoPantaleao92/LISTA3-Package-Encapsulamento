package br.edu.up.controles;
import br.edu.up.modelos.Triangulo19;

public class Exercicio19 {
    public static void executar(){

        /*Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
        
        Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
        Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
        Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto, todo triângulo equilátero é também isóscele;
        Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes. */

        Triangulo19 triangulo = new Triangulo19();

        triangulo.trianguloTipo();

    }
}
