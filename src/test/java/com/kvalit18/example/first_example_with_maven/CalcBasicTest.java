package com.kvalit18.example.first_example_with_maven;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class CalcBasicTest {
	CalcBasic myCalculator = new CalcBasic();

	
	@Test
	public void testAddition10times() {
		double oracle = 0;
		double random1 = 0.0;
		double random2 = 0.0;
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			random1 = r.nextDouble()*10;
			random2 = r.nextDouble()*10;
			oracle = random1 + random2;
			assertEquals(myCalculator.addition(random1, random2),oracle,0);	
			System.out.println("Testing addition method with " + random1 + " and "+ random2+" = "+oracle);
		}
		
		
		
	}



}
