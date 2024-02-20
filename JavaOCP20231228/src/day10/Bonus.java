package day10;

// 年終獎金
@FunctionalInterface // 只有一個待實作的抽象方法
public interface Bonus {
	// 計算年終獎金的方法, 並會返回年終獎金
	public abstract int calculateBonus(int salary); // public abstract 可以省略
	
}
