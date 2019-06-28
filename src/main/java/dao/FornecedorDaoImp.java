/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IFornecedorDAO;
import modelo.Fornecedor;

/**
 *
 * @author Ayrton Barreto
 */
public class FornecedorDaoImp extends GenericDaoImpl<Fornecedor, Integer> implements IFornecedorDAO{
    public FornecedorDaoImp(){
        super(Fornecedor.class);
    }
}
