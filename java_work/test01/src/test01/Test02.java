package test01;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("영문 소문자를 입력하세요");
		String s=sc.next();
		char ch=s.charAt(0);
		
		System.out.println((char)(ch-32));
 
	}

}
