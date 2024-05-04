package br.com.rocca.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rocca.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
	
}
