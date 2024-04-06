package br.com.camnuvem.api.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.camnuvem.api.model.Produto;


public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
