package ex_27Apr2024Loop_Statements;

public class Lab105 {

	public static void main(String[] args) {
		// Continue Statement -> if this is true then continue
		for(int i = 0; i < 10; i++){
		System.out.println(i);
		if(i == 8){
			continue;
		}
		System.out.println("After");
		}
	}

}
