package com.itb.inf2hm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2hm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	List<Produto> produtos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		Produto produto = new Produto();
		produto.setNome("Kit Amend Expertise Marula Fabulous Nutrition | 4 produtos");
		produto.setCodigoBarras("13FH7AF68V7S9G8G");
		produto.setPreco(147.78);
		
		return "produtos";
	}
}