/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.AutenticacaoDaoImp;
import dao.FornecedorDaoImp;
import dao.FuncionarioDaoImp;
import dao.GerenteDaoImp;
import modelo.Autenticacao;
import modelo.Fornecedor;
import modelo.Funcionario;
import modelo.Gerente;

/**
 *
 * @author Ayrton Barreto
 */
public class teste2 {
    public static void main(String[] args) {
         /*Funcionario f = new Funcionario();
         Autenticacao a = new Autenticacao();
         
         f.setCpf("016-456-774-90");
         f.setFuncao("Estoquista");
         f.setNome("Joao");
         f.setSenha("12345678");
         FuncionarioDaoImp fDAO = new FuncionarioDaoImp();
         AutenticacaoDaoImp aDAO = new AutenticacaoDaoImp();
         a.setFuncionario(f);
         a.setLogin("ayrtonsbarreto");
         a.setSenha("123456789");
         aDAO.save(a); */
         
         /*Funcionario f = new Funcionario();
         f.setCpf("12345678");
         f.setFuncao("Estoquista");
         f.setNome("Ayrton");
         f.setSenha("123");
         AutenticacaoDaoImp aDAO = new AutenticacaoDaoImp();
         Autenticacao a = aDAO.findById(1);
         f.setAutenticacao(a);
         FuncionarioDaoImp fDAO = new FuncionarioDaoImp();
         fDAO.save(f); */
         
         /*
         Gerente g = new Gerente();
         //Autenticacao a = new Autenticacao();
         
         g.setCpf("2332332323");
         g.setFuncao("Motorista");
         g.setNome("hudson");
         g.setSenha("2122112");
         AutenticacaoDaoImp aDAO = new AutenticacaoDaoImp();
         Autenticacao a = new Autenticacao();
         a.setLogin("hudson");
         a.setSenha("123456");
         g.setAutenticacao(a);
         GerenteDaoImp fDAO = new GerenteDaoImp();
         fDAO.save(g); */
            
            Fornecedor f = new Fornecedor();
            f.setDescricao("teste");
            FornecedorDaoImp fdao = new FornecedorDaoImp();
            fdao.save(f);
            // = new Fornecedor();
    }
}
