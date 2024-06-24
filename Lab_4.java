import java.util.Scanner;
public class Lab_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number :");
		int n =sc.nextInt();
		int r=1;
		int temp=1;
		for(int i=1;i<=n;i++){
			 r=r*i;
			 temp =r; 
		}
		System.out.println("factorial of is :"+ temp);
	}
}
