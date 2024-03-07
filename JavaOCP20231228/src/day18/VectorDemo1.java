package day18;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		// Vector 與 ArrayList 的差別
		// Vector: 同步 (Thread-safe) 在多執行緒架構下是安全的
		// ArrayList: 非同步 (nonThread-safe)
		
		Vector<Integer> v = new Vector<>(41, 3);
		for(int i=0;i<41;i++) {
			v.add(i);
		}
		v.add(999); // 程咬金
		System.out.println(v);
		System.out.printf("size: %d%n", v.size());
		System.out.printf("capacity: %d%n", v.capacity());
		
	}

}
