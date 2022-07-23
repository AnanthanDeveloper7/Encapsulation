import java.util.Scanner;
public class Fname {

	public static void main(String[] args) {
		char name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name ");
		name = s.next().charAt(0);
		System.out.println("hello! " + name);
	}

}
