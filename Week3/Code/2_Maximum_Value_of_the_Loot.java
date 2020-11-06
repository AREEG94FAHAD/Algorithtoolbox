
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
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
public class knap {
public static double[][] sortbyColumn(double arr[][], int col) 
    { 
        // Using built-in sort function Arrays.sort 
//        Arrays.sort(arr, new Comparator<double[]>() { 
//            
//          public int compare(final double[] entry1,  
//                             final double[] entry2) { 
//  
//            // To sort in descending order revert  
//            // the '>' Operator 
//            if (entry1[col] > entry2[col]) 
//                return 1; 
//            else
//                return -1; 
//          } 
//
//
//        });  // End of function call sort(). 
        
        
        double temp0=0;
        double temp1=0;
        
        for(int i=0;i<col;i++){
            for(int j=0;j<col; j++){
                if(arr[i][0]/arr[i][1]>arr[j][0]/arr[j][1]){
                    temp0=arr[i][0];
                    temp1=arr[i][1];
                    arr[i][0]=arr[j][0];
                    arr[i][1]=arr[j][1];
                    arr[j][0]=temp0;
                    arr[j][1]=temp1;     
                    temp0=0;
                    temp1=0;
                }

            }
           
        }
//        for(int i=0;i<col;i++){
//                System.out.println(arr[i][0]+" "+arr[i][1]);
//            }
        return arr;
    } 




static double aa(double [][] arr, int n,double total_weight){
    double w=0;
    double v=0;
    
    
     for(int i = 0; i < n; i++){
            
                w+= arr[i][1];
//                System.out.println("==="+w+"===");
                
                v+= arr[i][0];
//                System.out.println("==="+v+"===");
          
        }
     if(total_weight >= w){
         return v;
     }
    w=total_weight;
    v=0;
     
     arr = sortbyColumn( arr,  n);

     for (int i=0;i<n; i++){
       if(arr[i][1]<=w){
           w=w-arr[i][1];
           v+=arr[i][0];
//            System.out.println("==="+v+"===");
           if((int)w==0){
               return v;
           }
       }
       else{
           v=v+((w/arr[i][1])*arr[i][0]);
           return v;
       }
     }
     
    return 0;
}








    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double total_weight = in.nextDouble();
        double[][] arr = new double[n][2]; 
        

        
        for(int i=0;i<n;i++){
            for(int j=0;j<2; j++){
                arr[i][j]=in.nextDouble();
            }
        }
        
        
 double num=aa(arr, n,total_weight);
        
        System.out.format("%.4f", num);
        
    }
    
}
