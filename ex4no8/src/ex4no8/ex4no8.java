package ex4no8;

import java.util.Scanner;

public class ex4no8 {  // 152p
	public static void main(String[] args) {
		System.out.println("당신의 주민등록번호를 입력하세요.(112233-4444555)>");
		
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case 1 :
			System.out.println("당신은 남자입니다.");
			break;
		case 2 :
			System.out.println("당신은 여자입니다.");
			break;
		default :
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}
	}

}
