package dtominov.springframework.spring5webapp.repositories;

import dtominov.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Daniel Tominov on 11/29/2017 3:29 PM
 **/
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
