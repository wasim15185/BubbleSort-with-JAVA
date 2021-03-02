package com.company.bubbleSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.print("give the length of Array ");
        Scanner sc =new Scanner(System.in) ;
        int arrLength= sc.nextInt() ;

        BubbleSort <Integer> bubble= new BubbleSort<>() ;

        Integer arr[] = new Integer[arrLength] ;

        System.out.println("Give The Array Values");
        for(int i=0;i<arrLength;i++){

            int value = sc.nextInt();
            arr[i]=value;
        }

        System.out.print("Array Values are :[");
        for(int i=0;i<arrLength;i++){
          if(arrLength-1==i){
              System.out.print(arr[i]+"");
          } else{
              System.out.print(arr[i]+" , ");
          }

        }
        System.out.print("]");
        System.out.println(" ");

        bubble.bubbleSort(arr) ;

        
    }
}
