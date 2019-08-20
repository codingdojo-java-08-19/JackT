package com.jackt.mysqlsecond.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jackt.mysqlsecond.models.Book;
import com.jackt.mysqlsecond.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public  Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Book updateBook = this.findBook(id);
    	updateBook.setTitle(title);
    	updateBook.setDescription(desc);
    	updateBook.setNumberOfPages(numOfPages);
    	updateBook.setLanguage(lang);
    	
    	return bookRepository.save(updateBook);
    	
    }
    
    public void deleteBook(Long id) {
    	this.bookRepository.deleteById(id);
    }
}