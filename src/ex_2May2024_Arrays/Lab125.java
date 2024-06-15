package ex_2May2024_Arrays;

import java.util.Scanner;

public class Lab125 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] marks = new float[5];
		System.out.println("Enter you Sub 1 marks");
		marks[0] = sc.nextFloat();
		System.out.println("Enter you Sub 2marks");
		marks[1] = sc.nextFloat();
		System.out.println("Enter you Sub 3 marks");
		marks[2] = sc.nextFloat();
		System.out.println("Enter you Sub 4 marks");
		marks[3] = sc.nextFloat();
		System.out.println("Enter you Sub 5 marks");
		marks[4] = sc.nextFloat();
		
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] < 35) {
				System.out.println("Failed in this Sub" + marks[i]);
			}
			System.out.println(marks[i]);
		}
	//	int j = 0;
	//	while(j < marks.length) {
	//		System.out.println(marks[j]);
	//		j++;
	//	}
		sc.close();
	}

}
