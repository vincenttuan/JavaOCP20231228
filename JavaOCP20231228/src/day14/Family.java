package day14;

// 外部類別
public class Family {
	
	private String familyHead; // 一家之主
	
	// 建構家庭
	public Family(String familyHead) {
		this.familyHead = familyHead;
	}
	
	// 一般內部類別: 子女
	class Child {
		private String name; // 名字
		
		// 建構子女
		public Child(String name) {
			this.name = name;
		}
		
		// 子女自我介紹
		public void selfIntroduction() {
			System.out.printf("我是 %s 家庭的子女, 我的名字是: %s%n", familyHead, name);
		}
	}
	
	// 方法內部類別
	public void buyCar(String name) {
		// 車子
		class Car {
			private String brandName;
			
			Car(String brandName) {
				this.brandName = brandName;
			}
			
			void printCar() {
				System.out.printf("%s 家買了一台 %s 車%n", familyHead, brandName);
			}
		}
		
		Car car = new Car(name);
		car.printCar();
	}
	
	// 娛樂活動
	interface Entertainment {
		void activity(); // 活動
	}
	
	// 家庭日方法
	public void familyDay() {
		Entertainment entertainment1 = new Entertainment() {
			@Override
			public void activity() {
				System.out.println("家庭日-烤肉活動");
			}
		};
		
		Entertainment entertainment2 = new Entertainment() {
			@Override
			public void activity() {
				System.out.println("家庭日-騎單車活動");
			}
		};
		
		entertainment1.activity();
		entertainment2.activity();
	} 
	
}
