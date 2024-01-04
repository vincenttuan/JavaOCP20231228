package day03;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrayTTT {
	static String winner;
	static int count = 0;
	static String[][] ttt = {
			{" ", " ", " "},
			{" ", " ", " "},
			{" ", " ", " "}
	}; 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 井字遊戲
		printTTT();
		for(int i=0;i<9;) {
			System.out.print("請輸入位置[0~8]:");
			int input = scanner.nextInt();
			int x = input / 3;
			int y = input % 3;
			// 先檢查 ttt[x][y] 的內容是否是空的 ?
			if(ttt[x][y].equals(" ")) {
				ttt[x][y] = (i % 2 == 0) ? "O" : "X";
				i++; // 重要 !!
			} else {
				System.out.printf("位置 %d 不可以選擇%n", input);
				continue;
			}
			printTTT();
			// 賓果判斷
			if((ttt[0][0]+ttt[1][1]+ttt[2][2]).equals("OOO") ||
				(ttt[0][0]+ttt[1][0]+ttt[2][0]).equals("OOO") ||
				(ttt[0][1]+ttt[1][1]+ttt[2][1]).equals("OOO")||
				(ttt[0][2]+ttt[1][2]+ttt[2][2]).equals("OOO")||
				(ttt[0][0]+ttt[0][1]+ttt[0][2]).equals("OOO")||
				(ttt[1][0]+ttt[1][1]+ttt[1][2]).equals("OOO")||
				(ttt[2][0]+ttt[2][1]+ttt[2][2]).equals("OOO")||
				(ttt[0][2]+ttt[1][1]+ttt[2][0]).equals("OOO")) {
				winner = "O";
				break;
			} else if((ttt[0][0]+ttt[1][1]+ttt[2][2]).equals("XXX") ||
					(ttt[0][0]+ttt[1][0]+ttt[2][0]).equals("XXX") ||
					(ttt[0][1]+ttt[1][1]+ttt[2][1]).equals("XXX")||
					(ttt[0][2]+ttt[1][2]+ttt[2][2]).equals("XXX")||
					(ttt[0][0]+ttt[0][1]+ttt[0][2]).equals("XXX")||
					(ttt[1][0]+ttt[1][1]+ttt[1][2]).equals("XXX")||
					(ttt[2][0]+ttt[2][1]+ttt[2][2]).equals("XXX")||
					(ttt[0][2]+ttt[1][1]+ttt[2][0]).equals("XXX")) {
					winner = "X";
					break;
				} 
		}
		
		if(winner == null) {
			System.out.println("和局");
		} else {
			System.out.printf("%s 獲勝%n", winner);
		}
	}
	
	// 將棋盤印出
	public static void printTTT() {
		System.out.println(++count);
		System.out.println("+-----------+");
		System.out.println("| " + ttt[0][0] + " | " + ttt[0][1] + " | " + ttt[0][2] + " |");
		System.out.println("+---+---+---+");
		System.out.println("| " + ttt[1][0] + " | " + ttt[1][1] + " | " + ttt[1][2] + " |");
		System.out.println("+---+---+---+");
		System.out.println("| " + ttt[2][0] + " | " + ttt[2][1] + " | " + ttt[2][2] + " |");
		System.out.println("+-----------+");
		
	}

}
