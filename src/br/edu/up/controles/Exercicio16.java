package br.edu.up.controles;
import br.edu.up.modelos.Reajuste16;

public class Exercicio16 {
public static void executar() {
    /* Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo com os seguintes critérios:
a) 50% para aqueles que ganham menos do que três salários mínimos;
b) 20% para aqueles que ganham entre três até dez salários mínimos;
c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d) 10% para os demais funcionários. */

    Reajuste16 reajuste = new Reajuste16();

    reajuste.reajusteSalario();
    
    }
}
