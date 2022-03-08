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
public class Singleton3 {
    
    private static class Holder{
    public static Singleton3 instancia= new Singleton3();
    }
    
    private Singleton3(){
        super();
    }
    public static Singleton3 getInstancia(){
        return Holder.instancia;
    }
    }
    


