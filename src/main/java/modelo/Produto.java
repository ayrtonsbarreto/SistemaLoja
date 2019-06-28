/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Ayrton Barreto
 */
@Data
@Entity
@Table (name = "tb_produtos")
public class Produto implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="pro_codigo")
    private Integer codigo;
    
    @Column(name="pro_descricao", length = 50, nullable = false)
    private String descricao;
    
    @Column(name="pro_valor",nullable = false, scale = 2, precision = 7)
    private BigDecimal valor;
    
    @Column(name="pro_quantidade",nullable = false)
    private Integer quantidade;
    
    @ManyToOne(fetch = FetchType.EAGER) //Quando carregar o produto o fornecedor virá junto
    @JoinColumn(name="tb_fornecedores_for_codigo", referencedColumnName = "for_codigo", nullable = false)
    // A chave estrangeira na tabela de produto vai ser tb_fornecedores_for_codigo
    private Fornecedor fornecedor;
}
