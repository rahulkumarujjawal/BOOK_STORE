package com.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.Entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
