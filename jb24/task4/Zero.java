package by.epam.jb24.task4;

public class Zero {

	public static void main(String[] args) {
		int[] mas = {1,2,3,0,4,5,0,6,7,0,8,9,0};
		int[] masRes;
		int sumZero = CalcZero(mas);
		if (sumZero ==0) {
			PrintNo();
		}else {
		masRes = CalcRes(mas,sumZero);
		PrintArray(masRes);
		}

	}
	
	public static int CalcZero(int[] mas) {
		int sum = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] == 0) {
				sum++;
			}
		}
		return sum;
	}
	
	public static int [] CalcRes (int[] mas, int sum) {
		int j=0;
		int[] indexMas = new int [sum];
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] == 0) {
					indexMas[j] = i;
					j++;
			}
		}
		return indexMas;
	}
	
	public static void PrintNo() {
		System.out.println("There is no zero in your Array");
	}
	
	public static void PrintArray (int[] mas) {
		System.out.println("Your Array:");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=" + mas[i] + ";");
			
		}
	}

}
