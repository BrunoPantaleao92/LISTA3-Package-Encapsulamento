package br.edu.up.controles;
import br.edu.up.modelos.Cotacao;
import br.edu.up.util.Prompt;

public class Exercicio4 {
    public static void executar(){
        /* Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.*/

        Cotacao objCotacao = new Cotacao();
        objCotacao.setQtdeDolares();
        objCotacao.setValorCotacaoDolar();
        
        Prompt.linhaEmBranco();
        Prompt.separador();
        Prompt.linhaEmBranco();


        Prompt.imprimir(objCotacao.toString());
    }

}
