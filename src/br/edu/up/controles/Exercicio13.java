package br.edu.up.controles;
import br.edu.up.modelos.Pessoa13;
import br.edu.up.util.Prompt;

public class Exercicio13 {
    public static void executar(){
        /*13. Escrever um programa que leia os dados de “N” pessoas
        (nome, sexo, idade e saúde) e informe se está apta ou não para cumprir o serviço militar obrigatório.
        Informe os totais. */

        Pessoa13 pessoa = new Pessoa13();

            Prompt.imprimir("Verificador de aptidão");
            
            Prompt.imprimir(pessoa.toString());

    }
}
