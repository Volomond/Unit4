package by.epam.jb24.task3;

public class Posledovatelnost {
	public static void main (String[] args) {
		boolean state;
		int [] masUp = {1,2,3,4,5,6,7};
		int [] masDown = {1,2,3,4,3,2,1};
		
		state = Calc(masUp);
		Print(state, masUp);
		state = Calc(masDown);
		Print(state,masDown);
		
	}
	
	public static boolean Calc(int[] mas) {
		boolean flag = true;
		int elem = mas[0];
		
		for(int i = 1; i < mas.length -1; i++) {
			if (elem < mas[i]) {
				elem = mas[i];
			}else {
				flag = false;
			}
		}
		return flag;
	}
	
	public static void Print(boolean flag, int[] mas) {
		if(flag == true) {
			for(int i = 0; i < mas.length; i++) {
				System.out.println("mas[" + i + "]=" + mas[i] + ";");
			}
			System.out.println("Your sequence of numbers is rising");
		}else {
			System.out.println("----------------------------------");
			for(int i = 0; i < mas.length; i++) {
				System.out.println("mas[" + i + "]=" + mas[i] + ";");
				}
			System.out.println("Your sequence of numbers is falling");
		}
	}
}

