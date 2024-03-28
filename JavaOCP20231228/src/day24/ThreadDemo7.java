package day24;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ThreadDemo7 {

	public static void main(String[] args) {
		Runnable crawler = () -> {
			try {
				String symbol = Thread.currentThread().getName();
				String url = "https://tw.stock.yahoo.com/quote/" + symbol;
				Document doc = Jsoup.connect(url).get();
				// 找到 <ul> 下的 <li class="price-detail-item"> 前面幾個字是 price-detail-item 的元素
				Elements elements = doc.select("ul > li.price-detail-item");
				// 過濾 html tag
				Map<String, String> priceMap = new LinkedHashMap<>();
				priceMap.put("代號", symbol);
				elements.forEach(e -> {
					// e 裡面有 2 個 <span> 分別印出 text
					Elements spans = e.select("span");
					String key = spans.get(0).text().replace(" ", "").replace("\n", "");
					String value = spans.get(1).text().replace("%", "").replace(",", "").replace(" ", "").replace("\n", "");
					priceMap.put(key, value);
				});
				System.out.println(priceMap);
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
		
		Thread t1 = new Thread(crawler, "2330");
		t1.start();
		Thread t2 = new Thread(crawler, "2317");
		t2.start();

	}

}
