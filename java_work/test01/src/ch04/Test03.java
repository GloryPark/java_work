package ch04;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		   문제: 음료수의 종류와 잔수를 입력받아 가격을 알려주는 작성하라
//		   1.에스프레소:2000
//		   2.아메리카노:2500
//		   3.카푸치노:3000
//		   4.카페라뗴:3500
		Scanner sc=new Scanner(System.in);
		System.out.println("음료의 종류를 입력하세요(1.에스프레소, 2.아메리카노,3.카푸치노,4.카페라떼)");
		int a=sc.nextInt();
		System.out.println("잔의 수를 입력해주세요");
		int b=sc.nextInt();
		int charge=0;
		if(a==1){
			System.out.println("에스프레소:");
			charge=2000*b;
		}else if(a==2) {
			System.out.println("아메리카:노");
			charge=2500*b;
		}else if(a==3) {
			System.out.println("카푸치노:");
			charge=3000*b;
		}else if(a==4) {
			System.out.println("카페라떼:");
			charge=3500*b;
		}else {
			System.out.println("잘못 입력했습니다");
		}
		System.out.println("금액은"+charge+"입니다!");
		sc.close();
		}
	
}


