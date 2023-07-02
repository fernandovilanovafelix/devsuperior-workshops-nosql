package br.com.devsuperior.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.devsuperior.mongodb.models.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
