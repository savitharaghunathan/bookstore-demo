package com.konveyor.bookstore_demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konveyor.bookstore_demo.model.Book;
import com.konveyor.bookstore_demo.model.BookRepository;

@RestController
@RequestMapping(path = "books")
public class BookController {

	@Autowired
	private BookRepository book;
	

	
	@GetMapping("/")
	public List<Book> getBooks(){
		return (List<Book>) book.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<Book> findById(@PathVariable Long id){
		return book.findById(id);
	}
	
}
