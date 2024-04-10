package br.com.camnuvem.api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.camnuvem.api.model.Usuario;
import java.util.List;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
    @Query("select u from Usuario u where u.login = ?1")
    Usuario findByLogin(String login);
}
