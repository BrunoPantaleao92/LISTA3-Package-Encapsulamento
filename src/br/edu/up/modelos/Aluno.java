package br.edu.up.modelos;

import br.edu.up.util.Prompt;

public class Aluno {

    //propriedades

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    //metodos - comportamentos

    public String calcularMedia(){
        return "Média: " + (getNota1() + getNota2() + getNota3()) / 3;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        nome = Prompt.lerLinha("Nome do aluno: ");
        this.nome = nome;

    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1() {
        nota1 = Prompt.lerDecimal("Nota 1: ");

    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2() {
        nota2 = Prompt.lerDecimal("Nota 2: ");

    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3() {
        nota3 = Prompt.lerDecimal("Nota 3: ");

    }
    public String toString(){
        return "\nNome: " + nome + "\n"; 
    }

}


