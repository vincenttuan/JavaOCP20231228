package day03;

import java.util.Arrays;

public class MultiArrayTTT {

	public static void main(String[] args) {
		// 井字遊戲
		String[][] ttt = {
				{" ", " ", " "},
				{" ", " ", " "},
				{" ", " ", " "}
		};
		printTTT(ttt);
		int input = 5;
		int x = input / 3;
		int y = input % 3;
		ttt[x][y] = "O";
		printTTT(ttt);

	}
	
	// 將棋盤印出
	public static void printTTT(String[][] ttt) {
		System.out.println("+-----------+");
		System.out.println("| " + ttt[0][0] + " | " + ttt[0][1] + " | " + ttt[0][2] + " |");
		System.out.println("+-----------+");
		System.out.println("| " + ttt[1][0] + " | " + ttt[1][1] + " | " + ttt[1][2] + " |");
		System.out.println("+-----------+");
		System.out.println("| " + ttt[2][0] + " | " + ttt[2][1] + " | " + ttt[2][2] + " |");
		System.out.println("+-----------+");
		
	}

}
