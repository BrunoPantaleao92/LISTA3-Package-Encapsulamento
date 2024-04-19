package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class ContaLuz22 {
    
    public String classificacao;
    public int tipoCliente;
    public double totalConta;
    public int horasUsadas;

    public String toString(){

        tipoCliente = Prompt.lerInteiro("Qual o tipo do cliente? ( 1-Residência, 2-Comércio ou 3-Indústria): ");
        horasUsadas = Prompt.lerInteiro("Horas usadas: ");
        
            switch (tipoCliente) {
                case 1:
                    totalConta = horasUsadas * 0.60;
                    classificacao = "Residência";
                    break;

                case 2:
                    totalConta = horasUsadas * 0.48;
                    classificacao = "Comércio";

                    break;

                case 3:
                    totalConta = horasUsadas * 1.29;
                    classificacao = "Indústria";
                    break;
            
                default:

                    break;
            }

        return  "Tipo do comércio: " + classificacao +
                "\nHoras usadas: " + horasUsadas +
                "\nTotal a pagar: " + totalConta;
    }
}
