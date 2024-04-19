package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Estudante25 {
    public String nome;
    public String matricula;
    public String calssificacao;

    Media24 media = new Media24();

    public String toString(){

        nome = Prompt.lerLinha("Nome: ");
        matricula = Prompt.lerLinha("Matricula: ");
        media.toString();

        if (media.mediaFinal > 7){
            calssificacao = "A";
        }
        else if (media.mediaFinal > 6 && media.mediaFinal < 9){
            calssificacao = "B";
        }
        else if (media.mediaFinal > 5 && media.mediaFinal < 8){
            calssificacao = "C";
        }
        else if (media.mediaFinal > 4 && media.mediaFinal < 7){
            calssificacao = "D";
        }
        else if (media.mediaFinal >= 0 && media.mediaFinal < 6){
            calssificacao = "R";
        }

        return  "Nome: " + nome + 
                "\nMatricula: " + matricula +
                "\nMédia Final: " + media.mediaFinal +
                "\nClassificação: " + calssificacao;

    }

}
