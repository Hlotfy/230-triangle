
public class Triangle {

	//Returns Triangle's Height
	public int getHeight() {
		return height;
	}

	//Returns Triangle's Width
	public int getWidth() {
		return width;
	}

	//Return's the area of the Triangle
	public int getArea() {
		return 0.5(width*height);
	}
	
	//Sets the Triangle's side length
	//If this is an equilateral triangle side length would always be width
	public void setSideLength(int sideL){
		this.width= sideL;
		//this.sideLength=sideL;
	}
	
	//Gets the Triangle's perimeter
	//if we can assume all triangles made will be equilateral,
	//then p=3w, otherwise pythagorean to find sides if isosceles triangle
	public int getPerimeter(){
		return 3*width;
		//return 2*sideLength+width;
	}
}
