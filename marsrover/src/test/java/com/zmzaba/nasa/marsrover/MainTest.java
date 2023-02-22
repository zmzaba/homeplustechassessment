package com.zmzaba.nasa.marsrover;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.zmzaba.nasa.marsrover.Main;
import com.zmzaba.nasa.marsrover.MarsRoverInputException;
import com.zmzaba.nasa.marsrover.Plateau;
import com.zmzaba.nasa.marsrover.Rover;

/**
 * Test class for Main.
 * 
 * @author zmzaba
 */
public class MainTest {

	/**
	 * +VE: Test for parse input, set plateau's co-ordinate, create rovers and
	 * navigate them.
	 */
	@Test
	public void initRovers() throws MarsRoverInputException {
		Main main = new Main();
		final String inputFile = "src/test/resources/input.txt";
		List<Rover> roverList = main.initRovers(inputFile);
		assertEquals(5, Plateau.getTop());
		assertEquals(5, Plateau.getRight());
		System.out.println("Size:" + roverList.size());
		assertTrue(roverList.size() == 2);
		main.navigateRovers(roverList);
	}

	/**
	 * -VE: Test with invalid plateau top/right
	 */
	@Test(expected = MarsRoverInputException.class)
	public void initRoverswithInvalidPlateauTopRightInput() throws MarsRoverInputException {
		final String inputFile = "src/test/resources/invalid-plateau-top-right-input.txt";
		new Main().initRovers(inputFile);
	}

	/**
	 * -VE: Invalid rover landing position input
	 */
	@Test(expected = MarsRoverInputException.class)
	public void initRoverswithInvliadRoverPositonInput() throws MarsRoverInputException {
		final String inputFile = "src/test/resources/invalid-rover-position-input.txt";
		new Main().initRovers(inputFile);
	}

	/**
	 * -VE: Invalid input file path
	 */
	@Test(expected = MarsRoverInputException.class)
	public void initRoverswithInputFileNotExists() throws MarsRoverInputException {
		final String inputFile = "src/test/resources/file-doesnt-exists.txt";
		new Main().initRovers(inputFile);
	}
	
}
