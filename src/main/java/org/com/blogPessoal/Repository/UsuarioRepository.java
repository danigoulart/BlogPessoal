package org.com.blogPessoal.Repository;

import java.util.List;
import java.util.Optional;

import org.com.blogPessoal.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
	public Optional<Usuario> findByUsuario(String usuario);
	
	//Método criado para a Sessão de testes
			public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

}
