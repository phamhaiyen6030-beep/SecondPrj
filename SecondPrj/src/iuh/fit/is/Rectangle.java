
/**
 * @description This is the Rectangle description class
 * @author Pham Hai Yen
 * @version 1.0
 * @created Aug 24, 2025 1:49:08 PM
 */

package iuh.fit.is;

public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
//		this.width=width;
//		this.height=height;
		setWidth(width);   // kiểm tra ở setter
        setHeight(height);
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height ;
	}
	
	
	public void setWidth(double width) {
		if (width < 0) {
			throw new IllegalArgumentException("Width value is not negative");
		}
		this.width = width;
	}
	
	
	public void setHeight(double height) {
		if (height<0) {
			throw new IllegalArgumentException("Height value is not negative");
		}
		this.height = height;
	}
	public double calcPerimeter() {
		return (width + height) * 2;
	}
	
	public double calcArea() {
		return (width * height) ;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f\t%.2f\t%.2f\t%.2f", width,height,calcArea(),calcPerimeter());
	}
	
	
	
	}
	
	
