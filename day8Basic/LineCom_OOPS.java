package day8Basic;

import java.util.Scanner;

public class LineCom_OOPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first co-ordinate  for x-axis of First Line");
		int x1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for x-axis of First Line");
		int x2 = sc.nextInt();
		System.out.println("Enter the first co-ordinate for y-axis of First Line");
		int y1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for y-axis of First Line");
		int y2 = sc.nextInt();
		System.out.println("Enter the first co-ordinate  for x-axis of second Line");

		int x3 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for x-axis of second Line");
		int x4 = sc.nextInt();
		System.out.println("Enter the first co-ordinate for y-axis of second Line");
		int y3 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for y-axis of second Line");
		int y4 = sc.nextInt();

		LineCom_OOPS lineCom_OOPS = new LineCom_OOPS();
		double lengthOfLine1 = lineCom_OOPS.findLentheofLine(x1, x2, y1, y2);
		System.out.println("The lenth of First Line is :" + lengthOfLine1);
		double lengthOfLine2 = lineCom_OOPS.findLentheofLine(x3, x4, y3, y4);
		System.out.println("The lenth second Line is :" + lengthOfLine2);
		lineCom_OOPS.compareToLine(lengthOfLine1, lengthOfLine2);
		sc.close();

	}

	double findLentheofLine(int x2, int y2, int x1, int y1) {

		double LengthofLine = Math.sqrt((x2 - x1) * Math.pow(2, 0) + (y2 - y1) * Math.pow(2, 0));

		System.out.println(LengthofLine);

		return LengthofLine;

	}

	public void compareToLine(double Line1, double Line2) {

		if (Line1 > Line2)
			System.out.println("Length of Line 1 is greater than the Length of Line 2");
		else if (Line1 < Line2)
			System.out.println("Length of Line 1 is lesser than the Length of Line 2");
		else
			System.out.println("Both the lines have equal length");

	}

}
