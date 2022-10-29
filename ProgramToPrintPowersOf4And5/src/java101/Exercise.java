package java101;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print(" Enter the number: ");
		n = scanner.nextInt();
		
		System.out.println("4'ün katları: ");
		for(int i=1; i<=n; i*=4){
		System.out.println(i);
		}
		System.out.println("5'in katları: ");
		for(int i=1; i<=n; i*=5) {
		System.out.println(i);
		}
	}

}
