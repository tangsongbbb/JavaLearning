
public class Test7-19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of the list: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int n = input.nextInt();
		System.out.print("Enter the contents of the list:");
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++)
			numbers[i] = input.nextInt();
		System.out.print("The list has " + n + " integers");
		for(int i = 0; i < n; i++)
			System.out.print(" " + numbers[i]);
		System.out.println();
		boolean flag = isSorted(numbers);
		if(flag)
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
	}
	
	public static boolean isSorted(int[] list){
		int f = 1;
		for(int i = 0; i < list.length - 1; i++){
			if(list[i] > list[i+1])
				f = 0;
		}
		if(f != 1)
			return false;
		else
			return true;
	}
}
