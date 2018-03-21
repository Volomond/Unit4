package by.epam.jb24.kratnost;

import java.util.Random;
import java.util.Scanner;

public class Kratnost {

	public static void main(String[] args) {
		int sum;
		int mas[] = new int[10];
		int krat;
		krat = inOut();
		EnterArray(mas);
		printArray(mas);
		sum = Calc(mas,krat);
		if (sum > 0) {
		System.out.println("Sum of such numbers is: " + sum);
	
	}else {
		System.out.println("There are no such numbers(((");
	}
}
	
	public static int inOut() {
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter number: ");
		}
		k = sc.nextInt();
		return k;
		
	}
	
	public static void EnterArray (int[] mas) {
		Random rand = new Random();
			for (int i =0; i < mas.length; i++) {
			mas[i]=rand.nextInt(100);
			}
	}
	
	public static void printArray (int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=" + mas[i] + ";");
			
		}System.out.println();
	}
	
	public static int Calc (int[] mas, int k) {
		int ost = 0;
		int calcRes = 0;
		for (int i = 0; i < mas.length; i++) {
			ost = mas[i] % k;
			if (ost == 0) {
				calcRes +=mas[i];
				}
				
			}
		return calcRes;
	}

}
