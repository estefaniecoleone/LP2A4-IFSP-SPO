package com.ifsp.lp2a4.apirest.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;


@Entity
public class Aluno {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long matricula;
	    private String nome;
	    
		public Aluno() {
		}
	    
		public Aluno(long matricula, String nome) {
			this.matricula = matricula;
			this.nome = nome;
		}


		public long getMatricula() {
			return matricula;
		}


		public void setMatricula(long matricula) {
			this.matricula = matricula;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}
	    
		
	    
	    
	    
}
