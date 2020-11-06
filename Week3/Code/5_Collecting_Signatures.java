
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Areeg
 */
public class signature {
      public static int[][] sortbyColumn(int arr[][], int col) {

    int temp0 = 0;
    int temp1 = 0;

    for (int i = 0; i < col; i++) {
      for (int j = 0; j < col; j++) {
        if (arr[i][1]  < arr[j][1]) {
          temp0 = arr[i][1];
          temp1 = arr[i][0];
          arr[i][1] = arr[j][1];
          arr[i][0] = arr[j][0];
          arr[j][1] = temp0;
          arr[j][0] = temp1;
          temp0 = 0;
          temp1 = 0;
        }

      }

    }

    return arr;
  }
      
      
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int col = in.nextInt();
          int arr[][]=new int[col][2];
          ArrayList<Integer> sign= new ArrayList<Integer>();
        
        for(int i=0;i<col;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=in.nextInt();
            }
        }
        
        arr=sortbyColumn(arr,col);
        for(int i=0;i<col;i++){
            for(int j=0;j<2;j++){
//        System.out.print(arr[i][j]+"  ");
        
    }
//            System.out.println();
            }
        
        
        int tempx=0;
        int tempcount=0;
        int x=arr[0][1];
        int count=0;
        sign.add(arr[0][1]);
        for(int i =1;i<col;i++){
            for(int j=0;j<col;j++){
                if((x<arr[i][0])){
                    
                    x=arr[i][1];
                    count++;
                    sign.add(x);
                    
                }
            }
        }
        
        System.out.println(sign.size());
       for(int i=0; i<sign.size();i++){
           System.out.print(sign.get(i)+" ");
           
       }
        
        
    }
    
}
