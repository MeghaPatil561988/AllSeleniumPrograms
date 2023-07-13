package com.Javaprograms;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,i,a=1;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		if(num==1) {
			System.out.println("smallest prime number is 2");
		}
		for(i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("prime");
				break;
			}
			else if(num==i) {
				System.out.println("notprime");
			}
		}

	}

}
