package com.company.bubbleSort;



public class BubbleSort <T extends Number>  {
//    public int length ;
//
//    public  BubbleSort(int len){
//        length=len ;
//    }
    CompairInterger CompInt=new CompairInterger() ;
    public  void bubbleSort(T[] arr ){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if( CompInt.Compair(arr[j],arr[j+1]) ) {
                    T temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp ;
                }


            }
        }

        System.out.print(" Bubble Sorted :[");
        for(int i=0;i< arr.length;i++){

            if(arr.length-1==i){
                System.out.print(arr[i]+"");
            }else{
                System.out.print(arr[i]+  " , ");
            }

        }
        System.out.print("]");
    }


}
