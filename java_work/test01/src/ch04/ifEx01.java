package ch04;

public class ifEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if에 걸리는 문장이 있을경우 무조건 {} 넣기
		// if=true일떄 else+false 일때
		int score=80;
		if(score>70) {
			System.out.println(score);
			System.out.println("합격");
		}else {
			System.out.println("블합격");
			System.out.println("다시 도전하세요");
		}
		
		
		System.out.println("if문 벗어남");

	}

}
