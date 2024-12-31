package ch04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner sc=new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month=sc.nextInt();
		
		if(month>=3 && month<=5)
			System.out.println("봄");
		else if(month>=6 && month<=8)
			System.out.println("여름");
		else if(month>=9 && month<=10)
			System.out.println("여름");
		else
			System.out.println("겨울");
		sc.close();
	}

}
