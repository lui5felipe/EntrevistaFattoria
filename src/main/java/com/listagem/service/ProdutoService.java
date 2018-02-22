/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listagem.service;
//import org.springframework.data

import com.listagem.classes.Produto;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author luisf
 */
public interface ProdutoService extends CrudRepository<Produto, Long> {
    
}
