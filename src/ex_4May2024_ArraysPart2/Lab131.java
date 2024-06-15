package ex_4May2024_ArraysPart2;

public class Lab131 {

	public static void main(String[] args) {
		int[][] array_2d = {
				{23,45,11},
				{11,22,33}
		};
		
		for(int i = 0; i < array_2d.length; i++) { //This loop is for Row : 0,1 
			for(int j = 0; j < array_2d[i].length; j++) { //This loop is for Columns : 0,1,2
				System.out.println(array_2d[i][j]);
			}
		}
	}

}
