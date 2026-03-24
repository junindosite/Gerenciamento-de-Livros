package com.junior.crud.service;

import com.junior.crud.entity.Livro;
import com.junior.crud.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public Livro salvar(Livro livro){
        return repository.save(livro);
    }

    public List<Livro> buscar(){
        return repository.findAll();
    }

    public Livro buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}