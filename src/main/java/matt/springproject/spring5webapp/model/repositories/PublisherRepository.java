package matt.springproject.spring5webapp.model.repositories;

import matt.springproject.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
