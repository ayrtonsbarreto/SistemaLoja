/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IAutenticacaoDAO;
import modelo.Autenticacao;

/**
 *
 * @author Ayrton Barreto
 */
public class AutenticacaoDaoImp extends GenericDaoImpl<Autenticacao, Integer> implements IAutenticacaoDAO{
    
    public AutenticacaoDaoImp(){
        super(Autenticacao.class);
    }
}
