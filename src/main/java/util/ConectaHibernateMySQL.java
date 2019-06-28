/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.hibernate.Session;

/**
 *
 * @author Ayrton Barreto
 */
public class ConectaHibernateMySQL {
    public static void main(String[] args) {
        Session sessao = null;
        sessao = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Conectou!");
        sessao.close();
    }
}
