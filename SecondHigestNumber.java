package com.song;

public class SecondHigestNumber {
	public static int getsecondlarjestno(int a[], int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++)

			{
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
	}

	public static void main(String[] args) {
		int p[] = { 12, 433, 424, 11, 67, 56 };
		System.out.println("second largest no: " + getsecondlarjestno(p, 6));
		// where 6 is array element that is size hai
	}
}
