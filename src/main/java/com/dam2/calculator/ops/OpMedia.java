package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpMedia {
	public static String run(String input) {
		if (input == null) System.out.println("Error: formato inválido");
		int [] nums = ParserUtils.parseInts(input);
		float suma = 0;
		for (int i = 0; i < nums.length; i++) {
			suma += nums[i];

		}
		suma =   suma / nums.length;
		String resultado =Float.toString(suma);
		return resultado;
	}
}
