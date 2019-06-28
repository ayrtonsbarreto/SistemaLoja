/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.FornecedorDaoImp;
import dao.FuncionarioDaoImp;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Fornecedor;
import modelo.Funcionario;
import org.hibernate.Session;
import util.HibernateUtil;
import util.JSFUtil;

/**
 *
 * @author Ayrton Barreto
 */
@ManagedBean(name = "MBFuncionarios")
@ViewScoped
public class FuncionariosBean {
    private Funcionario funcionario;
    
    private ArrayList<Funcionario> itens;
    private ArrayList<Funcionario> itensFiltrados;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<Funcionario> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Funcionario> itens) {
        this.itens = itens;
    }

    public ArrayList<Funcionario> getItensFiltrados() {
        return itensFiltrados;
    }

    public void setItensFiltrados(ArrayList<Funcionario> itensFiltrados) {
        this.itensFiltrados = itensFiltrados;
    }
    
    
    public void novo() {
        funcionario = new Funcionario();
    }

    public void salvar() {

        try {
            FuncionarioDaoImp fdao = new FuncionarioDaoImp();
            Session sessao = null;
            sessao = HibernateUtil.getSessionFactory().openSession();
            fdao.save(funcionario);
            sessao.close();
            funcionario = new Funcionario(); // limpar o campo
            JSFUtil.adicionarMensagemSucesso("Funcionario salvo com sucesso");
        } catch (RuntimeException e) {
            JSFUtil.adicionarMensagemErro("ex.getMessage()");
        }
    }
    
    public void excluir() {
        try {
            FuncionarioDaoImp fdao = new FuncionarioDaoImp();
            fdao.delete(funcionario);
            JSFUtil.adicionarMensagemSucesso("Funcionario excluido com sucesso");
        } catch (RuntimeException e) {
            JSFUtil.adicionarMensagemErro("Não é possivel excluir um Funcionario que tenha um produto associado");
        }
    }

    public FuncionariosBean() {
        funcionario = new Funcionario();
    }
    
    
}
