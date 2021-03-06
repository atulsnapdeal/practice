package com.atul;

import java.util.NoSuchElementException;
import java.util.Objects;

public class MaxSum {

	public static void main(String[] args) {
		
		int[] array = {5, 5, 10, 100, 10, 5};
		maxsum(array);
	}

	private static int maxsum(int[] array){
		
		int dplength = array.length;
		int[] dp = new int[dplength];
		if(dplength == 0) {
			throw new NoSuchElementException();
		}
		else if(dplength == 1) {
			dp[0] = array[0];
			return dp[0];
		}
		else {
		    dp[0] = array[0];
			dp[1] = Math.max(array[0], array[1]);
			for(int i = 2; i <= dplength-1; i++) {
				dp[i] = Math.max(dp[i-1], Math.max(array[i],array[i]+dp[i-2]));
			}
			System.out.println(dp[dplength-1]);
			return dp[dplength-1];
				
			}
}
}
