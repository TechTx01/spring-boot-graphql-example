package com.techtx.springbootgraphqlexample.service;

import com.techtx.springbootgraphqlexample.entity.Book;
import com.techtx.springbootgraphqlexample.repository.BookRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    BookRepository bookRepository;

    public BookService(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks()
    {
        return bookRepository.findAll();
    }

    public Book getBook(Long id)
    {
        return bookRepository.findById(id).get();
    }

    public Book saveBook(Book book)
    {
       return bookRepository.save(book);
    }
}
