package br.com.camnuvem.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.camnuvem.api.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {

}
