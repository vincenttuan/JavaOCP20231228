package day24;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ThreadDemo7 {

	public static void main(String[] args) {
		Runnable crawler = () -> {
			try {
				String url = "https://tw.stock.yahoo.com/quote/2330";
				Document doc = Jsoup.connect(url).get();
				System.out.println(doc);
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
		
		Thread t = new Thread(crawler);
		t.start();

	}

}
