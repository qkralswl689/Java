package com.javateam.jse;

import java.util.Scanner;

/**
 * n~m�ܱ��� ������ ���
 * 
 * @author javateam
 *
 */
public class JavaEx25_answer {

	public static void main(String[] args) {

		// �Էº�
		// ���Ǻ� : n<m, 2~9 ���� �Էµǵ��� ��ġ ! => ���Է�

		// �Էº�
		Scanner sc = new Scanner(System.in);

		System.out.print("���۴� �Է� : ");
		int startNum = sc.nextInt();

		System.out.print("���� �Է� : ");
		int endNum = sc.nextInt();

		// ex1) 3~5�� (O)
		// ex2) 5~3�� (X)
		// ex3) -1~3�� (X)

		// ����/������ ���� ���� : 2~9 ����
		if ((startNum < 2 || startNum > 9) || (endNum < 2 || endNum > 9)) {

			System.out.println("2~9������ ������ �Է��Ͻʽÿ�.");

		} else { // 2~9��

			// ���۴��� ���ܺ��� ������ ����
			// ex) 3~5��
			if (startNum >= endNum) {

				System.out.println("���۴��� ���ܺ��� ����� �˴ϴ�.");

			} else { // ����

				System.out.printf("%d~%d�� ���%n", startNum, endNum);

				// ������ ����/���
				for (int j = startNum; j <= endNum; j++) {

					for (int i = 1; i <= 9; i++) {
						System.out.printf("%d x %d = %d%n", j, i, j * i);
					} // i

					System.out.println("----------");
				} // j

			} // ���۴��� ���ܺ��� ������ ����

		} // ����/������ ���� ����

		sc.close();

	} //

} //