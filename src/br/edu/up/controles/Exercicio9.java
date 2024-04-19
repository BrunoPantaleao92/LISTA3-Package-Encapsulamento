package br.edu.up.controles;
import br.edu.up.modelos.Numeros9;
import br.edu.up.util.Prompt;

public class Exercicio9 {
    public static void executar(){
        /*Ler 80 números e ao final informar quantos número(s) estão no intervalo entre 10 (inclusive)
e 150 (inclusive). */
        Numeros9 numero = new Numeros9();

        for (int i = 0; i < 80; i++) {
            int num = Prompt.lerInteiro("Digite o " + (i + 1) + "º valor: ");
            if (num >= 10 && num <= 150) {
                numero.intervalo++;
            }
        }

        Prompt.linhaEmBranco();
        Prompt.separador();
        Prompt.linhaEmBranco();

        Prompt.imprimir(numero.toString());
    }
}
