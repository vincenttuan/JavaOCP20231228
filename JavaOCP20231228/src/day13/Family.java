package day13;

// 外部類別-家庭
public class Family {
	int familySavings = 10000; // 家庭的共同存款
	static int familyHome = 1; // 家庭房子的數量
	
	// 內部類別 - 成員
	class Member {
		int personalSavings = 1000; // 成員的個人存款
		void introduce() { // 成員介紹自己
			int todaySavings = 500; // 今天的存款
			System.out.println("Hello 我是家庭的一員");
			System.out.println(todaySavings); // 500
			System.out.println(this.personalSavings); // 1000
			System.out.println(personalSavings); // 1000
			System.out.println(Family.this.familySavings); // 10000
			System.out.println(familySavings); // 10000
			System.out.println(Family.familyHome); // 1
		}
	}
	
}
