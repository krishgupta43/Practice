package Practice;

public class Singletion {

	public static void main(String[] args) {
//		Producer st1 = Producer.getInstance();
//		System.out.println(st1.hashCode());
//		Producer st2 = Producer.getInstance();
//		System.out.println(st2.hashCode());
	}

}

class Test {
    
	//Egar Way to create object this is tight coupling
	private static Test obj;

	private Test() {
		System.out.println("calling...........");
	};

	// lazy way to create object
	public static Test getInstance() {
		if (obj == null) {
			synchronized (Producer.class) {
				if (obj == null) {
//					obj = new Producer();
				}

			}
		}
		return obj;
	}
}