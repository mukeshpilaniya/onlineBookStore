package com.pilaniya.onlinebookstore.repository;

import com.pilaniya.onlinebookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


//no need to create controller and do manual mapping of get,post,delete,put request
@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book,Long> {
}
