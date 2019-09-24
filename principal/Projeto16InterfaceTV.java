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
public class Projeto16InterfaceTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TVSharp objTVSharp = new TVSharp(14);
        //objTVSharp.ligar(); 
        /*Não foi estabelecido um contrato da classe TVSharp com a interface*/
        
        
        TVPhilips objTVPhilips = new TVPhilips(32);
        objTVPhilips.ligar();
        System.out.print("TVPhilips - Modelo " + objTVPhilips.MODELO + " está " );
        System.out.println(objTVPhilips.isLigada() ? "ligada" : "desligada");
        
        TVTCL objTVTCL = new TVTCL(60);
        System.out.println("Ligando TV Modelo " + objTVTCL.MODELO);
        objTVTCL.ligar();
        System.out.print("TV TCL - Modelo " + objTVTCL.MODELO + " está " );
        System.out.println(objTVTCL.isLigada() ? "ligada" : "desligada");
        
        System.out.println("Desligando TV Modelo " + objTVTCL.MODELO);
        objTVTCL.desligar();
        System.out.println(objTVTCL.isLigada() ? "ligada" : "desligada");
        objTVTCL.setCanal(5);
        System.out.println(objTVTCL.getCanal());
        
        
    }
    
}
