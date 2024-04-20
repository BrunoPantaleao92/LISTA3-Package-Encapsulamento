package br.edu.up.controles;

import br.edu.up.modelos.Venda;
import br.edu.up.util.Prompt;

public class Exercicio5 {
    public static void executar() {
        /*
         * A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações
         * sem juros.
         * Faça um programa que receba um valor de uma compra e mostre o valor das
         * prestações.
         */

        Venda venda1 = new Venda();

        venda1.setTotalVenda(Prompt.lerDecimal("Digite o valor total da venda: "));

        Prompt.imprimir(venda1.toString());

    }

}
