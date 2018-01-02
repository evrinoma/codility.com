package lesson3;

import java.util.*;

public class PermMissingElem {
	public static int solution(int[] A) {
		long summ = ((1 + (A.length + 1)) * (A.length + 1)) / 2;
		for (int i = 0; i < A.length; i++) {
			summ -= Integer.toUnsignedLong(A[i]);
		}
		return (int) (summ & 0x7fffffff);
	}

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 5 };
		System.out.println(solution(A));
		int[] B = { 2, 3, 1, 5, 4, 6, 8 };
		System.out.println(solution(B));
	}
}
