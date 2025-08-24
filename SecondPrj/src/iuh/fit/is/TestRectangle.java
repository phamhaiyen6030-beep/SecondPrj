
/**
 * @description This class represents a bank with many bank accounts
 * @author Pham Hai Yen
 * @version 1.0
 * @created Aug 24, 2025 1:49:21 PM
 */

package iuh.fit.is;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Width = ");
		double width=sc.nextDouble();
		System.out.print("Enter Height = ");
		double height =sc.nextDouble();
		Rectangle rectangle = new Rectangle(width,height);
		
		String headerline = String.format("%s\t%s\t%s\t%s\t", "Width","Height","Area","Perimeter");
		System.out.println(headerline);
		System.out.println(rectangle);
	}

}
