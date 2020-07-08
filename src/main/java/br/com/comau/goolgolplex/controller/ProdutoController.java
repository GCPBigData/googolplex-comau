package br.com.comau.goolgolplex.controller;

import br.com.comau.googolplex.services.ProdutoService;
import br.com.comau.goolgolplex.document.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProdutoController {

    ProdutoService produtoService;

    @GetMapping(value="/produto")
    public Flux<Produto> getPlaylist(){
        return produtoService.findAll();
    }


    @GetMapping(value="/produto/{id}")
    public Mono<Produto> getPlaylistId(@PathVariable String id){
        return produtoService.findById(id);
    }

    @PostMapping(value="/produto")
    public Mono<Produto> save(@RequestBody Produto produto){
        return produtoService.save(produto);
    }

}