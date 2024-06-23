package ex_18May2024_Encapsulation;

public class ICICIBank {
	private String name;
	private long bal;
	
	ICICIBank(String name, long bal){
		this.name = name;
		this.bal = bal;
	}
	String getName() {
		return name;
	}
	void setName() {
		this.name = name;
	}
	long getBal() {
		return bal;
	}
	void setBal() {
		if(bal > 0) {
		this.bal = bal;
	}
		else {
			System.out.println("Not allowed");
		}
    }
	public static void  main(String[] args) {
		ICICIBank i = new ICICIBank("hari", 100);
		System.out.println(i.getBal());
		i.setBal();
		System.out.println(i.getBal());
		
	}
}
