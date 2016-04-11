package com.team11.week5;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import com.team11.week5.Calculator;
import com.team11.week5.InfoGetter;
import com.team11.week5.MainProgram;
import com.team11.week5.PlanRates;

public class PhoneBillTest {
	InfoGetter info;
	Calculator calc;
	
	@Test
	public void testGold() {
		info = new InfoGetter(new Scanner("Gold 1000 3" ));
		calc = new Calculator(info);
		assertNotNull(info.getNumberOfLines());
		assertNotNull(info.getMinutesUsed());
		assertEquals("Gold",info.getPlan());
		assertTrue(calc.setPlan(info.getPlan()));
		PlanRates planRates = calc.planRates;
		assertEquals(0, Double.compare(planRates.getBasicMonthlyRate(), 49.95));
		assertEquals(0, Double.compare(planRates.getAdditionalLineRate(), 14.50));
		assertEquals(planRates.getIncludedMinutes(), 1000);
		assertEquals(0, Double.compare(planRates.getRatePerExcessMinute(), 0.45));
		calc.sumTotalRate();

	}
	
	@Test
	public void testSilver(){
		info = new InfoGetter(new Scanner("Silver 1000 1" ));
		calc = new Calculator(info);
		assertEquals("Silver",info.getPlan());
		assertTrue(calc.setPlan(info.getPlan()));
		assertNotNull(info.getMinutesUsed());
		assertNotNull(info.getNumberOfLines());
		PlanRates planRates = calc.planRates;
		assertEquals(0, Double.compare(planRates.getBasicMonthlyRate(), 29.95));
		assertEquals(0, Double.compare(planRates.getAdditionalLineRate(), 21.50));
		assertEquals(planRates.getIncludedMinutes(), 500);
		assertEquals(0, Double.compare(planRates.getRatePerExcessMinute(), 0.54));
		calc.sumTotalRate();
	}
	
	@Test
	public void testOthers() {
		info = new InfoGetter(new Scanner("Silver 2000 5" ));
		calc = new Calculator(info);
		calc.sumTotalRate();
		assertFalse(calc.setPlan("bronze"));
		MainProgram.main(new String[]{"Gold", "1000", "3"});
		MainProgram.main(new String[]{"Gold", "1000", "3", "family"});
		MainProgram.main(new String[]{"Gold", "1000", "3", "family", "riot"});
	}

}
