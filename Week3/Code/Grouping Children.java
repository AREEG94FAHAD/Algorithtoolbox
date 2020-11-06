/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Areeg
 */

public class NewClass {
    
    static ArrayList calculate(ArrayList child){
        
      child = new ArrayList<Integer>(3);
        
        Collections.sort(child);
        
        for(int j=0;j<child.size();j++){
            System.out.println(child.get(j));
        }
        
        return child;
        
    }
    
    public static void main(String[] args){
           Scanner in = new Scanner(System.in);
           int n=in.nextInt();
             ArrayList <Double> child = new ArrayList<Double>(n);
                for(int i=0;i<n;i++)
                    {
                    child.add(in.nextDouble());
                    
                    }
                Collections.sort(child);
                System.out.println(child);
    
                Double interval=0.0;
                for(int i=0;i<child.size();i++){
//                    System.out.println(interval);
                    for(int j=1; j<child.size();j++){
                        if(1>=child.get(j)-child.get(j-1)){
                            child.remove(j);
                        }
                    }
                }
                
                System.out.println(child);
                
                
                
                
                
}}
