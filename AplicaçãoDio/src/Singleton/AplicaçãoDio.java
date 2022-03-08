
package Singleton;

import Facade.Facade;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

/**
 *
 * @author ianna
 */
public class AplicaçãoDio {

    //Singleton
    public static void main(String[] args) {
        Singleton lazy = Singleton.getInstancia();
        System.out.println("lazy");
        lazy = Singleton.getInstancia();
        System.out.println(lazy);

Singleton2 eager = Singleton2.getInstancia();
        System.out.println("eager");
        eager = Singleton2.getInstancia();
        System.out.println(eager);
        
        Singleton3 lazyholder = Singleton3.getInstancia();
        System.out.println("lazyholder");
        lazyholder = Singleton3.getInstancia();
        System.out.println(lazyholder);
    
    //Strategy
    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();
    
    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    robo.setComportamento(agressivo);
    robo.mover();
    robo.mover();
    
    //Facade
    
    Facade facade = new Facade();
    facade.migrarCliente("Douglas","18086132");
    }
    
}
