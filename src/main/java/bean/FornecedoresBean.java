/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.FornecedorDaoImp;
import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Fornecedor;
import org.hibernate.Session;
import util.HibernateUtil;
import util.JSFUtil;

/**
 *
 * @author Ayrton Barreto
 */
@ManagedBean(name = "MBFornecedores")
@ViewScoped
public class FornecedoresBean implements Serializable{

    private Fornecedor fornecedores;
    private ArrayList<Fornecedor> itens;
    private ArrayList<Fornecedor> itensFiltrados;

    public void novo() {
        fornecedores = new Fornecedor();
    }

    public void salvar() {

        try {
            FornecedorDaoImp fdao = new FornecedorDaoImp();
            Session sessao = null;
            sessao = HibernateUtil.getSessionFactory().openSession();
            fdao.save(fornecedores);
            sessao.close();
            fornecedores = new Fornecedor(); // limpar o campo
            JSFUtil.adicionarMensagemSucesso("Fornecedor salvo com sucesso");

        } catch (RuntimeException e) {
            JSFUtil.adicionarMensagemErro("ex.getMessage()");
        }

    }

    public void excluir() {
        try {
            FornecedorDaoImp fdao = new FornecedorDaoImp();
            fdao.delete(fornecedores);
            JSFUtil.adicionarMensagemSucesso("Fornecedor excluido com sucesso");
        } catch (RuntimeException e) {
            JSFUtil.adicionarMensagemErro("Não é possivel excluir um fornecedor que tenha um produto associado");
        }
    }
    
    @PostConstruct //Executa o método ao iniciar a tela
    public void prepararPesquisa() {

        try {
            FornecedorDaoImp fdao = new FornecedorDaoImp();
            itens = (ArrayList<Fornecedor>) fdao.listAll();
        }catch(RuntimeException e){
            JSFUtil.adicionarMensagemErro("ex.getMessage()");
        }
    }
    
    public void carregarCadastro(){
        try {
            String valor = JSFUtil.getParam("forcod");
            if(valor != null){
                Integer codigo = Integer.parseInt(valor);
                FornecedorDaoImp fdao = new FornecedorDaoImp();
                fornecedores = fdao.findById(codigo);
            }
        }catch(RuntimeException e){
            JSFUtil.adicionarMensagemErro("ex.getMessage()");
            e.printStackTrace();
        }
    }

    public Fornecedor getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Fornecedor fornecedores) {
        this.fornecedores = fornecedores;
    }

    public ArrayList<Fornecedor> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Fornecedor> itens) {
        this.itens = itens;
    }

    public ArrayList<Fornecedor> getItensFiltrados() {
        return itensFiltrados;
    }

    public void setItensFiltrados(ArrayList<Fornecedor> itensFiltrados) {
        this.itensFiltrados = itensFiltrados;
    }

    public FornecedoresBean(Fornecedor fornecedores, ArrayList<Fornecedor> itens, ArrayList<Fornecedor> itensFiltrados) {
        this.fornecedores = fornecedores;
        this.itens = itens;
        this.itensFiltrados = itensFiltrados;
    }

    public FornecedoresBean() {
        fornecedores = new Fornecedor();
    }

}
