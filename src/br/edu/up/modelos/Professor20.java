package br.edu.up.modelos;
import br.edu.up.util.Prompt;

public class Professor20 {

    public int nivel;
    public double salario;
    public int horasTrabalhadas;

    public String toString(){

        nivel = Prompt.lerInteiro("Qual o nivel do professor? ( 1, 2 ou 3): ");
        horasTrabalhadas = Prompt.lerInteiro("Horas trabalhadas: ");
        
            switch (nivel) {
                case 1:
                    salario = horasTrabalhadas * 12;
                    break;

                case 2:
                    salario = horasTrabalhadas * 17;
                    break;

                case 3:
                    salario = horasTrabalhadas * 25;
                    break;
            
                default:
                    break;
            }

        return  "Nivel do professor: " + nivel +
                "\nHoras trabalhadas: " + horasTrabalhadas +
                "\nSalário: " + salario;
    }
}
