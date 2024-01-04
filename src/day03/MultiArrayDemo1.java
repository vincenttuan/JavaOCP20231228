package day03;

import java.util.Arrays;

public class MultiArrayDemo1 {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		/*
		 {
		 	{0, 0, 0},
		 	{0, 0, 0}
		 }
		 */
		
		scores[0][1] = 100;
		/*
		 {
		 	{0, 100, 0},
		 	{0, 0, 0}
		 }
		 */
		
		scores[1][2] = 90;
		
		/*
		 {
		 	{0, 100, 0},  <-- scores[0]
		 	{0, 0, 90}    <-- scores[1]
		 }
		 */
		
		System.out.println(Arrays.toString(scores[0]));
		System.out.println(Arrays.toString(scores[1]));

	}

}
