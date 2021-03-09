package Rectangle;

public class Rectangle {
	public int area(int length, int breadth) {
		if (length < 0 || breadth < 0) {
			return -1;
		}
		return breadth * length;
	}

	public int perimeter(int length, int breadth) {
		if (length < 0 || breadth < 0) {
			return -1;
		}
		return 2 * (breadth + length);
	}
}
