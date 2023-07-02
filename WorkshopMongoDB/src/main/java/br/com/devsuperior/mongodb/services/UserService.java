package br.com.devsuperior.mongodb.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devsuperior.mongodb.models.dto.UserDTO;
import br.com.devsuperior.mongodb.models.entities.User;
import br.com.devsuperior.mongodb.repositories.UserRepository;
import br.com.devsuperior.mongodb.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<UserDTO> findAll() {
		List<User> list = repository.findAll();
		return list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
	}

	public UserDTO findById(String id) {
		Optional<User> result = repository.findById(id);
		User entity = result.orElseThrow(() -> new ResourceNotFoundException("Objeto não encontrado"));
		return new UserDTO(entity);
	}
}
