package com.atul;

public class MinDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		
		int[] array = {2,4,5,7,9};
		
		for(int i = 0;i < array.length -1; i++) {
			for(int j = i+1; j< array.length; j++) {
				if(Math.abs(array[i] - array[j]) < min) {
					min = Math.abs(array[i] - array[j]);
				}
			}
		}
		System.out.println(min);
		
		}

	}


