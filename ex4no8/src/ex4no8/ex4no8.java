package ex4no8;

import java.util.Scanner;

public class ex4no8 {  // 152p
	public static void main(String[] args) {
		System.out.println("����� �ֹε�Ϲ�ȣ�� �Է��ϼ���.(112233-4444555)>");
		
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case 1 :
			System.out.println("����� �����Դϴ�.");
			break;
		case 2 :
			System.out.println("����� �����Դϴ�.");
			break;
		default :
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
	}

}
