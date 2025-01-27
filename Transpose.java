import java.util.Scanner;
    public class Transpose {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no.of rows: ");
        int r = sc.nextInt();
        System.out.println("enter the no.of columns: ");
        int c = sc.nextInt();
        int[][] mat= new int[r][c];
        int[][] transpose =new int[r][c];
        System.out.println("enter elements  of matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] =  sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transpose[j][i]= mat[i][j];
            }
            System.out.println();
        }
        System.out.println("transpose matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
