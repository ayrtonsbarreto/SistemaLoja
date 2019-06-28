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
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Ayrton Barreto
 */
@Data
@Entity
@Table(name = "tb_fornecedores")
public class Fornecedor implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "for_codigo")
    private Integer codigo;

    @Column(name = "for_descricao", length = 50, nullable = false)
    private String descricao;

}
