/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;



/**
 *
 * @author Ayrton Barreto
 */

@Entity
@Table (name="autenticacao")
public class Autenticacao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="usuario_login")
    private String login;
    
    @Column(name="usuario_senha")
    private String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    @OneToOne (mappedBy = "autenticacao")
    Funcionario funcionario;

    @OneToOne (mappedBy = "autenticacao")
    Gerente gerente;
    
    public Autenticacao() {}
    
    public Autenticacao(Integer id, String login, String senha, Funcionario funcionario) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.funcionario = funcionario;   
    }
    
    public Autenticacao(Integer id, String login, String senha, Gerente gerente) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.gerente = gerente;   
    }
}
