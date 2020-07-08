package br.com.comau.googolplex.services;

import br.com.comau.goolgolplex.document.Produto;
import br.com.comau.goolgolplex.repository.ProdutoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    ProdutoRespository produtoRespository;

    @Override
    public Flux<Produto> findAll() {
        return produtoRespository.findAll();
    }

    @Override
    public Mono<Produto> findById(String id) {
        return produtoRespository.findById(id);
    }

    @Override
    public Mono<Produto> save(Produto produto) {
        return produtoRespository.save(produto);
    }

}