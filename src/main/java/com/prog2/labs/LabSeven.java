package com.prog2.labs;

import java.util.ArrayList;

/**
 * @author adinashby
 *
 */

public class LabSeven {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {

	}

	/**
	 * Please refer to the README file for question(s) description
	 */

	public static int kthSmallestSubarraySum(int[] nums, int k) {  
            ArrayList<Integer> array = new ArrayList<>();
            
            int length = nums.length;
            for (int i = 0; i < length; i++) {
                for (int j = 0; true; j++) {
                    int sum = 0;
                    for (int l = 0; l <= i; l++) {
                        sum += nums[j + l];
                    }
                    array.add(sum);
                    if (((j + 1) + i) >= nums.length) {
                        break;
                    }
                }
            }
            
            for (int i = 0; i < array.size(); i++) {
                for (int j = 0; j < array.size() - 1; j++) {
                    if (array.get(i) < array.get(j)) {
                        int temp = array.get(i);
                        array.set(i, array.get(j));
                        array.set(j, temp);
                    }
                }
            }
            return array.get(k - 1);
	}
}
