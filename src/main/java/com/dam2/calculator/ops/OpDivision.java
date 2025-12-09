package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;
	public class OpDivision {

	    public static String run(String input) {
	    	int[] nums = ParserUtils.parseInts(input);
	    	int division =  1;
	    	for (int i = 0; i < nums.length; i++) {
				division/=nums[i];
			}
	        
	        if (nums == null) return "Error: formato inválido";
	        if (nums.length != 2) return "Error: division necesita exactamente 2 números";

	        return String.valueOf(nums[0] / nums[1]);
	    }

	}


