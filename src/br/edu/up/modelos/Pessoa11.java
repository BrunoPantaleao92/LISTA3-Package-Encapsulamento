package br.edu.up.modelos;
import br.edu.up.util.Prompt;


public class Pessoa11 {

    //propriedades

    public String nome;
    public String sexo;


    //metodos

    public String contarSexo(){

    int quanthomem = 0;
    int quantmulher = 0;

    for (int i = 0; i < 56; i++) {

        String nome = Prompt.lerLinha("Informe o nome: ");
        String sexo = Prompt.lerLinha(nome +" é homem ou mulher? (H/M)");


        switch (sexo) {
            case "M":
            Prompt.imprimir("\n" + nome + "\nMulher");
            quantmulher++;
                break;

            case "m":
            Prompt.imprimir("\n" + nome + "\nMulher");
            quantmulher++;
                break;

            case "H":
            Prompt.imprimir("\n" + nome + "\nHomem");
            quanthomem++;
                break;

            case "h":
            Prompt.imprimir("\n" + nome + "\nHomem");
            quanthomem++;
                break;
                
        
            default:
                Prompt.imprimir("Sexo inválido");
                break;
        }
    }

    return "\n\nTotal de homens: " + quanthomem + "\nTotal de mulheres: " + quantmulher;

    }
}