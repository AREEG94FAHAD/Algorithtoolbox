
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
public class chash {
    
    public static void main(String[] args){
    int dime = 10;
    int nickel = 5;
    int penny = 1;
    int counter=0;
    int cash=0;
    Scanner in = new Scanner(System.in);
    int cents =in.nextInt();
    
    
    
    
    while(cents!=0)
        
    {
          if(cents/dime!=0)
        {
          cents=cents-dime;
              counter++;
        }
        else if(cents/nickel!=0)
        {
          cents=cents-nickel;
              counter++;
        }
        else
        {
          cents=cents-penny;
              counter++;  
        }
    }
  
   System.out.println(counter); 
  }
    }
    

