
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[100];
		int i;
		for(i = 0; i < 100; i++)
			numbers[i] = 0;
		System.out.print("Enter the integers between 1 and 100: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int n = input.nextInt();
		while(n != 0){
			numbers[n - 1]++;
			n = input.nextInt();
		}
		for(i = 0; i < 100; i++){
			if(numbers[i] != 0)
				System.out.println((i + 1) + " occurs " + numbers[i] + " times");
		}
	}
}
