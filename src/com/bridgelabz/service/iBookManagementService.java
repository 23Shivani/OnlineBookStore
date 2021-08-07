package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.model.Book;
import com.bridgelabz.model.BookManagement;
import com.bridgelabz.model.Customer;

public interface iBookManagementService {
	void buyBook(List<Book> books, List<Customer> customers, List<BookManagement> bookManagements);
}
