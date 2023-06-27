package com.viniciusdev;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {

	private static ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		LISTA_CONTATOS.addAll(Arrays.asList(
					new Contato("1", "Joao", "+55 34 00000-0000"),
					new Contato("2", "Maria Cecilia", "+55 34 11111-1111"),
					new Contato("3", "Cristiane", "+55 34 33333-3333"),
					new Contato("4", "Vinicius", "+55 34 44444-4444"))
				);
		
	}
	
	@GetMapping("/")
	public String index() {	
		return "index";
	}
	
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		return modelAndView;
	}
	
	@GetMapping("/contatos/novo")
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("formulario");
		modelAndView.addObject("contato", new Contato());
		return modelAndView;
	}
}
