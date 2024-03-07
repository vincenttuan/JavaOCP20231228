package day18;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> pages = new Stack<>();
		pages.push("http://aaa.bbb.ccc");
		pages.push("http://bbb.ccc.ddd");
		pages.push("http://ccc.ddd.eee");
		System.out.println(pages);
		
		// Go back
		String page3 = pages.pop();
		System.out.println("page3:" + page3);
		
		String page2 = pages.pop();
		System.out.println("page2:" + page2);
		
		String page1 = pages.pop();
		System.out.println("page1:" + page1);
		
		System.out.println(pages);
	}
}
