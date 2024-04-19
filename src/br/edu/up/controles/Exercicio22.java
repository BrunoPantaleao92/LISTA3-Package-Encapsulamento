package br.edu.up.controles;
import br.edu.up.modelos.ContaLuz22;
import br.edu.up.util.Prompt;

public class Exercicio22 {
    public static void executar(){
        /*Faça um programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo:

        Tipo de Cliente Valor do KW/h
        1 (Residência) 0,60
        2 (Comércio) 0,48
        3 (Indústria) 1,29 */

        ContaLuz22 conta = new ContaLuz22();

        Prompt.imprimir(conta.toString());


    }

}

