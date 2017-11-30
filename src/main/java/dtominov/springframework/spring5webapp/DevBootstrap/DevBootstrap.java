package dtominov.springframework.spring5webapp.DevBootstrap;

import dtominov.springframework.spring5webapp.model.Author;
import dtominov.springframework.spring5webapp.model.Book;
import dtominov.springframework.spring5webapp.model.Publisher;
import dtominov.springframework.spring5webapp.repositories.AuthorRepository;
import dtominov.springframework.spring5webapp.repositories.BookRepository;
import dtominov.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Tominov on 11/29/2017 2:47 PM
 **/
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        //Daniel
        Publisher randomHouse = new Publisher("RandomHouse", "123 Main Street");
        //save publisher before attempting to add to a book. Will fail if publisher does not exist
        publisherRepository.save(randomHouse);

        Author daniel = new Author("Daniel", "Smith");
        Book book = new Book("Java Development", "xyz123", randomHouse);
        daniel.getBooks().add(book);
        book.getAuthors().add(daniel);

        authorRepository.save(daniel);
        bookRepository.save(book);


        //Mike
        Publisher mcMillan = new Publisher("McMillan", "22 1st Street");
        publisherRepository.save(mcMillan);
        Author mike = new Author("Mike", "Jones");
        Book book1 = new Book("Spring Development", "123ABC", mcMillan);
        mike.getBooks().add(book1);

        authorRepository.save(mike);
        bookRepository.save(book1);
    }
}
