package com.ProjetoFuncionario.entities;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	@Entity
	@Table (name = "funcionario")
	public class Funcionario {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nome")
		private String nome;
		
		@Column(name = "cargo")
		private String cargo;
		
		@Column(name = "salario")
		private Double salario;
		
		@Column(name = "areaAtuacao")
		private String areaAtuacao;
		
		@Column(name = "localTrabalho")
		private String localTrabalho;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome(){
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo= cargo;
		}
		public Double getSalario() {
			return salario;
		}
		public void setSalario(Double salario) {
			this.salario= salario;	
	}
		public String getareaAtuacao() {
			return areaAtuacao;
		}
		public void setareaAtuacao(String areaAtuacao) {
			this.areaAtuacao= areaAtuacao;
	}
		public String getlocalTrabalho() {
			return localTrabalho;
		}
		public void setlocalTrabalho(String localTrabalho) {
			this.localTrabalho= localTrabalho;

		}
	}	

