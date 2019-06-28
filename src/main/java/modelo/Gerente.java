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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Ayrton Barreto
 */
@Data
@Entity
@Table (name="tb_gerentes")
public class Gerente implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column (name="ger_codigo")
    private Integer codigo;
    
    @Column (name="ger_nome", length = 50, nullable = false)
    private String nome;
    
    @Column (name="ger_cpf", length = 14, nullable = false, unique = true)
    private String cpf;
    
    @Column (name="ger_senha",length = 50, nullable = false)
    private String senha;
    
    @Column (name="ger_funcao",length = 50, nullable = false)
    private String funcao;
    
    @OneToOne
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "autenticacao_id")
    Autenticacao autenticacao;
    
    public Gerente(){
        
    }
}
