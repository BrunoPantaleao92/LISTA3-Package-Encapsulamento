package br.edu.up.modelos;
public class Pessoa10 {
    public int qtdPessoas;
    public Integer idade;

    public String checarIdade() {
        if (idade >= 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
}