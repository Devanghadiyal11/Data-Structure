import java.util.*;
class Lab_5_31{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1[][] = new int[3][2];
        System.out.println("Enter details of arr1:");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print("Enter num of arr["+i+"]["+j+"]:");
                a1[i][j] = sc.nextInt();
            }
        }

        int a2[][] = new int[2][3];
        System.out.println("Enter details of arr2:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter num of arr["+i+"]["+j+"]:");
                a2[i][j] = sc.nextInt();
            }
        }

        int amulti[][] = new int[3][3];
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                amulti[i][j] = 0;
                for (int k=0; k<2;k++) {
                    amulti[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }

        System.out.println("Multiplication of Two matrix is:");
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print(amulti[i][j] + " ");
            }
            System.out.println("");
        }
    }
}