package org.com.blogPessoal.Repository;

import java.util.List;

import org.com.blogPessoal.Model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	
	
	
	
}
