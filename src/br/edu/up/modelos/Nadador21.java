package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Nadador21{
    public int idade;

    public void classificacao(){

        idade = Prompt.lerInteiro("Qual a idade do nadador?: ");
        
        if(idade > 4 && idade < 8){
            Prompt.imprimir("Infantil A");
        }
        else if(idade > 7 && idade < 11){
            Prompt.imprimir("Infantil B");
        }
        else if(idade > 10 && idade < 14){
            Prompt.imprimir("Juvenil A");
        }
        else if(idade > 13 && idade < 18){
            Prompt.imprimir("Juvenil B");
        }
        else if(idade > 17 && idade < 26){
            Prompt.imprimir("Senior");
        }
        else{
            Prompt.imprimir("Idade fora da faixa etária");
        }

    }
}

