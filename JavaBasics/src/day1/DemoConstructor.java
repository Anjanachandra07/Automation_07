package day1;

public class DemoConstructor {
	
	/*Constructor -
	 * will have same name as that of the class name
	 * will not have a return type
	 * 
	 * 
	 */
	
	public DemoConstructor() {
		System.out.println("Without Parameters");
	}
	
	public DemoConstructor(int a) {
		System.out.println("With Parameters");
	}

	public void add() {
		System.out.println(1+2);
	}
	public static void main(String[] args) {
		DemoConstructor c1 = new DemoConstructor(89);
		
		
		c1.add();
	}

}
