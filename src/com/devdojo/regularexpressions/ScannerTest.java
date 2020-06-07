package com.devdojo.regularexpressions;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner("1 true 100 oi")) {
			
			//scan.useDelimiter(",");
			while(scan.hasNext()) {
				
				System.out.println(scan.next());
				
			}
			
		}
		
		try(Scanner scan = new Scanner("1 true 100 oi")) {
			
			while(scan.hasNext()) {
				
				if(scan.hasNextInt()) {
					
					int i = scan.nextInt();
					System.out.println(i);
					
				} else if (scan.hasNextBoolean()) {
					
					boolean b = scan.nextBoolean();
					System.out.println(b);
					
				} else {
					
					System.out.println(scan.next());
					
				}
				
			}
			
		}
		
	}
	
}
