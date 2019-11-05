/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20.command;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class Desenho {
    ArrayList<String> desenho = new ArrayList<String>();
        
    public void adicionarCirculo(){
        this.desenho.add("Circulo");
        System.out.println("Circulo Adicionado");
    }
    
    public void adicionarTriangulo(){
        this.desenho.add("Triangulo");
        System.out.println("Triangulo Adicionado");
    }
    
    public void adicionarQuadrado(){
        this.desenho.add("Quadrado");
        System.out.println("Quadrado Adicionado");
    }
    
    public void undoUltimoComando(){
        System.out.println("Desfazendo incluir " + desenho.get(desenho.size()-1));
        desenho.remove(desenho.size()-1);
    }  
}
