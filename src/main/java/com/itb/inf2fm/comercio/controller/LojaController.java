package com.itb.inf2fm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProduto = new ArrayList<Produto>();

	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		Produto p1 = new Produto();
		p1.setId(20l);      
		p1.setNome("Máquina de lavar Brastemp 15 1");
		p1.setCodigobarras("JSBDFJDBSFJ23");
		p1.setDescricao("Produto Linha branca com painel");
		p1.setPreco(3215.89);
		
		
		Produto p2 = new Produto();
		p2.setId(20l);      
		p2.setNome("Televisor 70");
		p2.setCodigobarras("GHTUD6734892");
		p2.setDescricao("Televisor Tela Plana let Samsung");
		p2.setPreco(6326.12);
		
		// Adicionando os produtos á Lista
		
		listaDeProduto.add(p1);
		listaDeProduto.add(p2);
		
		model.addAttribute("listarProdutos",listaDeProduto);
		
		
		return"produtos";
	}

}
