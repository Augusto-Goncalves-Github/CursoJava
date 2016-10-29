package com.dextraining.test;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calc = new Calculadora();
	
	@Test
	public void testarSoma(){
		Double resultado = calc.somar(5, 5);
		Assert.assertEquals(Double.valueOf(10), resultado);
	}
	
	@Test
	public void testarSubtracao(){
		Double resultado = calc.subtrair(5, 6);
		Assert.assertEquals(Double.valueOf(-1), resultado);		
	}

	@Test
	public void testarMultiplicacao(){
		Double resultado = calc.multiplicar(5, 5);
		Assert.assertEquals(Double.valueOf(25), resultado);
	}
	
	@Test
	public void testarDivisao(){
		Double resultado = calc.dividir(5, 5);
		Assert.assertEquals(Double.valueOf(1), resultado);
	}
}
