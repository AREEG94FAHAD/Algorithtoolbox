
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
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
public class arrayofobject {
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);
        
        int s = in.nextInt();
        int p = in.nextInt();
        Apear obj[] = new Apear[s*2+p];
        
        for(int i=0;i<s*2;i+=2){
            obj[i] = new Apear(in.nextInt(),"l");
            obj[i+1] = new Apear(in.nextInt(),"r");
        }
        int points[]=new int[p];
        for(int i=0;i<p;i++){
            points[i]=in.nextInt();
        }
       
        for(int i=0;i<p;i++){
            obj[i+s*2] = new Apear(points[i],"p");
        }
        
        
        
        
Comparator<Apear> byAge = Comparator.comparing(Apear::getAge);
Comparator<Apear> byName = Comparator.comparing(Apear::getName);
Arrays.sort(obj,byAge.thenComparing(byName));

//            for(int i=0;i<obj.length;i++){
//                System.out.println(obj[i].key+"  "+obj[i].value);
//            }
                                
       
        int sum = 0;
        Hashtable<Integer, Integer> arr = new Hashtable<Integer, Integer>();
        
        for(int i=0;i<s*2+p;i++){
            if(obj[i].value == "l"){
                sum++;
                
            }else if(obj[i].value == "r"){
                sum--;
                
            }else{
                arr.put(obj[i].key, sum);
                
            }
            
        }
                for(int i=0;i<p;i++){
            System.out.print(arr.get(points[i]));
            if(i!=p-1){
                System.out.print(" ");
            }
        }


    }

}

 class Apear{
  int key;
  String value;
  //Employee class constructor
  Apear(int key, String value){
     this.key = key;
     this.value = value;
  }
      public int getAge() {
        return key;
    }
            public String getName() {
        return value;
    }
}
