package MultiThreading;

public class TClass {

	public static void main(String[] args) {
		Test<Integer> i = new Test(3);
		System.out.println(i.getObject());
		
		Test<Double> i1 = new Test(2.43);
		System.out.println(i1.getObject());
		
		Test<String> i2 = new Test("Ram");
		System.out.println(i2.getObject());
	}
}
class Test<T>{
	T obj;
	Test(T obj){
		this.obj=obj;
	}
	public T getObject() {
		return this.obj;
	}
}
