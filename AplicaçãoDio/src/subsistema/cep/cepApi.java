/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsistema.cep;

/**
 *
 * @author ianna
 */
public class cepApi {
    private static cepApi instancia = new cepApi();
    
    private cepApi(){
        super();
        
    }
    public static cepApi getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String cep){
    return "araraquara";    
    }
    public String recuperarEstado(String cep){
    return "arSP"; 
    }
}
