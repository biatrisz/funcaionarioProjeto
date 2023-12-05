package com.ProjetoFuncionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoFuncionario.entities.Funcionario;


public interface funcionarioRepository extends JpaRepository <Funcionario, Long>{

}
