package repository;

import model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryMovie extends MongoRepository<Movie, String> {
}
