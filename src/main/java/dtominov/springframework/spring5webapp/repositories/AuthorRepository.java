package dtominov.springframework.spring5webapp.repositories;

import dtominov.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Daniel Tominov on 11/29/2017 2:22 PM
 **/
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
