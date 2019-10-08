
public class Test7-5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 10 numbers: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] numbers = new int[10];
		int i, j, s, f;
		s = 0;
		for(i = 0; i < 10; i++){
			int n = input.nextInt();
			f = 1;
			for(j = 0; j < 10; j++){
				if(n == numbers[j])
					f = 0;
			}
			if(f != 0){
				numbers[s] = n;
				s++;
			}
		}
		System.out.println("The number of distinct numbers is " + s);
		System.out.print("The distinct numbers are: ");
		for(i = 0; i < s; i++)
			System.out.print(" " + numbers[i]);
	}
}
