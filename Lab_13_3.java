import java.util.Scanner;
public class Lab_13_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter value :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
	
}
