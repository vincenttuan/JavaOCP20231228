package day10;

import java.util.ArrayList;
import java.util.List;

//用來實現 Calc.java 的規格
//且元素內容必須是 < 0 且最多只能放 5 個元素
public class CalcNeImpl implements Calc {
	
	private List<Integer> numbers = new ArrayList<>();
	private static final int LIMIT_SIZE = 5;
	
	@Override
	public void addElement(Integer value) {
		if(value >= 0 || numbers.size() >= LIMIT_SIZE) {
			return;
		}
		numbers.add(value);
	}

	@Override
	public void updateElement(int index, Integer updateValue) {
		if((index < 0 || index >= numbers.size()) || updateValue >= 0) {
			return;
		}
		numbers.set(index, updateValue);
	}

	@Override
	public void deleteElement(int index) {
		if(index < 0 || index >= numbers.size()) {
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
		if(index < 0 || index >= numbers.size()) {
			return null;
		}
		return numbers.get(index);
	}

	@Override
	public List<Integer> findAll() {
		return List.copyOf(numbers);
	}

	@Override
	public int getSize() {
		return numbers.size();
	}
	
	
	
}
