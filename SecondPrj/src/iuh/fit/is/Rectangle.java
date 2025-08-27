
/**
 * @description This is the Rectangle description class
 * @author Pham Hai Yen
 * @version 1.0
 * @created Aug 24, 2025 1:49:08 PM
 */

package iuh.fit.is;

public class Rectangle {
	
	private double width;
	private double length ;
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double length) {
//		this.width=width;
//		this.height=height;
		setWidth(width);   // kiểm tra ở setter
        setLength(length);
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length ;
	}
	
	
	public void setWidth(double width) {
		if (width < 0) {
			throw new IllegalArgumentException("Width must be greater than 0");
		}
		this.width = width;
	}
	
	
	public void setLength(double length) {
		if (length<0) {
			throw new IllegalArgumentException("Length must be greater than 0");
		}
		this.length = length;
	}
	public double calcPerimeter() {
		return (width + length) * 2;
	}
	
	public double calcArea() {
		return (width * length) ;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f\t%.2f\t%.2f\t%.2f", width,length,calcArea(),calcPerimeter());
	}
	
	
	
	}
	
	
