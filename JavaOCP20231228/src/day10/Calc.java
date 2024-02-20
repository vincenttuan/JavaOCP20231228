package day10;

import java.util.List;

// 此規格可以用來規定新增, 修改, 刪除與查詢的方法 API
public interface Calc {
	// 新增元素
	public void addElement(Integer value);
	
	// 修改指定元素
	public void updateElement(int index, Integer updateValue);
	
	// 刪除指定位置的元素
	public void deleteElement(int index);
	
	// 刪除全部的元素
	public void deleteAllElements();
	
	// 查詢指定位置元素
	public Integer getElement(int index);
	
	// 查詢全部內容
	public List<Integer> findAll();
	
	// 查詢資料筆數
	public int getSize();
	
}
