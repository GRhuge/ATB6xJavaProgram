package MultiThreading;

public class Lab203_Max_Between_ThreeNum {

	public static void main(String[] args) {
	//	int maxPut=maxNumberOf(34,56,70);
		double maxPut = maxNumberOf(1.2,3.3,2.3);
		System.out.println(maxPut);
	}
	
	public static int maxNumberOf(int a,int b,int c) {
	int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
	}
	
	public static double maxNumberOf(double a,double b,double c) {
		double max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
	}
	
	public static String maxNumberOf(String x,String y,String z) {
		String max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		return max;
	}
}
