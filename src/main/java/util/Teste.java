/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Ayrton Barreto
 */
public class Teste {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();
        System.out.println("Conectou!");
        HibernateUtil.getSessionFactory().close();
    }
}
