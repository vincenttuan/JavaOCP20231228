package day03;

import java.util.Arrays;

public class MultiArrayDemo2 {

	public static void main(String[] args) {
		char[][] ttt = new char[3][3];
		ttt[0][1] = 'X';
		ttt[0][0] = 'O';
		ttt[1][2] = 'X';
		ttt[2][2] = 'O';
		ttt[1][0] = 'X';
		
		/*
		ttt[n][m] = 'O';
		n 與 m 個要放多少
		可以讓 O 賓果 ?
		*/
		
		System.out.println(Arrays.toString(ttt[0]));
		System.out.println(Arrays.toString(ttt[1]));
		System.out.println(Arrays.toString(ttt[2]));
		
	}

}
