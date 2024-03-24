package com.techtx.springbootgraphqlexample.controller;

import com.techtx.springbootgraphqlexample.entity.Book;
import com.techtx.springbootgraphqlexample.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @SchemaMapping(typeName = "Query",value = "books")
    public List<Book> findAll() {
        return bookService.getBooks();
    }

    @QueryMapping
    public Book bookById(@Argument Long id) {
        return bookService.getBook(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book)
    {
        return bookService.saveBook(book);
    }

}