package day10;

import java.util.ArrayList;
import java.util.List;

// 用來實現 Calc.java 的規格
// 且元素內容必須是 >= 0 且可以無限增加
public class CalcImpl implements Calc {
	// 建立一個動態陣列
	private List<Integer> numbers = new ArrayList<>();
	
	@Override
	public void addElement(Integer value) {
		if(value < 0) { // value 若小於 0 則不加入
			return;
		}
		numbers.add(value);
		
	}

	@Override
	public void updateElement(int index, Integer updateValue) {
		if(index < 0 || index >= numbers.size()) { // 檢查 index 是否在合法範圍 ?
			return;
		}
		if(updateValue < 0) { // value 若小於 0 則不加入
			return;
		}
		numbers.set(index, updateValue);
	}

	@Override
	public void deleteElement(int index) {
		if(index < 0 || index >= numbers.size()) { // 檢查 index 是否在合法範圍 ?
			return;
		}
		numbers.remove(index);
	}

	@Override
	public void deleteAllElements() {
		numbers.removeAll(numbers);
	}

	@Override
	public Integer getElement(int index) {
		if(index < 0 || index >= numbers.size()) { // 檢查 index 是否在合法範圍 ?
			return null;
		}
		return numbers.get(index);
	}

	@Override
	public List<Integer> findAll() {
		// 將 numbers 複製一份
		return List.copyOf(numbers);
	}

	@Override
	public int getSize() {
		return numbers.size();
	}

}
