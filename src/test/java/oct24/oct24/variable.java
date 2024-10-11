package oct24.oct24;

public class variable {
	int instanceVariable = 20;
	static String staticVariable = "This is static variable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int localVariable = 6;
		System.out.println("Local variable :" + localVariable);
		 
	System.out.println("Gand marao :" + staticVariable);

 variable obj = new variable();
 System.out.println("Variable:"  + obj.instanceVariable);
	}

}
