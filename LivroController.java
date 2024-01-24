package com.livraria.projetolivraria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {
	    @Autowired
	    private LivroRepository livroRepository;
	    
	    @PostMapping
	    public Livro adicionarLivro(@RequestBody Livro livro) {
	        return livroRepository.save(livro);
	    }
	    
	    @GetMapping
	    public List<Livro> listarLivros() {
	        return livroRepository.findAll();
	    }
	    
	    @GetMapping("/buscar")
	    public List<String> buscarPorTitulo(@RequestParam String titulo) {
	        return livroRepository.findByTituloContaining(titulo);
	    }
	}

