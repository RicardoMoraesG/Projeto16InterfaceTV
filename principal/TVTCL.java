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
public class TVTCL extends TV implements IControleRemoto {
    public final String MODELO = "TCL";
    
    public TVTCL(int tamanho){
        super(tamanho);
    }
        @Override
    public boolean ligar() {
        System.out.println("Welcome...");
        super.setLigada(true);
        return true;    }

    @Override
    public boolean desligar() {
        System.out.println("Bye bye...");
        super.setLigada(false);
        return false;
    }
    
    @Override
    public void mudarCanal(int canal) {
       /*if  (!this.ligada){
           System.out.println("DESLIGADA!");
       } *///TV desligada não muda canal...
    }

    @Override
    public void aumentarVolume(int volume) {
       
    }

    @Override
    public void diminuirVolume(int volume) {
        
    }


     
}
