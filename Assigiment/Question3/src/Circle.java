public class Circle extends Shape{
	private Point center;
	private double radius;
	
	public Circle(double radius, double x, double y){
		super("circle");
		this.radius = radius;
		center = new Point(x, y);
	}
		
	public void setRadius(double r){
        radius = r;
	}

    public double getRadius(){
        return radius;
    }

    public void setCenter(Point c){
        center = c;
    }

    public Point getCenter(){
        return center;
    }

    public String toString(){
        return "center=" + center.toString() + "; radius=" + radius;
    }
    
	public double getArea(){
		return Math.PI * radius * radius;
	}
}
