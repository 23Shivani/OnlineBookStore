package com.bridgelabz.service;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.bridgelabz.model.Book;

public class BookServiceImpl {
	
	Scanner scanInput = new Scanner(System.in);

	public void addBook(List<Book> books) {
		Book book = new Book();
		int i = 0;
		do {

			System.out.println("enter book id");
			int getId = scanInput.nextInt();
			

			if (books.stream().map(data -> data.getId()).anyMatch(data -> data == getId)) {
				System.out.print("book already present - ");

			} else {book.setId(getId);

				System.out.print("Enter book name- ");
				String bookName = scanInput.next();
				book.setBookName(bookName);

				System.out.println("enter book author -");
				String bookAuthor = scanInput.next();
				book.setAuthor(bookAuthor);

				System.out.println("enter book edition -");
				int bookEdition = scanInput.nextInt();
				book.setEdition(bookEdition);

				System.out.println("enter book price -");
				int bookPrice = scanInput.nextInt();
				book.setPrice(bookPrice);

				System.out.println("enter book quantity -");
				int bookQuantity = scanInput.nextInt();
				book.setQuantity(bookQuantity);
				
				books.add(book);

			}

			System.out.print("want to repeat - ");
			i = scanInput.nextInt();

		} while (i == 1);

	}
	
	public void deleteBook(List<Book> books) {
		Book book = new Book();
		int i = 0;
		do {

			System.out.println("enter book id");
			int newId = scanInput.nextInt();
			

			if (books.stream().map(data -> data.getId()).allMatch(data -> data == newId)) {
				books.remove(book);
			} else {book.setId(newId);

			System.out.print("Enter book name- ");
			String bookName = scanInput.next();
			book.setBookName(bookName);
			}

		System.out.print("want to repeat - ");
		i = scanInput.nextInt();

		} while (i == 1);

	}
}