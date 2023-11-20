import java.util.*;
class Jagged{
    public static void main(String[] args) {
        int [][]arr;
        System.out.println("enter row of an element");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        arr=new int[row][];
        for(int i=0;i<row;i++){
            System.out.println("enter col size of row");
            int col=sc.nextInt();
            arr[i]=new int[col];
        }
        System.out.println("plz enter elements");
        for(int i=0;i<row;i++){
            arr[i][j]=sc.nextInt();
        }
        System.out.println("elements are");
        for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}