package day13;

import java.util.ArrayList;
import java.util.List;

// 圖書館
public class Library { // 外部類別
	private List<Book> books = new ArrayList<>(); // 放入多個書籍的容器
	private List<DVD> dvds = new ArrayList<>(); // 放入多片DVD的容器
	
	// 書籍
	public class Book { // 內部類別
		private String name; // 書名
		private Integer pages; // 頁數
		
		public Book(String name, Integer pages) {
			this.name = name;
			this.pages = pages;
		}

		@Override
		public String toString() {
			return "Book [name=" + name + ", pages=" + pages + "]";
		}
		
	} 
	
	// DVD
	public class DVD { // 內部類別
		private String name; // 電影名稱
		private Integer length; // 影片長度
		
		public DVD(String name, Integer length) {
			this.name = name;
			this.length = length;
		}

		@Override
		public String toString() {
			return "DVD [name=" + name + ", length=" + length + "]";
		}
		
	}
	
	// 放入書籍
	public void addBook(String name, Integer pages) {
		Book book = new Book(name, pages);
		books.add(book);
	}
	
	// 借出書籍
	public Book borrowBook(String bookName) {
		// 根據書籍名字找到該本書
		for(int i=0;i<books.size();i++) {
			Book book = books.get(i);
			if(book.name.equals(bookName)) {
				// 將該筆書從 books 中移出
				books.remove(i);
				// 將該筆出借出
				return book;
			}
		}
		return null;
	} 
	
	// 查詢所有書籍
	public List<Book> queryAllBooks() {
		return books;
	}
	
	// 放入DVD
	public void addDVD(String name, Integer length) {
		DVD dvd = new DVD(name, length);
		dvds.add(dvd);
	}
	
	// 借出DVD
	public DVD borrowDVD(String dvdName) {
		for(DVD dvd : dvds) {
			if(dvd.name.equals(dvdName)) {
				dvds.remove(dvd);
				return dvd;
			}
		}
		return null;
	}
	
	// 查詢所有DVD
	public List<DVD> queryAllDVDs() {
		return dvds;
	}
	
}
