package com.ifsp.lp2a4.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifsp.lp2a4.apirest.model.Aluno;
import com.ifsp.lp2a4.apirest.repository.AlunoRepository;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {
	
    @Autowired
    private AlunoRepository alunoRepository;
    
    
        
    @GetMapping
    public List<Aluno> allAlunos() {
        return (List<Aluno>) alunoRepository.findAll();
    }
 
    @GetMapping("/{matricula}")
    public ResponseEntity<Aluno> findById(@PathVariable(value = "matricula") long matricula) {
    	Optional<Aluno> aluno = alunoRepository.findById(matricula);
    	 
        if(aluno.isPresent()) {
            return ResponseEntity.ok().body(aluno.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
 
    @PostMapping
    public Aluno saveAluno(@Validated @RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }
    
   
    @PutMapping(value="/{matricula}")
    public ResponseEntity update(@PathVariable("matricula") long matricula,
                                          @RequestBody Aluno aluno) {
       return alunoRepository.findById(matricula)
               .map(record -> {
            	   record.setNome(aluno.getNome());
            	   Aluno updated = alunoRepository.save(record);
                   return ResponseEntity.ok().body(updated);
               }).orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping(path ={"/{matricula}"})
    public ResponseEntity <?> delete(@PathVariable long matricula) {
       return alunoRepository.findById(matricula)
               .map(record -> {
            	   alunoRepository.deleteById(matricula);
                   return ResponseEntity.ok().build();
               }).orElse(ResponseEntity.notFound().build());
    }
    
    
}

