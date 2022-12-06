package com.JavaCore.Exception;

public class Runner {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try{
            for(int i = 0 ; i<= arr.length; i++){
                arr[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
    }
}
