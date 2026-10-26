package ca.sheridancollege.muthukur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello from Rahul Muthukumaran!");
		System.out.println("sum is = " + sum(5,5));
		System.out.println("square is = " + square(5));
		System.out.println(reverse("Hello from Rahul Muthukumaran!"));
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}
		
	static int sum(int a, int b) {
		return a + b;
	}
	static int square(int a) {
		return a*a;
	}
	static String reverse(String b) {
		String r = "";
		char ch;
		for (int i = 0; i < b.length(); i++) {
			ch = b.charAt(i);
			r = ch + r;
		}
		return r;
	}
}
