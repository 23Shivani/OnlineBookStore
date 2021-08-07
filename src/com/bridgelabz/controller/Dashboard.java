package com.bridgelabz.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.model.Book;
import com.bridgelabz.model.BookManagement;
import com.bridgelabz.model.Customer;
import com.bridgelabz.service.BookServiceImpl;



public class Dashboard {

	List<Customer> customers = new ArrayList<Customer>();
	List<Book> books = new ArrayList<Book>();
	List<BookManagement> bookManagements = new ArrayList<BookManagement>();
	
	BookServiceImpl bookService=new BookServiceImpl();
	
	static Scanner scanInput = new Scanner(System.in);
	
	public void menu() {
		int i = 0;
		
		
		do {
			System.out.print("1->add book \t 2-> buy book \t 3-> delete book ");
			
			int getUserInput = scanInput.nextInt();

			switch (getUserInput) {
			case 1: {
					bookService.addBook(books);
				break;
			}
			case 2: {
					bookService.deleteBook(books);
				break;
			}
			case 3:{
				
			}
			}

			System.out.print("want to continue- ");

			i = scanInput.nextInt();

		} while (i == 1);
	}
	

	public static void main(String[] args) {
		Dashboard board=new Dashboard();
		board.menu();
	}
}