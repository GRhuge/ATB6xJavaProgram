package ex_20Apr2024_String_Const_Pool;

public class Lab056 {

	public static void main(String[] args) {
		String name = "Krsna"; // Here memory gets allocated in SCP
		String name1 = "Krsna"; // Here memory gets allocated in SCP
		
		String name2 = new String("Krsna"); // Here memory gets allocated in Heap Area

	}

}
