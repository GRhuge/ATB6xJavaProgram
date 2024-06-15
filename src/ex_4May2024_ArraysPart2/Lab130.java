package ex_4May2024_ArraysPart2;

public class Lab130 {

	public static void main(String[] args) {
		int [][] array_2d = {
				{34,12,11},
				{34,12,34},
				{11,23,98}
		};
		for(int i = 0; i < array_2d.length; i++) { // This loop will go for Row i : 0,1,2
			for(int j = 0; j < array_2d[i].length; j++) { // This loop will go for Column j : 0,1,2
				System.out.println(array_2d[i][j]);
			}
		}
	}

}
