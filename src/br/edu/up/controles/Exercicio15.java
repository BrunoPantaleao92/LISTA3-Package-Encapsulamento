package br.edu.up.controles;
import br.edu.up.modelos.Carango15;
import br.edu.up.util.Prompt;
public class Exercicio15 {
    public static void executar(){
        /*A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto.
        Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente.
        
        O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%).
        
        Com valor do veículo zero encerra entrada de dados.
        
        Informe total de desconto e total pago pelos clientes. */

        Carango15 carro = new Carango15();

        Prompt.imprimir(carro.calculardesc());
    }

}
