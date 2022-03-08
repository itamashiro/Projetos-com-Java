/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author ianna
 */
public class Singleton2 {
    private static Singleton2 instancia= new Singleton2();
    private Singleton2(){
        super();
    }
    public static Singleton2 getInstancia(){
        return instancia;
    }
}
