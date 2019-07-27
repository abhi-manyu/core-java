package com.general.array;

import java.util.Arrays;

public class Rough {

	public static void main(String[] args) {
		int[] arr={59,61,84,29,47};
		int[] new_arr=Arrays.copyOfRange(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(new_arr));

	}

}
