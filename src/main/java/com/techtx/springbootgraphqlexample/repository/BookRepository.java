package com.techtx.springbootgraphqlexample.repository;

import com.techtx.springbootgraphqlexample.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}
