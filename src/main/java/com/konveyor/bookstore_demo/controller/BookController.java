package com.konveyor.bookstore_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
		return book.findAll();
	}
	
}
