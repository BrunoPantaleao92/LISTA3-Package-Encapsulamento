package br.edu.up.modelos;
public class CarroNovo {
    public double custo_fabrica;
    public double percentagem_impostos;
    public double percentagem_distribuidor;


    public double custoConsumidor(){
        double impostos = custo_fabrica + custo_fabrica * percentagem_impostos;
        double custofinal = impostos + impostos * percentagem_distribuidor;
        return custofinal;         
    }
    public String toString(){

        return "Custo da fabrica R$: " + custo_fabrica + "\n" + 
        "Custo dos impostos R$: " + (custo_fabrica + custo_fabrica * percentagem_impostos) + "\n" + 
        "Custo final do carro R$: " + custoConsumidor();
    }


}
