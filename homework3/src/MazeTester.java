import java.util.*;
import java.io.*;

/**
 * MazeTester uses recursion to determine if a maze can be traversed.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class MazeTester
{
	/**
	 * Creates a new maze, prints its original form, attempts to
	 * solve it, and prints out its final form.
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of the file containing the maze: ");
		String filename = scan.nextLine();

		Maze labyrinth = new Maze(filename);
		System.out.println(labyrinth);

		System.out.print("Enter the starting position (two integers separated by a comma):");
		String startPointString = scan.nextLine();

		System.out.print("Enter the end position (two integers separated by a comma):");
		String endPointString = scan.nextLine();

		int[] startPoint = getIntArrayFromCommaSeparatedString(startPointString);
		int[] endPoint = getIntArrayFromCommaSeparatedString(endPointString);
		System.out.println("Start Point is x:" + startPoint[0] + " y:" + startPoint[1]);
		System.out.println("End Point is x:" + endPoint[0] + " y:" + endPoint[1]);
		

		MazeSolver solver = new MazeSolver(labyrinth);
		solver.setStartPoint(startPoint[0], startPoint[1]);
		solver.setEndPoint(endPoint[0], endPoint[1]);
		
		if (solver.traverse())
			System.out.println("The maze was successfully traversed!");
		else
			System.out.println("There is no possible path.");

		System.out.println(labyrinth);
		solver.printSolvedPath();
	}

	public static int[] getIntArrayFromCommaSeparatedString(String input) {
		input = input.replaceAll("\\s+",""); //delete white space
		String[] strArray = input.split(",");
		int[] intArray = new int[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}
}
