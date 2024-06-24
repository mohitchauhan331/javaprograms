package basicprograms;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        int[][] numbers = new int[rows][cols];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
         System.out.println("the original matrixs");
        for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++){
           System.out.print(numbers[i][j] + "\t");


        }
              System.out.println();
       }
       System.out.println("transpose of matrix is:");
       for (int j=0;j<cols;j++){
        for (int i=0;i<rows;i++){
            System.out.print(numbers[i][j]+"\t");
        }
        System.out.println();
       }
    }
}
        //int [] columnsums = new int [cols];
        //for (int j=0;j<cols;j++){
            //int sum =0;
            //for (int i=0;i<rows;i++){
               // sum+=numbers[i][j];
           // }
            //columnsums[j]=sum;
        //}
        //System.out.println("matrix containing column sum:");
        //for(int j=0;j<cols;j++){
            //System.out.print(columnsums[j]+ "\t" );
      //  }
        //System.out.println();
    //}
//}


        //int diagonalsum = 0 ;
        //for (int i =0; i<rows; i++)
        //{
          //  if(i < cols )
            //{
            //diagonalsum += numbers[i][i];
        //}
   
    
        