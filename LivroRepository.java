package com.livraria.projetolivraria;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, String> {
	List<String> findByTituloContaining(String titulo);

}
