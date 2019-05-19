package k;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int x;
		System.out.println("Dame un valor numerico");
		
		try {
			x = scan.nextInt();
			System.out.println(x);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println( "No me diste un valor numerico pvto :v");
		}

	}

}
