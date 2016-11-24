/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg161123.fractionreducer;

import java.util.ArrayList;
import java.util.Scanner;


public class FractionReducer {

    public static void Reducer1(int d,int n,int x){
        if(x<=n){
            if((d%x)==0&&(n%x)==0){
                d=d/x;
                n=n/x;
                x=2;
                Reducer1(d,n,x);
            }else{
                x+=1;
                Reducer1(d,n,x);
            }
        }else{
            System.out.println("The answer is "+n+"/"+d);
        }
    }
    public static void Reducer2(int d,int n,int x){
        if(x<=d){
            if((d%x)==0&&(n%x)==0){
                d=d/x;
                n=n/x;
                x=2;
                Reducer2(d,n,x);
            }else{
                x+=1;
                Reducer2(d,n,x);
            }
        }else{
            if(d==1){
                System.out.println("The answer is "+n);
            }else{
            System.out.println("The answer is "+n+"/"+d);
            }
        }
        
    }
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int x=1;
            System.out.println("Please enter the numerator:");
            int n = input.nextInt();
            System.out.println("Please enter the denominator:");
            int d = input.nextInt();
            
            
           if(d>n){
               Reducer1(d,n,x);
           }else{
               Reducer2(d,n,x);
           }
           
           
            
    }
    
}
