package com.jinpaihushi.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * 二分查找法
 * 
 * @author wangwt
 *
 */
public class BinaryChop {
	public static void main(String[] args) {
		Object[] arr = makeNonRepeatArr();
		int[] arr2 = makeNonRepeatArr2();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

	/**
	 * 生成随机不重复的数组
	 * 
	 * @return
	 */
	public static Object[] makeNonRepeatArr() {

		Object[] values = new Object[20];
		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < values.length; i++) {
			int number = random.nextInt(100) + 1;

			if (!list.contains(number)) {
				list.add(number);
			} else {
				i--;
			}
		}

		values = list.toArray();

		return values;

	}

	/**
	 * 生成随机不重复的数组
	 * 
	 * @return
	 */
	public static int[] makeNonRepeatArr2() {
		int[] values = new int[20];
		Random random = new Random();

		for (int i = 0; i < values.length; i++) {
			int number = random.nextInt(100) + 1;

			for (int j = 0; j <= i; j++) {
				if (number != values[j]) {
					values[i] = number;
				}
			}
		}
		return values;
	}

}
