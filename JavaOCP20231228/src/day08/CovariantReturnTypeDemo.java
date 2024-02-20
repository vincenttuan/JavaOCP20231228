package day08;

// 若方法有回傳值，其回傳型態必須相同或是原方法傳回值型別的子類別。
// 協變返回類型
// 父類 Shape 定義了一個方法，該方法返回一個 Shape 對象
class Shape {
	Shape getShape() { // 取得(建立一個)形狀的實體
		Shape shape = new Shape();
		return shape;
	}
	void draw() { // 繪製
		System.out.println("繪製形狀");
	}
}

//子類 Circle 繼承自 Shape，覆寫了 getShape 方法，並返回 Circle 這個 Shape 的子類型
class Circle extends Shape {

	@Override
	Circle getShape() { // 取得圓形的形狀
		return new Circle();
	}

	@Override
	void draw() {
		System.out.println("繪製圓形");
	}
	
}

class Rect extends Shape {

	@Override
	Rect getShape() {
		return new Rect();
	}

	@Override
	void draw() { // 矩形
		System.out.println("繪製四邊形");
	} 
	
}


public class CovariantReturnTypeDemo {

	public static void main(String[] args) {
		/*
		Circle circle = new Circle(); // 建立圓形
		Shape shape = circle.getShape(); // 取得圓形的形狀
		shape.draw(); // 繪製
		*/
		Rect rect = new Rect(); // 建立矩形
		Shape shape = rect.getShape(); // 取得矩形的形狀
		shape.draw(); // 繪製
		
		
	}

}
