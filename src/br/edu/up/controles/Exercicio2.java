package br.edu.up.controles;

import br.edu.up.modelos.Automovel;
import br.edu.up.util.Prompt;

public class Exercicio2 {
    public static void executar() {
        /*
         * Escrever um programa para determinar o consumo médio de um automóvel sendo
         * fornecida a distância total percorrida pelo automóvel e o total de
         * combustível gasto.
         */

        Automovel objAutomovel = new Automovel();

        objAutomovel.setCombustivel(Prompt.lerDecimal("Combustivel gasto: "));
        objAutomovel.setDistancia(Prompt.lerDecimal("Distancia percorrida: "));

        Prompt.imprimir(objAutomovel.toString());

    }
}
