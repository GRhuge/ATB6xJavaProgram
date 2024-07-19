package MultiThreading;

public class G1 {
	public static<T>  void temp(T a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		temp(1);
		temp("sss");
		temp(6.7);
	}
}
