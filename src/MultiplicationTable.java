
public class MultiplicationTable {

	public static void main(String[] args) {
		
		System.out.println("****************");
		System.out.println("Multiplication Table");
		System.out.println("****************");
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int j=1; j<=9; j++) {
				System.out.print(i*j + " ");
			}
		}

	}

}
