package atm;

import java.util.Scanner;

public class Atm {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int moneyRemain = 0;
		int moneyInput = 0;
		int moneyOutput = 0;

		int num = 0;

		while (true) {
			System.out.println("------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료|");
			System.out.println("------------------------");

			System.out.print("선택> ");
			num = sc.nextInt();

			if (num == 1) {
				System.out.print("예금액>");
				moneyInput = sc.nextInt();
				if (moneyInput < 0) {
					System.out.print("오류" + "\n");
					continue;
				}
				moneyRemain += moneyInput;
			} else if (num == 2) {
				System.out.print("출금액>");
				moneyOutput = sc.nextInt();
				if (moneyOutput > moneyRemain) {
					System.out.print("오류" + "\n");
					continue;
				}
				moneyRemain -= moneyOutput;
			} else if (num == 3) {
				System.out.print("잔고>" + moneyRemain + "\n");
			} else {
				System.out.print("프로그램 종료");
				break;
			}
		}
	}
}
