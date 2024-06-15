package ex_25042024_SwitchStatements;

public class Lab082 {

	public static void main(String[] args) {
		int a = 10;
		
		switch(a)
		{
		
		}
		char c ='d';
		switch(c)
		{
		
		}
		float f =13.3f;
		switch((int)f) // <-- Here Explicit type casting is done so it will not give any error
		{
		
		}
		double d = 30.0;
		switch((int)d)
		{
		
		}
		//boolean b = true; <-- boolean not allowed in switch statements
		//switch(b)
		//{}
		long l = 232l;
		switch((int)l)
		{
		
		}
	}

}
