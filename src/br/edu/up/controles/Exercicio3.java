package br.edu.up.controles;
import br.edu.up.modelos.Vendedor;
import br.edu.up.util.Prompt;

public class Exercicio3 {
    public static void executar(){
        /* Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
        Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.*/


        Vendedor objVendedor = new Vendedor();

        objVendedor.setNome();
        objVendedor.setSalarioFixo();
        objVendedor.setTotalVendas();

        Prompt.imprimir(objVendedor.toString());
    }
}
