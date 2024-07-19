package MultiThreading;

  class MaxThree_GenericsExample {
	public static <T extends Comparable<T>> T maximumOf(T a, T b,T c){
		T max = a;
		if(b.compareTo(max)>0) {
			max = b;
		}
		if(c.compareTo(max)>0) {
			max = c;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(maximumOf(1,2,3));
		System.out.println(maximumOf(34.2,23.5,67.9));
		System.out.println(maximumOf("hari","krsna","ram"));
	}

}
