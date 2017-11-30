package dtominov.springframework.spring5webapp.repositories;

import dtominov.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Daniel Tominov on 11/29/2017 2:28 PM
 **/
public interface BookRepository extends CrudRepository<Book, Long> {
}
