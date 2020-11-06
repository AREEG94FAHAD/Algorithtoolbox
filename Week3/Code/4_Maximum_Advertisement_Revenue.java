
import java.util.Arrays;
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
public class advertise {
    
    static void maxads(long a[], long b[], int n){
        Arrays.sort(a);
        Arrays.sort(b);
       long sum=0;
        
        for( int i=0; i<n ; i++){
            sum =sum+a[i]*b[i];
        }
        System.out.print(sum);
    }
    
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        long a[]= new long[n];
        long b[]= new long[n];
        
        for(int i=0;i<n; i++){
            a[i]=in.nextInt();
        }
        
        for(int i=0;i<n; i++){
            b[i]=in.nextInt();
        }
        
        maxads(a,b,n);
    }
    
}
