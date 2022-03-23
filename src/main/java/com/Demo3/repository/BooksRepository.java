package com.Demo3.repository;

import org.springframework.data.repository.CrudRepository;  
import com.Demo.springbootcrudoperation.Books;  
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  
