/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import subsistema.cep.cepApi;
import subsistema.crm.crmService;

public class Facade {
    public void migrarCliente(String nome, String cep) {
       String cidade = cepApi.getInstancia().recuperarCidade(cep);
       String estado = cepApi.getInstancia().recuperarEstado(cep);
       
       crmService.gravarCliente(nome,cep,cidade,estado);
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
