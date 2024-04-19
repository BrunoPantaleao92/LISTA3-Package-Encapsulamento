package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Produto14 {
    public double precoCusto;
    public double precoVenda;

        
    double mediaPrecoCusto = 0;
    double mediaPrecoVenda = 0;

    public void calcularLucro(){


        for(int i = 0; i < 40; i++){
            precoCusto = Prompt.lerDecimal("Preço de custo: ");
            precoVenda = Prompt.lerDecimal("Preço de venda: ");

            if(precoCusto == precoVenda){
                Prompt.separador();
                Prompt.linhaEmBranco();
                Prompt.imprimir("Produto " + (i+1) + " Empate");
                Prompt.linhaEmBranco();
                Prompt.separador();
            }

            else if(precoCusto < precoVenda){
                Prompt.separador();
                Prompt.linhaEmBranco();
                Prompt.imprimir("Produto " + (i+1) + " Lucro");
                Prompt.linhaEmBranco();
                Prompt.separador();
            }

            else{
                Prompt.separador();
                Prompt.linhaEmBranco();
                Prompt.imprimir("Produto " + (i+1) + " Prejuizo");
                Prompt.linhaEmBranco();
                Prompt.separador();
            }

            mediaPrecoCusto = mediaPrecoCusto + precoCusto;
            mediaPrecoVenda = mediaPrecoVenda + precoVenda;

        }
    }
    
    public String toString(){

        return "Média preço de custo: " + (mediaPrecoCusto / 40) + "\nMédia preço de venda: " + (mediaPrecoVenda / 40);
    }


}
