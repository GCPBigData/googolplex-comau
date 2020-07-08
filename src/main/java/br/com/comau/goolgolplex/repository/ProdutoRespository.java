package br.com.comau.goolgolplex.repository;

import br.com.comau.goolgolplex.document.Produto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProdutoRespository extends ReactiveMongoRepository<Produto, String>{

}