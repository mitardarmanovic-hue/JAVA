package com.udg.edu.me;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Fajlovi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(new File("Vozila.txt"));
		while(ulaz.hasNext())
		System.out.println(ulaz.nextLine());
		ulaz.close();
	}

}
