package com.api.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.model.Book;
import com.api.book.service.BookService;


@RestController
public class BookController {
	@Autowired
	BookService bookservice;

	@GetMapping("/book")
	public List<Book> Books() {
		return this.bookservice.getAllBook();
	}
	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return this.bookservice.getBookById(id);
	}
	
	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		 Book b=this.bookservice.addBook(book);
		 System.out.println(b);
		 return b;
		}
	 // delete book
	@DeleteMapping("/book/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId) {
		this.bookservice.deleteBook(bookId);
	}
	// update the book
	
	@PutMapping("/book/{bookId}")
	public Book  updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId) {
		this.bookservice.updateBook(book,bookId);
		return book;
	}
}
