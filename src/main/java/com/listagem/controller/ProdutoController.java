/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listagem.controller;

import com.listagem.classes.Produto;
import com.listagem.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author luisf
 */
@Controller
public class ProdutoController {
    
    @Autowired
    ProdutoService prod;
    
    @RequestMapping("/produto/{codigo}")
    public String produto(@PathVariable Long codigo, Model model){
        model.addAttribute("produto", prod.findOne(codigo));
        return "produto";
    }
            
    @RequestMapping(value = "/listadeprodutos", method = RequestMethod.GET)
    public String listarProdutos(Model model){
        model.addAttribute("listadeprodutos",prod.findAll());
                return "listadeprodutos";
    }
    
    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    @ResponseBody
    public String salvarProduto(@RequestBody Produto produto){
        prod.save(produto);
        return produto.getCodigo().toString();
    }
    
    @RequestMapping(value ="/remover", method = RequestMethod.POST)
    @ResponseBody
    public String removerProduto(@RequestParam Long codigo){
        prod.delete(codigo);
        return codigo.toString();
    }
}
