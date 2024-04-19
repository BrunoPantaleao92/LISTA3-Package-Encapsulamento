package br.edu.up.controles;
import br.edu.up.modelos.Seguro26;
import br.edu.up.util.Prompt;

public class Exercicio26 {
    public static void executar(){

        /* Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado.
        
        Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices de seguro.
        
        Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto.
        
        A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome, idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria.
        
        Caso a idade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadra em nenhuma das categorias ofertadas.*/

        Seguro26 seguro = new Seguro26();

        Prompt.imprimir(seguro.toString());

    }
}
