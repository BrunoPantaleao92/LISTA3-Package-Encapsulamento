package br.edu.up.controles;
import br.edu.up.modelos.CarroNovo;
import br.edu.up.util.Prompt;

public class Exercicio7 {
    public static void executar(){
        /*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos
        (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado).
        Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%.
        Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo. */

        CarroNovo carroNovo = new CarroNovo();

        carroNovo.custo_fabrica = Prompt.lerDecimal("Digite o custo de fábrica R$: ");
        carroNovo.percentagem_impostos = 0.45;
        carroNovo.percentagem_distribuidor = 0.28;

        Prompt.linhaEmBranco();
        Prompt.separador();
        Prompt.linhaEmBranco();
        
        Prompt.imprimir(carroNovo.toString());


    }

}
