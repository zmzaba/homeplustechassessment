package com.zmzaba.nasa.marsrover;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.zmzaba.nasa.marsrover.InvalidCoordinatesException;
import com.zmzaba.nasa.marsrover.Plateau;

/**
 * Test class for Plateau.
 *  
 * @author zmzaba
 */
public class PlateauTest {

	/**
	 * +VE: Set top & right coordinates
	 */
	@Test
	public void setTopRightCoordinates() {
		try {
			int top = 5;
			int right = 6;
			Plateau.setTopRightCoordinates(top, right);
			assertEquals(top, Plateau.getTop());
			assertEquals(right, Plateau.getRight());
			assertEquals(0, Plateau.getBottom());
			assertEquals(0, Plateau.getLeft());
		} catch (InvalidCoordinatesException e) {
			e.printStackTrace();
			fail("Test setTopRightCoordinates() failed!");
		}
	}

	/**
	 * +VE: Set top & right coordinates with 0, 0 respectively
	 */
	@Test
	public void setTopRightCoordinatesWithBothZero() {
		try {
			Plateau.setTopRightCoordinates(0, 0);
		} catch (InvalidCoordinatesException e) {
			e.printStackTrace();
			fail("Test setTopRightCoordinatesWithBothZero() failed!");
		}
	}

	/**
	 * -VE: Set top & right coordinates with top < 0
	 */
	@Test(expected = InvalidCoordinatesException.class)
	public void setTopRightCoordinatesWithTopLtZero() throws InvalidCoordinatesException{
		Plateau.setTopRightCoordinates(-3, 5);
		fail("Test setTopRightCoordinatesWithTopLtZero() failed!");
	}

	/**
	 * -VE: Set top & right coordinates with right < 0
	 */
	@Test(expected = InvalidCoordinatesException.class)
	public void setTopRightCoordinatesWithRighLtZero() throws InvalidCoordinatesException{
		Plateau.setTopRightCoordinates(3, -5);
		fail("Test setTopRightCoordinatesWithRighLtZero() failed!");
	}

}
