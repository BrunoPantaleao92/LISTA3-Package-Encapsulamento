package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Carango15 {

        public double preco;
        public double desconto;
        public String combustivel;

        double totalDesconto = 0;
        double totalPago = 0;
    
        public String calculardesc(){
    
        do{  

        preco = Prompt.lerDecimal("Digite o preço do veículo: ");
            if (preco == 0){
                break;
            }

        combustivel = Prompt.lerLinha("Qual é o combustivel? (A-Alcool / D-Diesel / G-Gasolina ): ");
            
            if  (combustivel.equalsIgnoreCase("a")){
                desconto = 0.25;
            }
            else if  (combustivel.equalsIgnoreCase("d")){
                desconto = 0.14;
            }
            else if  (combustivel.equalsIgnoreCase("g")){
                desconto = 0.21;
            }

            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("Preço do veículo: " + preco + "\nDesconto do veículo: " + (preco * desconto) + "\nTotal com desconto: " + (preco - (preco * desconto)));
            Prompt.linhaEmBranco();
            Prompt.separador();

            totalDesconto = totalDesconto + (preco * desconto);
            totalPago = totalPago + (preco - (preco * desconto));

        }while(preco != 0);

        return "Total a ser pago pelos clientes: " + totalPago + "\nDesconto total : " + totalDesconto;

    }
}
