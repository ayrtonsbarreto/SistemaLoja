/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IFuncionarioDAO;
import modelo.Funcionario;

/**
 *
 * @author Ayrton Barreto
 */
public class FuncionarioDaoImp extends GenericDaoImpl<Funcionario, Integer> implements IFuncionarioDAO{
    public FuncionarioDaoImp(){
        super(Funcionario.class);
    }
}
