package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Pessoa13 {
    String nome;
    String sexo;
    String saude;
    int idade;
    
    int qtdHomens = 0;
    int qtdMulheres = 0;
    int qtdApto = 0;
    int qtdInapto = 0;
    int menorIdade = 0;
    int maiorIdade = 0;

    String continuar;

    public String toString(){

        do{
        nome = Prompt.lerLinha("Nome: ");

        idade= Prompt.lerInteiro("Idade: ");
        if (idade >= 18){
            maiorIdade++;

            sexo = Prompt.lerLinha("Sexo M/F: ");
            if(sexo.equalsIgnoreCase("m")){
                qtdHomens++;
            }
            if(sexo.equalsIgnoreCase("f")){
                qtdMulheres++;
            }

            saude = Prompt.lerLinha("Apto (S/N)?");
            if(saude.equalsIgnoreCase("s")){

                Prompt.separador();
                Prompt.linhaEmBranco();
                Prompt.imprimir(nome + "\nApto");
                Prompt.linhaEmBranco();
                Prompt.separador();
                qtdApto++;
            }
            if(saude.equalsIgnoreCase("n")){

                Prompt.separador();
                Prompt.linhaEmBranco();
                Prompt.imprimir(nome + "\nInapto");
                Prompt.linhaEmBranco();
                Prompt.separador();
                qtdInapto++;
            }
        }
        
        else{
            menorIdade++;
            qtdInapto++;
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir(nome + "\nMenor de idade - inapto");
            Prompt.linhaEmBranco();
            Prompt.separador();
        }

        continuar = Prompt.lerLinha("Deseja continuar? (S/N)");

            
    }while(!continuar.equalsIgnoreCase("n"));

        return "Total homens: " + qtdHomens + 
        "\nTotal mulheres: " + qtdMulheres + 
         "\nTotal aptos: " + qtdApto + 
         "\nTotal inaptos: " + qtdInapto + 
         "\nTotal maiores de idade: " + maiorIdade + 
         "\nTotal menores de idade: " + menorIdade;
         
         
    }

}
