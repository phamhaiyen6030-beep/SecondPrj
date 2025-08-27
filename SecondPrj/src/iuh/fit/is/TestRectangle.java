
/**
 * @description This is the Rectangle description class
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
		System.out.print("Enter Length = ");
		double length =sc.nextDouble();
		Rectangle rectangle = new Rectangle(width,length);
		
		String headerline = String.format("%s\t%s\t%s\t%s\t", "Width","Length","Area","Perimeter");
		System.out.println(headerline);
		System.out.println(rectangle);
	}

}
