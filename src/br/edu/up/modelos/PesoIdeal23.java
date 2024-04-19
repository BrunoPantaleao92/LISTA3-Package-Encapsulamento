package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class PesoIdeal23 {
    public String nome;
    public String sexo;
    public int idade;
    public double altura;
    public double pesoIdeal;


    public String toString(){

        nome = Prompt.lerLinha("Nome: ");
        idade= Prompt.lerInteiro("Idade: ");
        sexo = Prompt.lerLinha("Sexo M/F: ");
            if(sexo.equalsIgnoreCase("m")){
                
                altura = Prompt.lerDecimal("Altura: ");
                    if (altura > 1.70){
                        if (idade <= 20){
                            pesoIdeal = (72.7 * altura) - 58;
                        }
                        else if (idade > 20 && idade < 40){
                            pesoIdeal = (72.7 * altura) - 53;
                        }
                        else if (idade >= 40){
                            pesoIdeal = (72.7 * altura) - 45;
                        }
                    }

                    if (altura <= 1.70){
                        if (idade <= 40){
                            pesoIdeal = (72.7 * altura) - 50;
                        }
                        else if (idade > 40){
                            pesoIdeal = (72.7 * altura) - 58;
                        }
                    }
                }



            if(sexo.equalsIgnoreCase("f")){
                altura = Prompt.lerDecimal("Altura: ");
                if (altura > 1.50){
                        pesoIdeal = (62.1 * altura) - 44.7;
                    }
                }

                if (altura <= 1.50){
                    if (idade >= 35){
                        pesoIdeal = (62.1 * altura) - 45;
                    }
                    else if (idade < 35){
                        pesoIdeal = (62.1 * altura) - 49;
                    }
                }

                return "Nome: " + nome + 
                "\nPeso ideal: " + pesoIdeal; 

    }
}
