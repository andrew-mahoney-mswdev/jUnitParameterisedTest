package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import mathematics.Mathematics;

@RunWith(value = Parameterized.class)
public class MultiplyTest {
	@Parameter(value = 0)
	public int x;
	
	@Parameter(value = 1)
	public int y;
	
	@Parameter(value = 2)
	public int z;
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = { {1, 2, 2}, 
							{2, 2, 4},
							{3, 5, 15},
						  };
		return Arrays.asList(data);
	}

	@Test
	public void testOfAddition() {
		assertEquals(new Mathematics().multiply(x, y), z);
	}
}
