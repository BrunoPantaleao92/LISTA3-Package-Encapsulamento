package br.edu.up.modelos;

import br.edu.up.util.Prompt;

public class Automovel {

    //propriedades

    private double distancia;
    private double combustivel;

    //metodos

    
    public double consumoMedio(){
        return distancia/combustivel;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia() {
        this.distancia = Prompt.lerDecimal("Distancia percorrida: ");
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel() {
        this.combustivel = Prompt.lerDecimal("Combustivel gasto: ");
    }

    public String toString(){
        return "Consumo médio do carro: " + distancia/combustivel + "Km/l";
    }
}
