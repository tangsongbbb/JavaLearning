
public class Test73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 10 numbers: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int i;
		double[] numbers = new double[10];
		for(i = 0; i < 10; i++)
			numbers[i] = input.nextDouble();
		sort(numbers);
		for(i = 0; i < 10; i++)
			System.out.println(numbers[i]);
	}
	
	public static void sort(double[] array){
		double temp;
		for(int i = 0; i < 10; i++)
			for(int j = 9; j > i; j--){
				if(array[j] < array[j-1]){
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
	}
}
