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
@Table(name = "tb_itens")
public class Item implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column (name="ite_codigo")
    private Integer codigo;
    
    @Column (name="ite_quantidade", nullable = false)
    private Integer quantidade;
    
    @Column (name="ite_valor_parcial", nullable = false,scale = 2,precision = 7)
    private BigDecimal valor_parcial;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="tb_produtos_pro_codigo", referencedColumnName = "pro_codigo",nullable = false)
    private Produto produto;
    
    /*@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="tb_vendas_ven_codigo", referencedColumnName = "ven_codigo",nullable = false)
    private Vendas venda; */
}
