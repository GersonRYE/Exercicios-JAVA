import java.util.Scanner;

public class JavaEndOfFile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=1;
		
		while(scan.hasNext()) {
			System.out.println(scan.hasNext());
			System.out.println(n++ + " " + scan.nextLine());
		}
		scan.close();
		
	}

}
