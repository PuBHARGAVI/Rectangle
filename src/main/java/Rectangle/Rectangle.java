package Rectangle;

public class Rectangle {
public int computeArea(int length,int breadth) {
	if(length<0 || breadth<0) {
		return -1;
	}
	return breadth*length;
	}
public int computePerimeter(int length,int breadth) {
	if(length<0 || breadth<0) {
		return -1;
	}
	return 2*(breadth+length);
	}
}