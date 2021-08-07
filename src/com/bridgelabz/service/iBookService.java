package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.model.Book;

public interface iBookService {
	void addBook(List<Book> books);
	void deleteBook(List<Book> books);
}
