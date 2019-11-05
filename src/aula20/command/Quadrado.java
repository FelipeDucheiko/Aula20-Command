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
public class Quadrado implements Command{
private Desenho desenho;
    
    public Quadrado(Desenho desenho){
        this.desenho = desenho;
    }

    @Override
    public void execute() {
        this.desenho.adicionarQuadrado();
    }

    @Override
    public void undo() {
        this.desenho.undoUltimoComando();
    }
    
}
