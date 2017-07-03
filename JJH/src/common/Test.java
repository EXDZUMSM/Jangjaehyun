package common;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[5];
		System.out.println(" 점수를 입력하세요. ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (j < arr.length && arr[i] > arr[j]) {
					int k = arr[i];
					arr[i] = arr[j];
					arr[j] = k;
				}
			}
		System.out.println(" 점수가 낮은 순서 -> " + arr[i] );
		}

	}
}
