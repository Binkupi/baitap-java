package baitap3;

import java.util.Scanner;

public class sortArray {
	public static Scanner scanner = new Scanner(System.in);
	 
    public static void main(String[] args) {
        System.out.print("Nhap cac phan tu cua mang: ");
        int n = scanner.nextInt();
        // khoi tao mang arr
        int[] arr = new int[n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Cac phan tu cua mang da sap xep: ");
        sort(arr);
        show(arr);
    }
 
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int[] arr,int slot1, int slot2) {
    	int temp = arr[slot1];
        arr[slot1] = arr[slot2];
        arr[slot2] = temp;
    }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        	for(int j =i+1;j<arr.length;j++) {
        		if(arr[i]>arr[j]) {
        			swap(arr,i,j);
        		}
        	}
            
        }
    }
}
