package matt.springproject.spring5webapp.bootstrap;

import matt.springproject.spring5webapp.model.Author;
import matt.springproject.spring5webapp.model.Book;
import matt.springproject.spring5webapp.model.Publisher;
import matt.springproject.spring5webapp.model.repositories.AuthorRepository;
import matt.springproject.spring5webapp.model.repositories.BookRepository;
import matt.springproject.spring5webapp.model.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

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

    private void initData(){

        Publisher harperCollins = new Publisher("Harper collins", "6 The Street");
        publisherRepository.save(harperCollins);
        Publisher penguin = new Publisher("Penguin", "22 Best Street");
        publisherRepository.save(penguin);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Desing", "1234", harperCollins);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book myBook = new Book("My dev book", "5432", penguin);
        rod.getBooks().add(myBook);
        myBook.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(myBook);
    }

}
