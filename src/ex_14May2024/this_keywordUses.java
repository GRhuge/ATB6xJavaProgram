package ex_14May2024;

class Test{
	int i;
	void setValue(int i) {
		this.i=i;
	}
	void show() {
		System.out.println(i);
	}
}
public class this_keywordUses {
	
	public static void main(String[] args) {
		Test ky = new Test();
		ky.setValue(10);
		ky.show();
	}

}
