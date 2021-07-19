package SeleniumBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class HackerTask {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String text = input.readLine();
		double d =Double.parseDouble(text);
		
		
		String s = input.readLine();
		
		System.out.println("String : " +s);
		System.out.println("Double : " +d);
		System.out.println("Int : " +i);
		
		
	}
} 
			 

