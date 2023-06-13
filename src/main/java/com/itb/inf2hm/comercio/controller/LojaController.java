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

	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar") 
	
	
	public String listarProdutos(Model model) {
		
		Produto produto = new Produto();
		produto.setId(1572);
		produto.setNome("Kit Amend Expertise Marula Fabulous Nutrition | 4 produtos");
		produto.setCodigoBarras("13FH7AF68V7S9G8G");
		produto.setPreco(147.78);
		
		Produto produto2 = new Produto();
		produto2.setId(2048);
		produto2.setNome("Plystation 5");
		produto2.setCodigoBarras("804280HGK68");
		produto2.setPreco(4900.00);
		
		Produto produto3 = new Produto();
		produto3.setId(3847);
		produto3.setNome("Nintendo Switch Lite");
		produto3.setCodigoBarras("0904KUV57TUF");
		produto3.setPreco(1900.00);
		
		listaDeProdutos.add(produto);
		listaDeProdutos.add(produto2);
		listaDeProdutos.add(produto3);
		
		model.addAttribute("produtos", listaDeProdutos);
		
		return "produtos";
	}
	
	@GetMapping("/novo-prod")
	
	public String novoProduto () {
		return "novo-produto";
	}
}