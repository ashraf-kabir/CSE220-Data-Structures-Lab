package Lab04.Task03;

public class Task03 {
	
	
	public static void arrPrint(int []a, int i) {
		if (i<0 || i>=a.length) {
			
		} else {
			System.out.print(a[i]+" ");
			arrPrint(a, i+1);
		}
	}

	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5};
		
		arrPrint(arr, 0);
		System.out.printf("\n");
	}

}
