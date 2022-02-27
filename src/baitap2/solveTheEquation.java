package baitap2;

import java.util.Scanner;

public class solveTheEquation {
	
	//giai phuong trinh
	public static void solve (float a, float b, float c) {
		double d =  Math.pow(b, 2) - 4*a*c;
		if(d<0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		else if(d==0) {
			float x = -b/2*a;
			System.out.println("Phuong trinh co 1 nghiem x: " + x);
		}else {
			double x1= (-b+Math.sqrt(d))/2*a;
			double x2= (-b-Math.sqrt(d))/2*a;
			System.out.println("Phuong trinh co nghiem x1: " + x1);
			System.out.println("Phuong trinh co nghiem x2: " + x2);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap a: ");
	    float a = sc.nextFloat();
	     
	    System.out.println("Nhap b: ");
	    float b = sc.nextFloat();
	    System.out.println("Nhap c: ");
	    float c = sc.nextFloat();
		solve(a,b,c);
		sc.close();
	}
}
