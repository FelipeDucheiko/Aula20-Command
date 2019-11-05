/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20.command;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author felip
 */
public class Controle {
    private Map<String, Command> comandos;
    private Command ultimoCommando;
    
    public Controle(Command Circulo, Command Triangulo, Command Quadrado){
        
        this.comandos = new HashMap<String, Command>();
        
        this.comandos.put("Circulo", Circulo);
        this.comandos.put("Triangulo", Triangulo);
        this.comandos.put("Quadrado", Quadrado);
    }
    
    public void Circulo(){
        comandos.get("Circulo").execute();
        ultimoCommando = comandos.get("Circulo");
    }
    
    public void Triangulo(){
        comandos.get("Triangulo").execute();
        ultimoCommando = comandos.get("Triangulo");
    }
    
    public void Quadrado(){
        comandos.get("Quadrado").execute();
        ultimoCommando = comandos.get("Quadrado");
    }
    
    public void desfazer(){
        ultimoCommando.undo();
    }
    
}
