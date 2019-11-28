package matt.springproject.spring5webapp.model.repositories;

import matt.springproject.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
