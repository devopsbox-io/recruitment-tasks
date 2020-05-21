package com.edelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StringTransformerTest 
{
	private StringTransformer stringTransformer; 
    
	@Before
	public void setup(){
	    	stringTransformer = StringTransformer.getInstance();
	}
	
    @Test
    public void getTransformedString_LessThan11Characters_ShouldReturnArgumentItself()
    {
    		String lessThan11CharacterString = "Almost11.";
    		assertEquals(lessThan11CharacterString, stringTransformer.getTransformedString(lessThan11CharacterString));
    }
    
    @Test
    public void getTransformedString_MoreThan10Characters_ShouldReturn10Characters()
    {
    		String moreThan10CharacterString = "MoreThan10Character.";
    		assertTrue(stringTransformer.getTransformedString(moreThan10CharacterString).length()==10);
    }
    
    @Test
    public void getTransformedString_DifferentArgument_ShouldReturnDifferentResult()
    {
    		String argument1 = "test-one-two-three";
    		String argument2 = "test-one-two-four";
    		assertNotEquals(stringTransformer.getTransformedString(argument1), stringTransformer.getTransformedString(argument2));
    }
    
    @Test
    public void getTransformedString_PreviousUsedArgument_ShouldReturnSameResult()
    {
    		String previousArgument = "test-one-two-three";
    		String previousArgumentResult = "481397277"; //crc32 using previousArgument
    		assertEquals(stringTransformer.getTransformedString(previousArgument), previousArgumentResult);
    }
}
