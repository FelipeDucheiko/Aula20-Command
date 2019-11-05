/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20.command;

/**
 *
 * @author felip
 */
public class Cliente {
    
    public static void main(String[] args) {
        Desenho desenho = new Desenho();
        
        Command circulo = new Circulo(desenho);
        Command triangulo = new Triangulo(desenho);
        Command quadrado = new Quadrado(desenho);
        
        Controle controle = new Controle(circulo, triangulo, quadrado);
        
        controle.Circulo();
        controle.Quadrado();
        controle.Quadrado();
        
        controle.desfazer();
        
        controle.Triangulo();
        
        controle.desfazer();
    }
    
}
