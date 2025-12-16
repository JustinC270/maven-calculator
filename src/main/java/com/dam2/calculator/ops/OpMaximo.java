package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpMaximo {

    
    


    public static String run(String input) {
        int[] nums = ParserUtils.parseInts(input);
        if (nums == null) return "Error: formato inválido";
        if (nums.length < 2) return "Error: mete al menos 2 números";

        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return String.valueOf(max);
    }
}