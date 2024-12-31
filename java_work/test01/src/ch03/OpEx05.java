package ch03;

import java.util.Scanner;

public class OpEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요");
		int score1=sc.nextInt();
		int score2=sc.nextInt();
		
		String result=((score1+score2)/2>=70)?"합격":"불합격";
		System.out.println(result);
		sc.close();

	}

}
