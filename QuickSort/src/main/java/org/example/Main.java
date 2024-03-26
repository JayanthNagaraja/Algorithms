package org.example;

public class Main {


    public static int partition(int []arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){

            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] =temp;

        System.out.println("Value of i: "+i);

        return i+1;

    }

    public static int[] quicksort(int []arr, int low, int high){

        System.out.println("Low: "+low+", High: "+high);

        if(low < high){
            int pivot = partition(arr, low, high);
            System.out.println("Pivot: "+pivot);

            quicksort(arr, low, pivot-1);
            quicksort(arr, pivot+1, high);
        }
        return arr;

    }

    public static void main(String[] args) {
        int []arr = new int[]{10, 40, 36, 5, 67, 2};
        int len = arr.length;

        int []result = quicksort(arr, 0, len-1);
        for(int p=0; p<result.length; p++){
            System.out.println(result[p]);
        }

    }
}