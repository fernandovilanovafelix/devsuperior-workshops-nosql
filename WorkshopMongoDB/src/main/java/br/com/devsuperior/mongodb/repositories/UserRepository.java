package br.com.devsuperior.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.devsuperior.mongodb.models.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
