package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Carrousado12 {

    public int ano;
    public double preco;
    public double desconto;

    public void calculardesc(){

       
    preco = Prompt.lerDecimal("Digite o preço do veículo: ");

    ano = Prompt.lerInteiro("Digite o ano do veículo: ");

        if  (ano < 2000){
            desconto = 0.12;
        }
        else{
            desconto = 0.07;
        }
        

    }
}
