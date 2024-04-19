package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Seguro26 {
    public String nome;
    public int idade;
    public int categoriaRisco;
    public int risco;

    public String toString(){
        nome = Prompt.lerLinha("Nome: ");
        idade = Prompt.lerInteiro("Idade: ");
        
        if (idade > 16 && idade < 21){
            categoriaRisco = Prompt.lerInteiro("Digite a categoria de risco: (1, 2 ou 3): ");

            return 
            "Nome: " + nome +
            "\nIdade: " + idade +
            "\nGrupo de risco:" + categoriaRisco;

        }
        else if (idade > 20 && idade < 25){
            categoriaRisco = Prompt.lerInteiro("Digite a categoria de risco: (2, 3 ou 4): ");

            return 
            "Nome: " + nome +
            "\nIdade: " + idade +
            "\nGrupo de risco:" + categoriaRisco;
        }

        else if (idade > 24 && idade < 35){
            categoriaRisco = Prompt.lerInteiro("Digite a categoria de risco: (3, 4 ou 5): ");

            return 
            "Nome: " + nome +
            "\nIdade: " + idade +
            "\nGrupo de risco:" + categoriaRisco;
            
        }

        else if (idade > 34 && idade < 65){
            categoriaRisco = Prompt.lerInteiro("Digite a categoria de risco: (4, 5 ou 6): ");

            return 
            "Nome: " + nome +
            "\nIdade: " + idade +
            "\nGrupo de risco:" + categoriaRisco;
        }

        else if (idade > 64 && idade < 71){
            categoriaRisco = Prompt.lerInteiro("Digite a categoria de risco: (7, 8 ou 9): ");

            return 
            "Nome: " + nome +
            "\nIdade: " + idade +
            "\nGrupo de risco:" + categoriaRisco;
            
        }
    
        else{
            return 
            "Nome: " + nome +
            "\nIdade: " + idade +
            "\nGrupo de risco: Não se enquadra em nenhuma das categorias ofertadas";
            
        }

    }
}
