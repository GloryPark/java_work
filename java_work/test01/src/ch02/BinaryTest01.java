package ch02;

public class BinaryTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int bNum=0B1010;
		int oNum=012;
		int hNum=0XA;
		int bNum2=0B00000000000000000000000000000101;
		int bNum3=0B11111111111111111111111111111011;
	    // 양수에서 음수로 변경시 맨앞자리 + 1
		
		System.out.println(bNum3);
		System.out.println(bNum2);
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);

	}

}
