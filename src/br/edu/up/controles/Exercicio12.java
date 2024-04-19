package br.edu.up.controles;
import br.edu.up.modelos.Carrousado12;
import br.edu.up.util.Prompt;

public class Exercicio12 {
    public static void executar() {

        /*A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. 
        Até 2000 - 12%    e acima de 2000 - 7%.
        
        O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
        
        Informar total de carros com ano até 2000 e total geral. */

        Carrousado12 carro = new Carrousado12();
        String continuar;

        do{

            Prompt.imprimir("Calculadora de preços");
            
            carro.calculardesc();

            Prompt.linhaEmBranco();
            Prompt.separador();
            Prompt.linhaEmBranco();

            Prompt.imprimir("Valor do veículo: " + carro.preco + "\nValor do desconto: " + (carro.preco * carro.desconto) + "\nTotal com desconto: " + (carro.preco - carro.preco * carro.desconto));

            Prompt.linhaEmBranco();
            Prompt.separador();
            Prompt.linhaEmBranco();

            continuar = Prompt.lerLinha("Deseja continuar? (S/N)");

            
        }while(!continuar.equalsIgnoreCase("n"));

    }
}