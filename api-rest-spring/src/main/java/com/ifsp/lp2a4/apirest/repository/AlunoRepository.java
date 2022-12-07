package com.ifsp.lp2a4.apirest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifsp.lp2a4.apirest.model.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> 
{}

