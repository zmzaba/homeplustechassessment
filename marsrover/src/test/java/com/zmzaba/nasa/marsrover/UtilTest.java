package com.zmzaba.nasa.marsrover;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.zmzaba.nasa.marsrover.Util;

/**
 * Test class for Util.
 *  
 * @author zmzaba
 */
public class UtilTest {

	private static final String INFILE = "src/test/resources/input.txt";
			
	private static FileReader fr = null;
	
	@BeforeClass
	public static void setUp() throws FileNotFoundException {
		fr = new FileReader(INFILE);
	}
	
	/**
	 * +VE: Test to close buffered reader's instance
	 */
	@Test
	public void closeBufferedReader() {
		BufferedReader br = new BufferedReader(fr);
		Util.closeBufferedReader(br);
	}

	@BeforeClass
	public static void tearDown() throws IOException {
		fr.close();
	}

}
