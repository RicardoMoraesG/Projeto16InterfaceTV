/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.principal;

/**
 *
 * @author aluno
 */
public class TVPhilips extends TV implements IControleRemoto {
    public final String MODELO = "PHILIPS";
    
    public TVPhilips(int tamanho){
        super(tamanho);
    }

    @Override
    public void mudarCanal(int canal) {
        
    }

    @Override
    public void aumentarVolume(int volume) {
        
    }

    @Override
    public void diminuirVolume(int volume) {
        
    }

    @Override
    public boolean ligar() {
        super.setLigada(true);
        return true;
    }

    @Override
    public boolean desligar() {
        super.setLigada(false);
        return false;
    }
}
