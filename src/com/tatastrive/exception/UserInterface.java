package com.tatastrive.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class UserInterface {

	public static void getData() throws FileNotFoundException {
		File file = new File("C:\\Users\\radha\\Desktop\\myfile2.txt");
		Scanner sc = new Scanner(file);

		String data = sc.nextLine();

		System.out.println("Data is : " + data);

		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("START");

		try {
			System.out.println("try block");
			String n="java";
			if(n.equals("java"))
			{
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}

		System.out.println("END");

	}
}