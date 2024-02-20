package day13;

public class TestFamily {
	public static void main(String[] args) {
		Family family = new Family();
		Family.Member member = family.new Member();
		member.introduce();
		
		//Family.Member member = new Family().new Member();
		//member.introduce();
		
		//new Family().new Member().introduce();
	}
}
