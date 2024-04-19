package br.edu.up.controles;
import br.edu.up.modelos.Reajuste17;
import br.edu.up.util.Prompt;

public class Exercicio17 {
    public static void executar(){
        /* Leia o nome do funcionário,
        seu salário e o valor do salário mínimo.

        Calcule o seu novo salário reajustado.
        Escrever o nome do funcionário,
        o reajuste e seu novo salário.
        Calcule quanto à empresa vai aumentar sua folha de pagamento.*/

        Reajuste17 reajuste = new Reajuste17();

        Prompt.imprimir(reajuste.toString());
    }
    
}
