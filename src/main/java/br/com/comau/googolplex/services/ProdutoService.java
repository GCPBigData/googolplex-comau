package br.com.comau.googolplex.services;

import br.com.comau.goolgolplex.document.Produto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProdutoService {

    Flux<Produto> findAll();
    Mono<Produto> findById(String id);
    Mono<Produto> save(Produto produto);

}