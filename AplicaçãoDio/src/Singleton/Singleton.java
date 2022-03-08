/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

public class Singleton {
    private static Singleton instancia;
    private Singleton(){
        super();
    }
    public static Singleton getInstancia(){
        if (instancia ==null){
            instancia = new Singleton();
        }
        return instancia;
    }
}

