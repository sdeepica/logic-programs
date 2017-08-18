package assignment;
import java.util.Scanner;
public class Ass1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr=new int[15];
		System.out.println("Enter the numbers");
		for(int i=0;i<15;i++) {
			arr[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<15;i++) {
			if(arr[i]%3==0) {
				System.out.println(arr[i]);
				count=1;
			}
			
		}
		if (count==0) {
			System.out.println("No numbers present");
		}
		s.close();
	}
}
