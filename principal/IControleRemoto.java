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
public interface IControleRemoto {
    // - INTERFACE possui apenas a assinatura (declaração) dos métodos
    // a implementação dos métodos estará nas classes que assinarem o contrato
    //com a interface
    // - OBRIGATORIAMENTE todos os métodos declarados na INTERFACE deverão ser
    //implementados nas classes que assinaram os métodos.
    
    public void mudarCanal(int canal);
    public void aumentarVolume(int volume);
    public void diminuirVolume(int volume);
    public boolean ligar();
    public boolean desligar();
    
    
    
}
