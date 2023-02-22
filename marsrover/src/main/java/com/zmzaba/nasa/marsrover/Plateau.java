package com.zmzaba.nasa.marsrover;

/**
 * Holds rectangular plateau's co-ordinates.
 * 
 * @author zmzaba
 */
public class Plateau {

	/**	Top co-ordinate */
	private static int top;
	
	/**	Right co-ordinate */
	private static int right;
	
	/**	Bottom co-ordinate */
	private static final int bottom = 0;
	
	/**	Left co-ordinate */
	private static final int left = 0;
	
	/**
	 * Private to avoid instantiation
	 */
	private Plateau() {}

	/**
	 * Method to set plateau's top-right co-ordinates.
	 * 
	 * @param top
	 * @param right
	 * @throws InvalidCoordinatesException if the given values are -ve
	 */
	public static void setTopRightCoordinates(int top, int right) throws InvalidCoordinatesException {
		if(top < 0 || right < 0) {
			throw new InvalidCoordinatesException("Invalid co-ordinates(top=" + top + ", right=" + right + "). Requires +VE vaues");
		}
		setTop(top);
		setRight(right);
	}

	/**
	 * Returns top co-ordinate
	 * 
	 * @return int
	 */
	public static int getTop() {
		return top;
	}

	/**
	 * Sets top co-ordinate
	 */
	public static void setTop(int top) {
		Plateau.top = top;
	}

	/**
	 * Returns right co-ordinate
	 * 
	 * @return int
	 */
	public static int getRight() {
		return right;
	}

	/**
	 * Sets right co-ordinate
	 */
	public static void setRight(int right) {
		Plateau.right = right;
	}

	/**
	 * Returns bottom co-ordinate. It is zero always.
	 * 
	 * @return int
	 */
	public static int getBottom() {
		return bottom;
	}

	/**
	 * Returns left co-ordinate. It is zero always.
	 * 
	 * @return int
	 */
	public static int getLeft() {
		return left;
	}

}