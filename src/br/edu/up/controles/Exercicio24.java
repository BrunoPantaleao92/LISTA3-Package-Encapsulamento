package br.edu.up.controles;
import br.edu.up.modelos.Media24;
import br.edu.up.util.Prompt;

public class Exercicio24 {
    public static void executar(){
        /*Em um curso de Ciência da Computação a nota do estudante é calculada a partir de três notas atribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. As notas variam, de 0 a 10 e a nota final é a média ponderada das três notas mencionadas. A lista abaixo fornece os pesos:

        a. Laboratório: peso 2
        b. Avaliação semestral: peso 3
        c. Exame final: peso 5 */

        Media24 media = new Media24();

        Prompt.imprimir(media.toString());

    }
}
