/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.HolaMundoEjbRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author curro
 */
public class TestHolaMundoEJP {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJP desde el cliente");
        try {
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMundoEJB = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoEJB.sumar(5, 3);
            System.out.println("Resultado EJB suma:" + resultado);
        } catch(NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
