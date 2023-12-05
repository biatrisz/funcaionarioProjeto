package com.ProjetoFuncionario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoFuncionario.entities.Funcionario;
import com.ProjetoFuncionario.repository.funcionarioRepository;

@Service
public class funcionarioService {
	private final funcionarioReposiotry funcionarioRepository;

	@Autowired
	public funcionarioService(funcionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}

	public List<Funcionario> getAllFuncionario (){
		return funcionarioRepository.findAll();
	}

	public Funcionario getFuncionarioById(Long id) {
		Optional<Funcionario> Funcionario = funcionarioRepository.findById(id);
		return Funcionario.orElse(null);
	}

	public Funcionario salvarFuncionario(Funcionario Funcionario) {
		return funcionarioRepository.save(Funcionario);
	}

	public Funcionario updateFuncionario(Long id, Funcionario updatedFuncionario) {
		Optional<Funcionario> existingFuncionario = funcionarioRepository.findById(id);
		if (existingFuncionario.isPresent()) {
			updatedFuncionario.setId(id);
			return funcionarioRepository.save(updatedFuncionario);
		}
		return null;
	}

	public boolean deleteFuncionario(Long id) {
		Optional<Funcionario> existingFuncionario = funcionarioRepository.findById(id);
		if (existingFuncionario.isPresent()) {
			funcionarioRepository.deleteById(id);
			return true;
		}
		return false;
	}
}