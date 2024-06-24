import java.util.Scanner;
public class Lab_1_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a radius : ");
		int n = sc.nextInt();
		double area = Math.PI*(n*n); 
		System.out.println("Area of circle  = "+area);

	}
	
}
