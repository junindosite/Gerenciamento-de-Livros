package com.junior.crud.Controller;

import com.junior.crud.entity.Livro;
import com.junior.crud.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @PostMapping
    public Livro salvar(@RequestBody Livro livro){
        return service.salvar(livro);
    }

    @GetMapping
    public List<Livro> buscar(){
        return service.buscar();
    }

    @GetMapping("/{id}")
    public Livro buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}