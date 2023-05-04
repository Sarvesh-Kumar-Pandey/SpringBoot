package com.api.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.book.model.Book;
@Component
public class BookService {

	private static List<Book> list=new ArrayList<>();
	static {
		list.add(new Book(10,"Java Programming BOOK","XYZ"));
		list.add(new Book(25,"Java Programming coding","ABC"));
		list.add(new Book(30,"Java Programming Theory","DEF"));
		list.add(new Book(80,"Java Programming Logical","MNO"));
	}
	// get all book
	public List<Book> getAllBook(){
		return list;
	}
	// get single book by id
	public Book getBookById(int id) {
		Book book;
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
				}
	// add new data
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}
	//delete element
	public void deleteBook(int bookId) {
		list.stream().filter(book->book.getId()!=bookId).collect(Collectors.toList());
		}
	// update the book
	public void updateBook(Book book,int bookId) {
		list=list.stream().map(b->{
			if (b.getId()==bookId) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}return b;
		}).collect(Collectors.toList());
	}
}
