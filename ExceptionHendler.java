package Practice;

public class ExceptionHendler {
	
	public static int GetNumber() {
		try {
			int z=2/0;
			return 1;
		}catch(Exception e){
			return 2;
		}
		finally {
			return 3;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(GetNumber());
		int a=5,b=0;
		try {
//			int z=a/b;
//			String z=null;
			int[] z = new int[4];
			z[5]=6;
            System.out.println(z);
		}
		catch(NullPointerException ax) {
			System.out.println("Null pointer exception");
		}
		catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println("arrays exception");
		}
		catch(ArithmeticException ax) {
			System.out.println("Arithmatic exception");
		}
		catch(Exception ex) {
			System.out.println("normal flow");
		}
		
		
		
	}

}
