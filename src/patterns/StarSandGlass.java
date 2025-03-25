package patterns;

import java.util.Scanner;

public class StarSandGlass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 높이 입력받기 프로그램
		System.out.print("홀수인 정수의 높이 값을 입력하세요 : ");
		int heightTotal = sc.nextInt();
		int height = 0;
		// 홀수 검증
		if(heightTotal % 2 == 0) {
			System.out.println("홀수만 입력하세요.");
			return; // 조기 종료
		} else {
			height = (heightTotal + 1) / 2;

		}

		// 위쪽
		for (int i = 0; i < height; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < heightTotal - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 아래쪽
		for (int i = 1; i < height; i++) {
			for (int k = 0; k < (height - 1) - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
