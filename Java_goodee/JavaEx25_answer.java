package com.javateam.jse;

import java.util.Scanner;

/**
 * n~m단까지 구구단 출력
 * 
 * @author javateam
 *
 */
public class JavaEx25_answer {

	public static void main(String[] args) {

		// 입력부
		// 조건부 : n<m, 2~9 사이 입력되도록 조치 ! => 재입력

		// 입력부
		Scanner sc = new Scanner(System.in);

		System.out.print("시작단 입력 : ");
		int startNum = sc.nextInt();

		System.out.print("끝단 입력 : ");
		int endNum = sc.nextInt();

		// ex1) 3~5단 (O)
		// ex2) 5~3단 (X)
		// ex3) -1~3단 (X)

		// 시작/끝단의 범위 점검 : 2~9 정수
		if ((startNum < 2 || startNum > 9) || (endNum < 2 || endNum > 9)) {

			System.out.println("2~9사이의 정수를 입력하십시오.");

		} else { // 2~9단

			// 시작단이 끝단보다 적은지 점검
			// ex) 3~5단
			if (startNum >= endNum) {

				System.out.println("시작단이 끝단보다 적어야 됩니다.");

			} else { // 정상

				System.out.printf("%d~%d단 출력%n", startNum, endNum);

				// 구구단 연산/출력
				for (int j = startNum; j <= endNum; j++) {

					for (int i = 1; i <= 9; i++) {
						System.out.printf("%d x %d = %d%n", j, i, j * i);
					} // i

					System.out.println("----------");
				} // j

			} // 시작단이 끝단보다 적은지 점검

		} // 시작/끝단의 범위 점검

		sc.close();

	} //

} //