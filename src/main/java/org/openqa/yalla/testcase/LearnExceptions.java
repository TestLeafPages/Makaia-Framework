package org.openqa.yalla.testcase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnExceptions{
	public static void main(String[] args) {
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);

		try {
			int num = sc.nextInt();
			System.out.println(num % 5);
		}catch (ArithmeticException e) {
			System.err.println("Cannot divisible by 0");
		} catch(InputMismatchException e) {
			System.err.println("Hey! you have given a non integer" );
		} catch(Exception e) {
			System.err.println("Hey! Something went wrong");
		} 
		finally
		{
			System.err.println("Finally! This can be done");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println("Hi I am outside try catch");
		sc.close();
		
	}

}
