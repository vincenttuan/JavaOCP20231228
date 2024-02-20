package day13;

import java.util.List;

public class TestLibrary {

	public static void main(String[] args) {
		// 建立圖書館
		Library library = new Library();
		// 放入書籍
		library.addBook("Java", 500);
		library.addBook("Python", 300);
		library.addBook("C++", 400);
		// 查看書籍
		List<Library.Book> books = library.queryAllBooks();
		System.out.println(books);
		// 借出書籍
		Library.Book book = library.borrowBook("Java");
		if(book == null) {
			System.out.println("圖書館無此書");
		} else {
			System.out.println("借到了 " + book);
		}
		// 再次查看書籍
		books = library.queryAllBooks();
		System.out.println(books);
		
		// 放入 DVD
		library.addDVD("The Sound Of Music", 100);
		library.addDVD("真善美", 200);
		// 查看DVD
		List<Library.DVD> dvds = library.queryAllDVDs();
		System.out.println(dvds);
		// 借出 DVD
		Library.DVD dvd = library.borrowDVD("真善美");
		if(dvd == null) {
			System.out.println("圖書館無此DVD");
		} else {
			System.out.println("借到了 " + dvd);
		}
		// 查看DVD
		dvds = library.queryAllDVDs();
		System.out.println(dvds);
	}

}
