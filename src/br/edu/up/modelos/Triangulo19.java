package br.edu.up.modelos;
import br.edu.up.util.Prompt;


public class Triangulo19 {
    public double lado1;
    public double lado2;
    public double lado3;

    public void trianguloTipo(){
        double lado1 = Prompt.lerDecimal("Medida lado 1: ");
        double lado2 = Prompt.lerDecimal("Medida lado 2: ");
        double lado3 = Prompt.lerDecimal("Medida lado 3: ");

        if(lado1 < lado2 + lado2 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2){
            if(lado1 == lado2 && lado2 == lado3){
                Prompt.imprimir("Triangulo equilatero");
            }
            else if(lado1 == lado2 && lado1 != lado3){
                Prompt.imprimir("Triangulo isóscele");
            }
            else if((lado1 != lado2 && lado1 != lado3 && lado2 != lado3)){
                Prompt.imprimir("Triangulo escaleno");

            }
        }    
        else{
            Prompt.imprimir("Não pode ser um triangulo");
        }

    }
}
