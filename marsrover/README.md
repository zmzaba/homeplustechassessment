## MARS ROVER - TECH CHALLENGE
 
A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This
plateau, which is curiously rectangular, must be navigated by the rovers so
that their on-board cameras can get a complete view of the surrounding
terrain to send back to Earth.
 
A rover's position and location is represented by a combination of x and y
co-ordinates and a letter representing one of the four cardinal compass
points. The plateau is divided up into a grid to simplify navigation. An
example position might be 0, 0, N, which means the rover is in the bottom
left corner and facing North.
 
In order to control a rover, NASA sends a simple string of letters. The
possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90
degrees left or right respectively, without moving from its current spot. 'M'
means move forward one grid point, and maintain the same heading.
 
Assume that the square directly North from (x, y) is (x, y+1).
 
 
### INPUT
 
The first line of input is the upper-right coordinates of the plateau, the
lower-left coordinates are assumed to be 0,0.
 
The rest of the input is information pertaining to the rovers that have been
deployed. Each rover has two lines of input. The first line gives the rover's
position, and the second line is a series of instructions telling the rover
how to explore the plateau.
 
The position is made up of two integers and a letter separated by spaces,
corresponding to the x and y co-ordinates and the rover's orientation.
 
Each rover will be finished sequentially, which means that the second rover
won't start to move until the first one has finished moving.
 
 
### OUTPUT

The output for each rover should be its final co-ordinates and heading. 
 
 
### INPUT AND OUTPUT EXAMPLE

Test Input:
 
 - 5 5
 - 1 2 N
 - LMLMLMLMM
 - 3 3 E
 - MMRMMRMRRM
 
Expected Output:
 
 - 1 3 N
 - 5 1 E
 
 
### OTHER ASSUMPTIONS
 
The assumption is made that if a rover has instructions to move outside the
plateau, it will perform the movement and warn the user. This decision was
based on the general principal that, since there were not clear business rules
on that, the system should act as a transparent process box, i.e. the users may
use it as they see fit.
 
## SOLUTION

The application Mars Rover is developed in Java.

System Requirements:-

1. Operating System : Any(Windows/Linux/Mac)
2. Java : JDK1.7
3. Build Tool: Maven
4. IDE used: Eclipse

How to run the application?

  This application can be easily run with any of your favourite IDEs like Netbeans, 
Eclipse or even command prompt. The main class(Main.java) is reside inside 
com.sakthi.nasa.marsrover package. We need to run this file to run the application

How to give an input?

  Input to this application is only a input file path

Unit Test cases:

  Unit test cases are available under marsrover/src/test/ path.

Assumptions
>   I have added enough test cases as much as possible. However, the co-ordinates must be
> in +ve values to get output as expected. Rovers always will be navigating inside the 
> boundary(such as left, bottom, top & right) of Plateau. While deploying rover on Plateau 
> if -ve/value beyond top/left co-ordinates of X or Y position are given, it will take 
> plateau's boundary value as X/Y.
