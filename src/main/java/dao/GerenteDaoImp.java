/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IGerenteDAO;
import modelo.Gerente;

/**
 *
 * @author Ayrton Barreto
 */
public class GerenteDaoImp extends GenericDaoImpl<Gerente, Integer> implements IGerenteDAO{
    public GerenteDaoImp(){
        super(Gerente.class);
    }
}
