package br.edu.up.modelos;
public class Aluno8 {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double mediaAritimetica(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public String toString(){
        if (mediaAritimetica() >= 7){
            return "Nome: " + nome + "\n" +
            "Média: " + mediaAritimetica() + "\n" +
            "Aprovado";
        }

        else if (mediaAritimetica() >= 5.1){
            return "Nome: " + nome + "\n" +
            "Média: " + mediaAritimetica() + "\n" +
            "Recuperação";
        }
        else{
            return "Nome: " + nome + "\n" +
            "Média: " + mediaAritimetica() + "\n" +
            "Reprovado";
        }

    }
}