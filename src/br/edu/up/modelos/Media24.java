package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Media24 {

    public double nota1;
    public double nota2;
    public double nota3;
    public double mediaFinal;

    public String toString(){
        nota1 = Prompt.lerDecimal("Digite a nota do trabalho: ");
        nota2 = Prompt.lerDecimal("Digite a nota da avaliação: ");
        nota3 = Prompt.lerDecimal("Digite a nota do exame final: ");
    
        mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);

        return "Média final: " + mediaFinal; 

    }
}
