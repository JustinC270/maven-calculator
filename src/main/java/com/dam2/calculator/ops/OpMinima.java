package com.dam2.calculator.ops;
 
import com.dam2.calculator.utils.ParserUtils;
 
public class OpMinima {
    public static String run(String input) {
 
        int[] nums = ParserUtils.parseInts(input);
        if (nums == null) return "Error: formato inválido";
        if (nums.length != 2) return "Error: minima necesita exactamente 2 números";
 
        int minimo = nums[0];
 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minimo) {
                minimo = nums[i];
            }
        }
 
        return String.valueOf(minimo);
    }
}
