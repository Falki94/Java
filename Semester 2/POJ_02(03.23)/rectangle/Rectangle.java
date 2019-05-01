package rectangle;


public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    
    public double countPerimeter(){
        return this.length*2+this.width*2;
    }
    
    public double countSquare(){
        return this.length*this.width;
    }
    public double countDiagonal(){
        return Math.sqrt(length*length + width*width);
    }
    
}
