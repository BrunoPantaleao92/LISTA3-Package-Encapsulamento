package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Abono18 {
    public String nome;
    public double salario;
    public int idade;
    public int abono;
    public String sexo;




    public String toString(){
        nome = Prompt.lerLinha("Nome: ");
        sexo = Prompt.lerLinha("Sexo (M/F): ");
        idade = Prompt.lerInteiro("Idade: ");
        salario = Prompt.lerDecimal("Salario liquido: ");
        

            if(sexo.equalsIgnoreCase("m")){
                if (idade >= 30){
                    abono = 100;
                }
                else{
                    abono = 50;
                }
            }
            

            if(sexo.equalsIgnoreCase("f")){
                if (idade >= 30){
                    abono = 200;
                }
                else{
                    abono = 80;
                }
                
            }
           

        return
        "Nome: " + nome + 
        "\nSalario liquido: " + salario + 
        "\nSalario com abono: " + (salario + abono);
       

    }
}
