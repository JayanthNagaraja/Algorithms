package org.example;

import java.util.Arrays;

public class Main {

    public static int recursiveBinarySearch(int []arr, int target, int start, int end){

        if(end >= 1){
            int mid = (start+end)/2;
            System.out.println("Mid is set to: "+arr[mid]);

            if(arr[mid] == target){
                System.out.println(target+" found at index: "+mid);
                return mid;
            }

            if(arr[mid] < target){
                System.out.println("Target is greater than mid, dividing post mid of array");
                return recursiveBinarySearch(arr, target, mid+1, end);
            }

            else{
                System.out.println("Target is lesser than mid, dividing prior mid of array");
                return recursiveBinarySearch(arr, target, start, mid-1);
            }

        }

        else{
            System.out.println("Target cannot be found as end is less than 1");
            return -1;
        }

    }

    public static int iterativeBinarySearch(int []arr, int target, int start, int end){

        while (start < end){

            int mid = (start + end)/2;
            System.out.println("Mid is set to: "+arr[mid]);

            if(arr[mid] == target){
                System.out.println(target+" found at index: "+mid);
                return mid;
            }

            if(arr[mid] < target){
                System.out.println("Target is greater than mid, dividing post mid of array");
                start = mid + 1;
            }

            else{
                System.out.println("Target is lesser than mid, dividing prior mid of array");
                end = mid -1;
            }

        }

        System.out.println("Target cannot be found as end is less than 1");
        return -1;

    }

    public static void main(String[] args) {
        int []arr = new int[]{1, 2, 3, 21, 43, 12};
        int start = 0, end = arr.length-1;

        recursiveBinarySearch(arr, 21, start, end);
        iterativeBinarySearch(arr, 21, start, end);

        Arrays.sort(arr);
        int res = Arrays.binarySearch(arr, 21);

        if(res >= 0){
            System.out.println("Target found at: "+res);
        }

        else{
            System.out.println("Target not found!");
        }

//        int []arr1 = new int[]{1};
//        int start1 = 0, end1 = arr1.length-1;
//        recursiveBinarySearch(arr1, 2, start1, end1);
//        iterativeBinarySearch(arr1, 2, start1, end1);
//        int res1 = Arrays.binarySearch(arr1, 1);
//        if(res1 >= 0){
//            System.out.println("Target found at: "+res1);
//        }
//        else{
//            System.out.println("Target not found!");
//        }

    }
}
