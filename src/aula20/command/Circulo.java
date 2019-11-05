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
public class Circulo implements Command{
    private Desenho desenho;
    
    public Circulo(Desenho desenho){
        this.desenho = desenho;
    }

    @Override
    public void execute() {
        this.desenho.adicionarCirculo();
    }

    @Override
    public void undo() {
        this.desenho.undoUltimoComando();
    }
    
}
