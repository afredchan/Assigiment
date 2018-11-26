public class Rectangle extends Shape{
	private Point topLeft;
	private double length;
	private double width;
	
	public Rectangle(double length, double width, double x, double y){
		super("rectangle");
		this.length = length;
		this.width = width;
		topLeft = new Point(x, y);
	}
		
	public void setLength(double l){
		length = l;
	}
			
	public double getLength(){
		return length;
	}
    
	public void setWidth(double w){
		width = w;
	}
			
	public double getWidth(){
		return width;
	}
		
	public void setTopLeft(Point t){
		topLeft = t;
	}
					
	public Point getTopLeft(){
		return topLeft;
	}
		
	public String toString(){
		return "topLeft=" + topLeft.toString() + "; length=" + length + "; width=" + width;
	}
	
	public double getArea(){
		return length * width;
	}
}

