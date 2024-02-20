package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		// 靜態陣列 (建立之後無法新增,刪除元素, 讀取速度快)
		int[] aArray = {100, 90, 80};
		//aArray[3] = 70; // 新增一個元素
		int[] bArray = {0, 0, 0, 70};
		System.arraycopy(aArray, 0, bArray, 0, 3);
		System.out.println(Arrays.toString(bArray));
		
		// 動態陣列 (建立之後可以自由地新增,修改,刪除元素, 讀取速度較靜態陣列慢)
		List<Integer> numbers = new ArrayList<>();
		// 自由新增元素
		numbers.add(100);
		numbers.add(90);
		numbers.add(80);
		System.out.println(numbers);
		System.out.println(numbers.get(0)); // index = 0 的元素內容
		System.out.println(numbers.get(1)); // index = 1 的元素內容
		System.out.println(numbers.get(2)); // index = 2 的元素內容
		System.out.println(numbers.size()); // 陣列長度
		// 自由修改元素
		// 將 index = 1 的元素內容改成 45
		numbers.set(1, 45);
		System.out.println(numbers);
		// 自由刪除元素
		// 將 index = 1 的元素內容刪除
		numbers.remove(1);
		System.out.println(numbers);
	}

}
